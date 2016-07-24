package com.android.vikas.quizzer;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ScorePage extends Activity implements View.OnClickListener {
    RelativeLayout rl1;
    ImageView iv1;
    TextView tv1;
    int score, width, height;
    TableLayout tb1;
    TableRow tr;
    TextView row1,row2,row3;
    Button b1,b2;
    boolean clickable=true;
    PrintWriter writer;
    ArrayList <BufferedReader> inputStreams=new ArrayList<>();
    SharedPreferences sp;
    SharedPreferences.Editor et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);

        sp=getSharedPreferences("MultiplayerGames",MODE_PRIVATE);
        score=getIntent().getIntExtra("Score", 0);

        rl1=(RelativeLayout)findViewById(R.id.rl1);
        iv1=(ImageView)findViewById(R.id.iv1);
        tv1=(TextView)findViewById(R.id.text1);
        tb1=(TableLayout)findViewById(R.id.tb1);

        width=getWindowManager().getDefaultDisplay().getWidth();
        height=getWindowManager().getDefaultDisplay().getHeight();
        iv1.getLayoutParams().width=(int)(width/1.2);
        iv1.getLayoutParams().height=height/4;
        tv1.setTextSize((int)(width*0.03));

        et=sp.edit();
        et.putInt("No_of_games",sp.getInt("No_of_games",0)+1);

        if(score>sp.getInt("Score",0))
        {
            et.putInt("Score",score);
        }
        if(score==extra_values.positions.get(0)||BluetoothAdapter.getDefaultAdapter().getName().equals(extra_values.names.get(0)))
        {
            et.putInt("Games_Won",sp.getInt("Games_Won",0)+1);
            iv1.setImageResource(R.drawable.won);
            tv1.setText("Great Victory! Can you achieve a streak?");
        }
        else {
            iv1.setImageResource(R.drawable.lose);
            tv1.setText("Don't get mad! Better luck next time!!");
        }

        tr=new TableRow(this);
        tr.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
        row1=new TextView(this);
        row1.setText("Position");
        row1.setTextSize((int) (0.03 * width));
        row1.setPadding(20, 20, 20, 20);
        row1.setTextColor(Color.CYAN);
        row2=new TextView(this);
        row2.setText("Name");
        row2.setGravity(Gravity.CENTER);
        row2.setTextSize((int) (0.03 * width));
        row2.setPadding(20, 20, 20, 20);
        row2.setTextColor(Color.CYAN);
        row3=new TextView(this);
        row3.setText("Score");
        row3.setTextSize((int) (0.03 * width));
        row3.setPadding(20, 20, 20, 20);
        row3.setTextColor(Color.CYAN);
        tr.addView(row1);
        tr.addView(row2);
        tr.addView(row3);
        tb1.addView(tr, new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));

        for(int i=0;i<extra_values.names.size(); i++)
        {
            if(extra_values.names.get(i).length()>=8)
                extra_values.names.set(i,extra_values.names.get(i).substring(0,8)+"..");
            tr=new TableRow(this);
            tr.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
            row1=new TextView(this);
            row1.setText("" + (i + 1));
            row1.setTextSize((int)(0.03*width));
            row1.setPadding(20, 20, 20, 20);
            row1.setTextColor(Color.WHITE);
            row2=new TextView(this);
            row2.setText(extra_values.names.get(i));
            row2.setGravity(Gravity.CENTER);
            row2.setTextSize((int)(0.03*width));
            row2.setPadding(20, 20, 20, 20);
            row2.setTextColor(Color.WHITE);
            row3=new TextView(this);
            row3.setText(""+extra_values.positions.get(i));
            row3.setTextSize((int)(0.03*width));
            row3.setPadding(20, 20, 20, 20);
            row3.setTextColor(Color.WHITE);
            row3.setGravity(Gravity.END);
            tr.addView(row1);
            tr.addView(row2);
            tr.addView(row3);
            tb1.addView(tr, new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
        }
        extra_values.names.clear();
        extra_values.positions.clear();

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b2.setTextSize((int)(0.03*width));
        b1.getLayoutParams().width=(int)(width/2.4);
        b1.getLayoutParams().height=(int)(0.08 *height);
        b1.setTextSize((int)(0.03*width));
        b2.getLayoutParams().width=(int)(width/2.4);
        b2.getLayoutParams().height=(int)(0.08 *height);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        et.commit();
    }

    public void onClick(View v)
    {
        if(v.getId()==R.id.b1 && clickable)
        {
            if(!npvalue.serverside.isEmpty()) {
                b1.setText("Waiting for others");
                b2.setVisibility(View.GONE);
                clickable = false;
                new reader().execute();

            }
            else {
                try {
                    writer=new PrintWriter(npvalue.clientside.getOutputStream());
                }
                catch (IOException e){}
                writer.println("");
                writer.flush();
                Intent intent = new Intent(this, clientplay.class);
                startActivity(intent);
                finish();
            }
        }
        if(v.getId()==R.id.b2 && clickable)
        {
            Intent intent=new Intent(this,Statistics.class);
            startActivity(intent);
        }
    }

    class reader extends AsyncTask<Void,Void,Void>
    {
        public Void doInBackground(Void...r)
        {
            for(int i=0; i<npvalue.serverside.size();i++)
            {
                try {
                    inputStreams.add(new BufferedReader(new InputStreamReader(npvalue.serverside.get(i).getInputStream())));
                    inputStreams.get(i).readLine();
                }
                catch (IOException e){}
            }
            return null;
        }
        public void onPostExecute(Void r)
        {
            Intent intent = new Intent(ScorePage.this, QuizTopic.class);
            startActivity(intent);
            finish();
        }
    }
    public void onStart()
    {
        super.onStart();
    }

}
