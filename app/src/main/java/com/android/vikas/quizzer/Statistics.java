package com.android.vikas.quizzer;

import android.app.Activity;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Statistics extends Activity {

    SQLiteOpenHelper QuestionBank;
    SQLiteDatabase db;
    Cursor c;
    int id=R.id.tv12;
    RelativeLayout rl1;
    int no_of_topics;
    TextView total_topics,multiplayer_total_games,multiplayer_games_won,multiplayer_win_percentage,multiplayer_highest;
    TextView single_total_games,single_games_won,single_win_percentage,single_highest,single_accuracy;
    ImageView trippv;
    SharedPreferences sp,sp1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        sp=getSharedPreferences("MultiplayerGames",MODE_PRIVATE);
        sp1=getSharedPreferences("Single",MODE_PRIVATE);
        QuestionBank = new QuestionBank(this);
        db = QuestionBank.getReadableDatabase();
        rl1=(RelativeLayout)findViewById(R.id.rl1);
        trippv=(ImageView)findViewById(R.id.trippy);
        trippv.getLayoutParams().width=(int)(getWindowManager().getDefaultDisplay().getWidth()*0.5);
        trippv.getLayoutParams().height=(int)(getWindowManager().getDefaultDisplay().getHeight()*0.1);
    }

    public void onStart()
    {
        super.onStart();
        int completion;
        String topic;
        int total;
        c=db.query("Quiz_topics", new String[]{"TOPIC","COMPLETION","TOTAL"}, null, null, null, null, null);
        while(c.moveToNext())
        {
            completion=c.getInt(1);
            if(completion!=0)
            {
                topic=c.getString(0);
                total=c.getInt(2);
                TextView t = new TextView(this);
                t.setTextColor(Color.rgb(133, 185, 174));
                t.setText(topic + ":  " + (int) ((float) completion / (float) total * 100) + "%");
                rl1.addView(t);
                RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW,id);
                params.topMargin=10;
                t.setAlpha((float)0.8);
                t.setLayoutParams(params);
                id++;
                t.setId(id);
                no_of_topics++;
            }

        }
        c.close();
        total_topics=(TextView)findViewById(R.id.tv12);
        multiplayer_total_games=(TextView)findViewById(R.id.tv7);
        multiplayer_games_won=(TextView)findViewById(R.id.tv8);
        multiplayer_win_percentage=(TextView)findViewById(R.id.tv9);
        multiplayer_highest=(TextView)findViewById(R.id.tv10);

        multiplayer_total_games.setText("Number of games played: "+sp.getInt("No_of_games",0));
        multiplayer_games_won.setText("Number of games won: "+sp.getInt("Games_Won",0));
        try {
            multiplayer_win_percentage.setText("Win Percentage: " + (int) ((float) sp.getInt("Games_Won", 0) / (float) sp.getInt("No_of_games", 0) * 100) + "%");
        }
        catch (ArithmeticException e){multiplayer_win_percentage.setText("Win Percentage: 0");}

        multiplayer_highest.setText("Highest Score: "+sp.getInt("Score",0));
        total_topics.setText("No of topics played:  "+no_of_topics);

        single_total_games=(TextView)findViewById(R.id.tv2);
        single_games_won=(TextView)findViewById(R.id.tv3);
        single_win_percentage=(TextView)findViewById(R.id.tv4);
        single_highest=(TextView)findViewById(R.id.tv5);
        single_accuracy=(TextView)findViewById(R.id.accuracy);

        single_total_games.setText("Number of games played: "+sp1.getInt("total_games",0));
        single_games_won.setText("Number of games completed: " + sp1.getInt("games_won", 0));
        try {
            single_win_percentage.setText("Win Percentage: " + (int) ((float) sp1.getInt("games_won", 0) / (float) sp1.getInt("total_games", 0) * 100) + "%");
        }
        catch (ArithmeticException e){single_win_percentage.setText("Win Percentage: 0");}
        single_highest.setText("Highest Score: "+sp1.getInt("Highest",0));
        single_accuracy.setText("Accuracy: "+sp1.getInt("Accuracy",0)+"%");
    }

    public void onStop()
    {
        super.onStop();
        id=R.id.tv12;
        try {
            rl1.removeView(findViewById(++id));
        }
        catch (Exception e){}
        id=R.id.tv12;
        no_of_topics=0;
    }
}
