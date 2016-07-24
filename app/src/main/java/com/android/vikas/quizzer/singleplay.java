package com.android.vikas.quizzer;


import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class singleplay extends Activity implements View.OnClickListener{
    Activity activity;
    TextView tv1, tv2, topictv, questiontv, tv4;
    ImageView topic_image, question_image;
    MediaPlayer player,ranswer;
    ArrayList<String> qasked=new ArrayList<>();
    ArrayList<String> options=new ArrayList<>();
    int no_of_questions = 0,game_time=50,topic_questions,img,score,continuous,priority,correct_answers,longest_streak;
    String topic,question,correct_answer,option1,option2,option3;
    RelativeLayout rl1, rl2;
    SQLiteOpenHelper QuestionBank;
    SQLiteDatabase db;
    Cursor c;
    ArrayList<Button> optionbutton=new ArrayList<>();
    boolean timecount=false, game_finished=false,clickable=false;


    class timer extends AsyncTask<Void, Void, Void> {
        int i;
        @Override
        protected Void doInBackground(Void... r) {
            for (i = 3; i > 0; i--) {
                publishProgress();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            return null;
        }

        protected void onProgressUpdate(Void... r) {
            tv1.setText("" + i);
            ((Vibrator)getSystemService(VIBRATOR_SERVICE)).vibrate(100);
        }

        protected void onPostExecute(Void r) {
            tv1.setVisibility(View.GONE);
            startgame();
        }
    }

    class game_timer extends Thread {
        int color;
        public void run() {
            color=tv2.getCurrentTextColor();
            for (; game_time >= 0;) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv2.setText("Time: " + game_time);
                        if (game_time < 10) {
                            tv2.setTextColor(Color.RED);
                        }
                        else
                            tv2.setTextColor(color);

                        if(game_time<=0 && !game_finished) {
                            timecount=false;
                            activity.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Intent intent = new Intent(singleplay.this, SingleScorePage.class);
                                    intent.putExtra("No_of_Questions", no_of_questions);
                                    intent.putExtra("Correct_Answers", correct_answers);
                                    intent.putExtra("Score", score);
                                    intent.putExtra("Continuous", longest_streak);
                                    game_finished=true;
                                    c.close();
                                    startActivity(intent);
                                    finish();
                                    game_time=-1;
                                }
                            });
                        }

                        if(timecount)
                            game_time=game_time-1;
                    }
                });
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    class Score extends Thread {

        public void run() {
            int i = 0;
            while (i <= continuous * 50) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv4.setText("Score: " +score);
                        score = score + 10;
                    }
                });
                i = i + 10;
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    class Time extends Thread
    {int change;
        public void run()
        {
            int i=0;
            if (continuous==0)
                change=12;
            else
                change=5*(int)Math.ceil(continuous*0.5);
            while (i <= change) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv2.setText("Time: " +game_time);
                        if(continuous==0 && game_time>=1)
                            game_time= game_time - 1;
                        else if(game_time<=99 )
                            game_time+=1;
                        if(game_time==0 && !game_finished)
                        {
                            activity.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Intent intent = new Intent(singleplay.this, SingleScorePage.class);
                                    intent.putExtra("No_of_Questions", no_of_questions);
                                    intent.putExtra("Correct_Answers", correct_answers);
                                    intent.putExtra("Score", score);
                                    intent.putExtra("Continuous", longest_streak);
                                    game_finished=true;
                                    c.close();
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                    }
                });
                i = i + 1;
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    class ImageFade extends AsyncTask<Void,Void,Void> {
        float i = 0;

        public Void doInBackground(Void...r) {
            while (i <= 1) {
                publishProgress();
                try {
                    Thread.sleep(20);
                    i = i + (float) 0.01;
                } catch (InterruptedException e) {
                }
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

            while (i >= 0) {
               publishProgress();
                try {
                    Thread.sleep(10);
                    i = i - (float) 0.01;
                } catch (InterruptedException e) {
                }
            }
         return null;
        }
        public void onProgressUpdate(Void... r)
        {
            topic_image.setAlpha(i);
        }

        public void onPostExecute(Void r)
        {

            topic_image.setVisibility(View.GONE);
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException e){}
            gamequestion();
        }
    }

    class QuestionFadeIn extends AsyncTask<Void,Void,Void>
    {
        float alpha=0;
        public Void doInBackground(Void... r)
        {
            while (alpha <= 1) {
                publishProgress();
                try {
                    Thread.sleep(20);
                    alpha = alpha + (float) 0.02;
                } catch (InterruptedException e) {
                }
            }
            return null;
        }
        public void onProgressUpdate(Void... r)
        {
            questiontv.setAlpha(alpha);
            question_image.setAlpha(alpha);
        }
        public void onPostExecute(Void r)
        {
            try
            {
                Thread.sleep(500);
                timecount=true;
            }
            catch (InterruptedException e){}
            new ButtonFadeIn(optionbutton.get(0)).execute();
        }
    }

    class ButtonFadeIn extends AsyncTask<Void,Void,Void>
    {
        float alpha;
        Button button;
        public ButtonFadeIn (Button button)
        {
            this.button=button;
        }
        public Void doInBackground(Void... r)
        {
            while (alpha <= 1) {
                publishProgress();
                try {
                    Thread.sleep(10);
                    alpha = alpha + (float) 0.02;
                } catch (InterruptedException e) {
                }
            }
            return null;
        }
        public void onProgressUpdate(Void... r)
        {
            button.setAlpha(alpha);
        }
        public void onPostExecute(Void r)
        {
            if (optionbutton.indexOf(button)!=3) {
                new ButtonFadeIn(optionbutton.get(optionbutton.indexOf(button)+1)).execute();
            }
            else
            {
                clickable=true;
            }
        }
    }

    class ButtonFadeOut extends AsyncTask<Void,Void,Void>
    {
        float alpha=1;
        public Void doInBackground(Void... r)
        {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
            }
            while (alpha >=0) {
                publishProgress();
                try {
                    Thread.sleep(30);
                    alpha = alpha - (float) 0.02;
                } catch (InterruptedException e) {
                }
            }
            return null;
        }
        public void onProgressUpdate(Void... r)
        {
            optionbutton.get(0).setAlpha(alpha);
            optionbutton.get(1).setAlpha(alpha);
            optionbutton.get(2).setAlpha(alpha);
            optionbutton.get(3).setAlpha(alpha);
            questiontv.setAlpha(alpha);
            question_image.setAlpha(alpha);
        }

        public void onPostExecute(Void r)
        {
            optionbutton.get(0).setBackgroundResource(R.drawable.option_1);optionbutton.get(0).setVisibility(View.GONE);
            optionbutton.get(1).setBackgroundResource(R.drawable.option_1);optionbutton.get(1).setVisibility(View.GONE);
            optionbutton.get(2).setBackgroundResource(R.drawable.option_1);optionbutton.get(2).setVisibility(View.GONE);
            optionbutton.get(3).setBackgroundResource(R.drawable.option_1);optionbutton.get(3).setVisibility(View.GONE);
            questiontv.setVisibility(View.GONE);
            question_image.setVisibility(View.GONE);
            img=-1;
            gamepic();
        }
    }


    public void onCreate(Bundle savedInstancestate)
    {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_singleplay);
        activity=new Activity();

        topic_image=(ImageView)findViewById(R.id.iv1);
        question_image=(ImageView)findViewById(R.id.question_image);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv4=(TextView)findViewById(R.id.tv4);
        topictv=(TextView)findViewById(R.id.tv3);

        questiontv=(TextView)findViewById(R.id.questiontv);

        rl1=(RelativeLayout)findViewById(R.id.rl1);
        rl2=(RelativeLayout)findViewById(R.id.rl2);
        rl2.setVisibility(View.GONE);
        rl2.setKeepScreenOn(true);

        player=MediaPlayer.create(this,R.raw.backmusic);
        player.setLooping(true);
        player.start();
        ranswer=MediaPlayer.create(this,R.raw.ka_ching);

        optionbutton.add((Button) findViewById(R.id.b1));
        optionbutton.get(0).setVisibility(View.GONE);
        optionbutton.get(0).setOnClickListener(this);
        optionbutton.add((Button) findViewById(R.id.b2));
        optionbutton.get(1).setVisibility(View.GONE);
        optionbutton.get(1).setOnClickListener(this);
        optionbutton.add((Button) findViewById(R.id.b3));
        optionbutton.get(2).setVisibility(View.GONE);
        optionbutton.get(2).setOnClickListener(this);
        optionbutton.add((Button) findViewById(R.id.b4));
        optionbutton.get(3).setVisibility(View.GONE);
        optionbutton.get(3).setOnClickListener(this);

        QuestionBank = new QuestionBank(this);
        db = QuestionBank.getReadableDatabase();

        new timer().execute();
    }

    public void startgame()
    {
        rl2.setVisibility(View.VISIBLE);
        RelativeLayout.LayoutParams par=new RelativeLayout.LayoutParams(rl1.getWidth() /3, RelativeLayout.LayoutParams.MATCH_PARENT);
        par.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        rl2.setLayoutParams(par);
        topic_image.getLayoutParams().width= rl1.getWidth()-(int)(rl1.getWidth()/(float)3);
        topic_image.setVisibility(View.GONE);
        question_image.getLayoutParams().height=(int)(rl1.getHeight()*0.32);
        question_image.getLayoutParams().width=(int)(rl1.getWidth()*0.2375);
        questiontv.setVisibility(View.GONE);
        questiontv.getLayoutParams().width=rl1.getWidth()-(rl1.getWidth()/3);
        game_timer gt=new game_timer();
        gt.start();
        gamepic();
    }

    public void gamepic()
    {

        if(continuous>longest_streak)
            longest_streak=continuous;

        if(no_of_questions==20 && extra_values.topics.size()<=3 && !extra_values.topics.get(0).equals("All Topics Quz"))
        {
            Intent intent=new Intent(this,SingleScorePage.class);
            intent.putExtra("No_of_Questions",no_of_questions);
            intent.putExtra("Correct_Answers",correct_answers);
            intent.putExtra("Score",score);
            intent.putExtra("Continuous",continuous);
            c.close();
            startActivity(intent);
            finish();
        }

        else if(no_of_questions==30 && (extra_values.topics.size()>3||extra_values.names.get(0).equals("All Topics Quiz")))
        {
            Intent intent=new Intent(this,SingleScorePage.class);
            intent.putExtra("No_of_Questions",no_of_questions);
            intent.putExtra("Correct_Answers",longest_streak);
            intent.putExtra("Score",score);
            intent.putExtra("Continuous",longest_streak);
            c.close();
            startActivity(intent);
            finish();
        }

        else if(!game_finished) {
            int check = 0;
            try {
                if (extra_values.topics.get(0).equals("All Topics Quiz")) {
                    check = 1;
                    extra_values.topics.clear();
                    extra_values.topics.add("Politics");
                    extra_values.topics.add("World leaders");
                    extra_values.topics.add("Map Freaks");
                    extra_values.topics.add("IQ Test");
                    extra_values.topics.add("Physics");
                    extra_values.topics.add("Maths");
                    extra_values.topics.add("Astronomy");
                    extra_values.topics.add("Computer");
                    extra_values.topics.add("Pottermore");
                    extra_values.topics.add("Hollywood");
                    extra_values.topics.add("Sherlock");
                    extra_values.topics.add("Breaking Bad");
                    extra_values.topics.add("Game of Thrones");
                    extra_values.topics.add("Suits");
                    extra_values.topics.add("House");
                    extra_values.topics.add("Football");
                    extra_values.topics.add("Cricket");
                    extra_values.topics.add("Tennis");
                    extra_values.topics.add("Word Play");
                    extra_values.topics.add("Basic Maths");
                }
                topic = extra_values.topics.get((int) (Math.random() * extra_values.topics.size()));
                c = db.query("Quiz_topics", new String[]{"TOTAL"}, "TOPIC=?", new String[]{topic}, null, null, null);

                no_of_questions++;
                topictv.setText("Question " + no_of_questions + "\n" + topic);


                c = db.query("Quiz_topics", new String[]{"IMG_RESOURCE", "TOTAL"}, "TOPIC=?", new String[]{topic}, null, null, null);
                if (c.moveToFirst()) {
                    topic_image.setVisibility(View.VISIBLE);
                    topic_image.setAlpha((float) 0);
                    topic_image.setImageResource(c.getInt(0));
                    topic_questions = c.getInt(1);
                    new ImageFade().execute();
                }
                c.close();
                if (check == 1) {
                    extra_values.topics.clear();
                    extra_values.topics.add("All Topics Quiz");
                }
            } catch (SQLiteException e) {
                Toast.makeText(this, "Error" + topic + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void gamequestion()
    {
        int i=0;
        boolean b=false;

        while(!b) {
            try {
                c = db.query("'" + topic + "'", new String[]{"QUESTION", "CORRECT_ANSWER", "OPTION_1", "OPTION_2", "OPTION_3", "PRIORITY", "IMG_RESOURCE"}, "_id=?", new String[]{Integer.toString((int) (Math.random() * topic_questions + 1))}, null, null, null);
                if (c.moveToFirst()) {
                    question = "" + c.getString(0);
                    if ((c.getInt(5) == 1 || i>=3) && !qasked.contains(question)) {
                        qasked.add(question);
                        correct_answer = "" + c.getString(1);
                        option1 = "" + c.getString(2);
                        option2 = "" + c.getString(3);
                        option3 = "" + c.getString(4);
                        options.add(correct_answer);options.add(option1);options.add(option2);options.add(option3);
                        priority=c.getInt(5);
                        img = c.getInt(6);
                        b=true;

                        questiontv.setVisibility(View.VISIBLE);
                        questiontv.setAlpha(0);
                        questiontv.setText(question);
                        questiontv.setTextSize((float)0.032*rl1.getHeight());


                        RelativeLayout.LayoutParams params1=new RelativeLayout.LayoutParams((int)(0.26*rl1.getWidth()),(int)(0.19*rl1.getHeight()));
                        RelativeLayout.LayoutParams params2=new RelativeLayout.LayoutParams((int)(0.26*rl1.getWidth()),(int)(0.19*rl1.getHeight()));


                        params1.setMargins((int)(0.03125*rl1.getWidth()), 40, 0, 0);
                        params1.addRule(RelativeLayout.BELOW, R.id.questiontv);

                        optionbutton.get(0).setLayoutParams(params1);
                        optionbutton.get(0).setTextSize((float) 0.014 * rl1.getWidth());
                        optionbutton.get(0).setText(options.get((int) (Math.random() * 4)));options.remove(optionbutton.get(0).getText());
                        optionbutton.get(0).setVisibility(View.VISIBLE);
                        optionbutton.get(0).setAlpha(0);

                        params2.setMargins((int) (0.0859 * rl1.getWidth()), 40, 0, 0);
                        params2.addRule(RelativeLayout.BELOW, R.id.questiontv);
                        params2.addRule(RelativeLayout.RIGHT_OF, R.id.b1);

                        optionbutton.get(1).setLayoutParams(params2);
                        optionbutton.get(1).setTextSize((float) 0.014 * rl1.getWidth());
                        optionbutton.get(1).setText(options.get((int) (Math.random() * 3)));options.remove(optionbutton.get(1).getText());
                        optionbutton.get(1).setVisibility(View.VISIBLE);
                        optionbutton.get(1).setAlpha(0);

                        optionbutton.get(2).getLayoutParams().width=(int)(0.26*rl1.getWidth());
                        optionbutton.get(2).getLayoutParams().height=(int)(0.19*rl1.getHeight());
                        optionbutton.get(2).setTextSize((float) 0.014 * rl1.getWidth());
                        optionbutton.get(2).setText(options.get((int) (Math.random() * 2)));options.remove(optionbutton.get(2).getText());
                        ((ViewGroup.MarginLayoutParams)optionbutton.get(2).getLayoutParams()).setMargins((int)(0.03125*rl1.getWidth()), (int)(0.0555*rl1.getHeight()), 0, 0);
                        optionbutton.get(2).requestLayout();
                        optionbutton.get(2).setVisibility(View.VISIBLE);
                        optionbutton.get(2).setAlpha(0);

                        optionbutton.get(3).getLayoutParams().width=(int)(0.26*rl1.getWidth());
                        optionbutton.get(3).getLayoutParams().height=(int)(0.19*rl1.getHeight());
                        optionbutton.get(3).setTextSize((float) 0.014 * rl1.getWidth());
                        optionbutton.get(3).setText(options.get(0));options.remove(optionbutton.get(3).getText());
                        ((ViewGroup.MarginLayoutParams)optionbutton.get(3).getLayoutParams()).setMargins((int)(0.0859*rl1.getWidth()), (int)(0.0555*rl1.getHeight()), 0, 0);
                        optionbutton.get(2).requestLayout();
                        optionbutton.get(3).setVisibility(View.VISIBLE);
                        optionbutton.get(3).setAlpha(0);

                        if(img!=-1)
                        {
                            question_image.setImageResource(img);
                            question_image.setVisibility(View.VISIBLE);
                            question_image.setAlpha((float) 0);
                            params1.addRule(RelativeLayout.BELOW, R.id.question_image);
                            params1.setMargins((int)(0.03125*rl1.getWidth()), (int)(0.04861*rl1.getHeight()), 0, 0);
                            optionbutton.get(0).setLayoutParams(params1);

                            ((ViewGroup.MarginLayoutParams)optionbutton.get(2).getLayoutParams()).setMargins((int)(0.03125*rl1.getWidth()), (int)(0.01388*rl1.getHeight()), 0, 0);
                            optionbutton.get(1).requestLayout();

                            params2.addRule(RelativeLayout.BELOW, R.id.question_image);
                            params2.setMargins((int)(0.0859*rl1.getWidth()), (int)(0.04861*rl1.getHeight()), 0, 0);
                            optionbutton.get(1).setLayoutParams(params2);

                            ((ViewGroup.MarginLayoutParams)optionbutton.get(3).getLayoutParams()).setMargins((int)(0.0859*rl1.getWidth()), (int)(0.01388*rl1.getHeight()), 0, 0);
                            optionbutton.get(2).requestLayout();
                        }
                    }
                    else
                        i=i+1;
                }
                c.close();
            } catch (SQLiteException e) {
                Toast.makeText(this, "Error" + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        new QuestionFadeIn().execute();
    }

    public void onClick(View v)
    {
        Button b=(Button)v;
        if(clickable) {
            if (b.getText().equals(correct_answer)) {
                ranswer.start();
                b.setBackgroundResource(R.drawable.option_3);
                timecount=false;
                continuous+=1;
                Time thread=new Time();
                thread.start();
                clickable=false;
                Score thread1=new Score();
                correct_answers+=1;
                thread1.start();
                ContentValues cv = new ContentValues();
                ContentValues cv1=new ContentValues();
                cv.put("PRIORITY", 2);
                c=db.query("Quiz_topics", new String[]{"COMPLETION"}, "TOPIC=?", new String[]{topic}, null, null, null);
                if(c.moveToFirst() && priority==1)
                {
                    cv1.put("COMPLETION",c.getInt(0)+1);
                    db.update("Quiz_topics", cv1, "TOPIC=?", new String[]{topic});
                }
                db.update("'" + topic + "'", cv, "QUESTION=?", new String[]{question});
                c.close();
            }
            else
            {
                for(Button right: optionbutton) {
                    if (right.getText().equals(correct_answer)) {
                        right.setBackgroundResource(R.drawable.option_3);
                    }
                }
                b.setBackgroundResource(R.drawable.option_2);
                clickable=false;
                continuous=0;
                Time thread=new Time();
                thread.start();
                timecount=false;
                ((Vibrator)getSystemService(VIBRATOR_SERVICE)).vibrate(600);
                ((Vibrator)getSystemService(VIBRATOR_SERVICE)).vibrate(600);

            }
            new ButtonFadeOut().execute();
        }
    }

    public void onStop()
    {
        try
        {
            c.close();
        }
        catch (Exception e){}
        super.onStop();
        player.stop();
        finish();
    }
}


