package com.android.vikas.quizzer;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleScorePage extends Activity {

    ImageView iv1;
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    Button b1,b2;
    int width,height;
    int score,no_of_questions,correct_answers,continuous,total;
    static int accuracy;

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_score_page);

        sp=getSharedPreferences("Single",MODE_PRIVATE);
        SharedPreferences.Editor et=sp.edit();

        no_of_questions=getIntent().getIntExtra("No_of_Questions",0);
        correct_answers=getIntent().getIntExtra("Correct_Answers",0);
        continuous=getIntent().getIntExtra("Continuous", 0);
        score=getIntent().getIntExtra("Score", 0);

        width=getWindowManager().getDefaultDisplay().getWidth();
        height=getWindowManager().getDefaultDisplay().getHeight();

        iv1=(ImageView)findViewById(R.id.iv1);
        tv1=(TextView)findViewById(R.id.tv1);
        tv1.setTextSize((int)(width*0.025));
        tv2=(TextView)findViewById(R.id.tv2);
        tv2.setTextSize((int)(width*0.026));
        tv3=(TextView)findViewById(R.id.tv3);
        tv3.setTextSize((int)(width*0.026));
        tv4=(TextView)findViewById(R.id.tv4);
        tv4.setTextSize((int)(width*0.026));
        tv5=(TextView)findViewById(R.id.tv5);
        tv5.setTextSize((int)(width*0.026));
        tv6=(TextView)findViewById(R.id.tv6);
        tv6.setTextSize((int)(width*0.026));
        b1=(Button)findViewById(R.id.b1);
        b1.getLayoutParams().width=(int)(width/2.4);
        b1.getLayoutParams().height=(int)(0.08 *height);
        b2=(Button)findViewById(R.id.b2);
        b1.setTextSize((int)(width*0.026));
        b2.setTextSize((int)(width*0.026));
        b2.getLayoutParams().width=(int)(width/2.4);
        b2.getLayoutParams().height=(int)(0.08 *height);

        et.putInt("total_games",sp.getInt("total_games",0)+1);

        if(extra_values.topics.size()<=3)
            total=20;
        else
            total=30;

        if((int)((float)no_of_questions/(float)total*100)==100)
        {
            iv1.setImageResource(R.drawable.nicely_played);
            tv1.setText("Hell! Running out of questions to ask you");
            et.putInt("games_won", sp.getInt("games_won", 0) + 1);

        }
        else if ((int)((float)no_of_questions/(float)total*100)>=75)
        {
            tv1.setText("Well done! Very close to victory. Try again");
        }
        else if((int)((float)no_of_questions/(float)total*100)>=50)
        {
            tv1.setText("You are good. Just need a little sharpening. Try again");
        }
        else if((int)((float)no_of_questions/(float)total*100)>=25)
        {
            tv1.setText("Not Bad! But can you achieve a better score");
        }

        tv2.setText("Question Asked: "+no_of_questions+"/"+total);
        tv3.setText("Correct Answers: "+correct_answers);
        tv4.setText("Score: "+score);
        tv5.setText("Longest Streak: "+continuous);

        if(score>sp.getInt("Highest",0))
        {
            et.putInt("Highest",score);
        }


        et.putInt("Questions", sp.getInt("Questions", 0) + no_of_questions);
        et.putInt("Answers", sp.getInt("Answers", 0) + correct_answers);
        accuracy=(int)((float)sp.getInt("Answers",0)/(float)sp.getInt("Questions",0)*100);
        et.putInt("Accuracy",accuracy);
        et.commit();
        tv6.setText("Highest Score: "+sp.getInt("Highest",0));

    }

    public void playagain(View v)
    {
        Intent intent=new Intent(this,singleplay.class);
        startActivity(intent);
        finish();
    }
    public void statistics(View v)
    {
        Intent intent=new Intent(this,Statistics.class);
        startActivity(intent);
    }
}
