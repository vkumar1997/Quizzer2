package com.android.vikas.quizzer;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Vibrator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class clientplay extends Activity implements View.OnClickListener{
    BufferedReader inputStream;
    PrintWriter writer;
    MediaPlayer mp,ranswer;
    Activity activity;
    TextView tv1, tv2, topictv, questiontv, tv4;
    int no_of_questions = 0,game_time=25,topic_questions,img,score,continuous,priority,time_of_answer;;
    boolean timecount=true, game_finished=false, increase_score=false, decrease_score=false,clickable=false, continue_time=false;
    String topic,question,correct_answer,option1,option2,option3;
    ImageView topic_image, question_image;
    RelativeLayout rl1, rl2;
    ArrayList<Button> optionbutton=new ArrayList<>();
    ArrayList<String> qasked=new ArrayList<>();
    ArrayList<String> options=new ArrayList<>();
    SQLiteOpenHelper QuestionBank;
    SQLiteDatabase db;
    Cursor c;

    class thread1 extends AsyncTask<Void, Void, Void>{
        int type;

        thread1(int i)
        {
            type=i;
        }
        public Void doInBackground(Void...r)
        {
            try {
                if(type==1)
                    inputStream.readLine();
                if(type==2)
                    topic = inputStream.readLine();
                if(type==3)
                    question=inputStream.readLine();
                if(type==4)
                    inputStream.readLine();
                if(type==5) {
                    int total = Integer.parseInt(inputStream.readLine());
                    for(int i=1;i<=total*2;i++)
                    {
                        extra_values.names.add(inputStream.readLine());
                        extra_values.positions.add(Integer.parseInt(inputStream.readLine()));
                    }
                }
            }
            catch (IOException e){}
           return null;
        }

        public void onPostExecute(Void r)
        {
            if(type==1) {
                tv1.setTextSize(80);
                new timer().execute();
            }

            if(type==2)
            {
                gamepic();
            }

            if(type==3)
            {
                gamequestion();
            }
            if(type==4)
            {
                for (Button right : optionbutton) {
                    if (right.getText().equals(correct_answer)) {
                        right.setBackgroundResource(R.drawable.option_3);
                    }
                }
                continuous = 0;

                timecount = true;
                ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(600);
                ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(600);
                new ButtonFadeOut().execute();
            }
            if(type==5)
            {
                Intent intent=new Intent(clientplay.this,ScorePage.class);
                intent.putExtra("Score",score);
                c.close();
                startActivity(intent);
                finish();
            }
        }

    }

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
                        if(timecount) {
                            tv2.setText("Time   " + game_time);
                            if (game_time < 10) {
                                tv2.setTextColor(Color.RED);
                            } else
                                tv2.setTextColor(color);
                            if (game_time <= 0) {
                                continue_time=false;
                                game_time=25;
                                if(clickable) {
                                    clickable = false;
                                    writer.println("true");
                                    writer.flush();
                                    new thread1(4).execute();
                                }
                            }
                            if (continue_time)
                                game_time = game_time - 1;
                        }
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
            while (i <=time_of_answer * continuous * 2) {
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
            new thread1(3).execute();
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
                continue_time=true;
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
            startgame2();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleplay);

        mp=MediaPlayer.create(this,R.raw.backmusic);
        mp.setLooping(true);
        mp.start();
        ranswer=MediaPlayer.create(this,R.raw.ka_ching);

        activity=new Activity();

        tv1=(TextView)findViewById(R.id.tv1);
        tv1.setText("Waiting for the host");
        tv1.setTextSize(25);
        topic_image=(ImageView)findViewById(R.id.iv1);
        question_image=(ImageView)findViewById(R.id.question_image);
        tv2=(TextView)findViewById(R.id.tv2);
        tv4=(TextView)findViewById(R.id.tv4);
        topictv=(TextView)findViewById(R.id.tv3);

        questiontv=(TextView)findViewById(R.id.questiontv);

        rl1=(RelativeLayout)findViewById(R.id.rl1);
        rl2=(RelativeLayout)findViewById(R.id.rl2);
        rl2.setVisibility(View.GONE);
        rl2.setKeepScreenOn(true);
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


        try {
            inputStream =new BufferedReader(new InputStreamReader(npvalue.clientside.getInputStream()));
            writer=new PrintWriter(npvalue.clientside.getOutputStream());
        }
        catch (IOException e){}
        if(npvalue.clientside.isConnected()) {

            new thread1(1).execute();
        }
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
        startgame2();
    }

    public void startgame2()
    {
        if(no_of_questions==15)
        {
            writer.println(BluetoothAdapter.getDefaultAdapter().getName());
            writer.flush();
            writer.println(String.valueOf(score));
            writer.flush();
            new thread1(5).execute();
        }
        else {
            if (npvalue.clientside.isConnected()) {

                new thread1(2).execute();
            }
        }
    }

    public void gamepic()
    {
        try
        {
            no_of_questions++;
            topictv.setText("Question " + no_of_questions+"\n"+topic);


            c = db.query("Quiz_topics", new String[]{"IMG_RESOURCE","TOTAL"}, "TOPIC=?", new String[]{topic}, null, null, null);
            if (c.moveToFirst()) {
                topic_image.setVisibility(View.VISIBLE);
                topic_image.setAlpha((float) 0);
                topic_image.setImageResource(c.getInt(0));
                topic_questions=c.getInt(1);
                new ImageFade().execute();
            }
            c.close();
        }
        catch (SQLiteException e) {
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }
    }

    public void gamequestion()
    {
        try {
            c = db.query("'" + topic + "'", new String[]{"QUESTION", "CORRECT_ANSWER", "OPTION_1", "OPTION_2", "OPTION_3", "PRIORITY", "IMG_RESOURCE"}, "QUESTION=?", new String[]{question}, null, null, null);
        }
        catch (SQLiteException e){}
        if(c.moveToFirst()) {
            qasked.add(question);
            correct_answer = "" + c.getString(1);
            option1 = "" + c.getString(2);
            option2 = "" + c.getString(3);
            option3 = "" + c.getString(4);
            options.add(correct_answer);
            options.add(option1);
            options.add(option2);
            options.add(option3);
            priority=c.getInt(5);
            img = c.getInt(6);
            questiontv.setVisibility(View.VISIBLE);
            questiontv.setAlpha(0);
            questiontv.setText(question);
            questiontv.setTextSize((float) 0.032 * rl1.getHeight());


            RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams((int) (0.26 * rl1.getWidth()), (int) (0.19 * rl1.getHeight()));
            RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams((int) (0.26 * rl1.getWidth()), (int) (0.19 * rl1.getHeight()));


            params1.setMargins((int) (0.03125 * rl1.getWidth()), 40, 0, 0);
            params1.addRule(RelativeLayout.BELOW, R.id.questiontv);

            optionbutton.get(0).setLayoutParams(params1);
            optionbutton.get(0).setTextSize((float) 0.014 * rl1.getWidth());
            optionbutton.get(0).setText(options.get((int) (Math.random() * 4)));
            options.remove(optionbutton.get(0).getText());
            optionbutton.get(0).setVisibility(View.VISIBLE);
            optionbutton.get(0).setAlpha(0);

            params2.setMargins((int) (0.0859 * rl1.getWidth()), 40, 0, 0);
            params2.addRule(RelativeLayout.BELOW, R.id.questiontv);
            params2.addRule(RelativeLayout.RIGHT_OF, R.id.b1);

            optionbutton.get(1).setLayoutParams(params2);
            optionbutton.get(1).setTextSize((float) 0.014 * rl1.getWidth());
            optionbutton.get(1).setText(options.get((int) (Math.random() * 3)));
            options.remove(optionbutton.get(1).getText());
            optionbutton.get(1).setVisibility(View.VISIBLE);
            optionbutton.get(1).setAlpha(0);

            optionbutton.get(2).getLayoutParams().width = (int) (0.26 * rl1.getWidth());
            optionbutton.get(2).getLayoutParams().height = (int) (0.19 * rl1.getHeight());
            optionbutton.get(2).setTextSize((float) 0.014 * rl1.getWidth());
            optionbutton.get(2).setText(options.get((int) (Math.random() * 2)));
            options.remove(optionbutton.get(2).getText());
            ((ViewGroup.MarginLayoutParams) optionbutton.get(2).getLayoutParams()).setMargins((int) (0.03125 * rl1.getWidth()), (int) (0.0555 * rl1.getHeight()), 0, 0);
            optionbutton.get(2).requestLayout();
            optionbutton.get(2).setVisibility(View.VISIBLE);
            optionbutton.get(2).setAlpha(0);

            optionbutton.get(3).getLayoutParams().width = (int) (0.26 * rl1.getWidth());
            optionbutton.get(3).getLayoutParams().height = (int) (0.19 * rl1.getHeight());
            optionbutton.get(3).setTextSize((float) 0.014 * rl1.getWidth());
            optionbutton.get(3).setText(options.get(0));
            options.remove(optionbutton.get(3).getText());
            ((ViewGroup.MarginLayoutParams) optionbutton.get(3).getLayoutParams()).setMargins((int) (0.0859 * rl1.getWidth()), (int) (0.0555 * rl1.getHeight()), 0, 0);
            optionbutton.get(2).requestLayout();
            optionbutton.get(3).setVisibility(View.VISIBLE);
            optionbutton.get(3).setAlpha(0);

            if (img != -1) {
                question_image.setImageResource(img);
                question_image.setVisibility(View.VISIBLE);
                question_image.setAlpha((float) 0);
                params1.addRule(RelativeLayout.BELOW, R.id.question_image);
                params1.setMargins((int) (0.03125 * rl1.getWidth()), (int) (0.04861 * rl1.getHeight()), 0, 0);
                optionbutton.get(0).setLayoutParams(params1);

                ((ViewGroup.MarginLayoutParams) optionbutton.get(2).getLayoutParams()).setMargins((int) (0.03125 * rl1.getWidth()), (int) (0.01388 * rl1.getHeight()), 0, 0);
                optionbutton.get(1).requestLayout();

                params2.addRule(RelativeLayout.BELOW, R.id.question_image);
                params2.setMargins((int) (0.0859 * rl1.getWidth()), (int) (0.04861 * rl1.getHeight()), 0, 0);
                optionbutton.get(1).setLayoutParams(params2);

                ((ViewGroup.MarginLayoutParams) optionbutton.get(3).getLayoutParams()).setMargins((int) (0.0859 * rl1.getWidth()), (int) (0.01388 * rl1.getHeight()), 0, 0);
                optionbutton.get(2).requestLayout();

            }
            new QuestionFadeIn().execute();
        }
    }




    Button b;
    @Override
    public void onClick(View v)
    {
        b=(Button)v;
        time_of_answer=game_time;
        if(clickable) {
            class thread2 extends AsyncTask<Void,Void,Void>
            {
                public Void doInBackground(Void...r)
                {
                    clickable=false;
                    writer.println("true");
                    writer.flush();

                    return null;
                }

                public void onPostExecute(Void r)
                {
                    if (b.getText().equals(correct_answer)) {
                        b.setBackgroundResource(R.drawable.option_3);
                        timecount=true;
                        continuous+=1;
                        try {
                            ContentValues cv = new ContentValues();
                            ContentValues cv1 = new ContentValues();
                            cv.put("PRIORITY", 2);
                            c = db.query("Quiz_topics", new String[]{"COMPLETION"}, "TOPIC=?", new String[]{topic}, null, null, null);
                            if (c.moveToFirst() && priority == 1) {
                                cv1.put("COMPLETION", c.getInt(0) + 1);
                                db.update("Quiz_topics", cv1, "TOPIC=?", new String[]{topic});
                            }
                            db.update("'" + topic + "'", cv, "QUESTION=?", new String[]{question});
                            c.close();
                        }
                        catch (SQLiteException e){}
                    }

                    else {
                        for (Button right : optionbutton) {
                            if (right.getText().equals(correct_answer)) {
                                right.setBackgroundResource(R.drawable.option_3);
                            }
                        }
                        b.setBackgroundResource(R.drawable.option_2);
                        continuous = 0;
                        timecount = true;

                    }
                    try {
                        inputStream.readLine();
                    }
                    catch (IOException e){}
                    if (b.getText().equals(correct_answer)) {
                        Score thread1=new Score();
                        thread1.start();
                        ranswer.start();
                    }
                    else
                    {
                        ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(600);
                        ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(600);
                    }
                    continue_time=false;
                    new ButtonFadeOut().execute();
                }

            }
            game_time=25;
            timecount=false;
            tv2.setText("Waiting for others");
            b.setBackgroundResource(R.drawable.option_4);
            new thread2().execute();
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
        mp.stop();
        if(no_of_questions!=15) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        finish();
    }

    public void onStart()
    {
        super.onStart();
        mp.start();
    }

    public void onPause()
    {
        super.onPause();
        mp.stop();
    }

    public void onResume()
    {
        super.onResume();
        mp.start();
    }

    public void onDestroy()
    {
        super.onDestroy();
        mp.stop();
    }


}

