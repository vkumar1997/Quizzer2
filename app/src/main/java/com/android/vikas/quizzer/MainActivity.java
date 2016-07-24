package com.android.vikas.quizzer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class MainActivity extends Activity  {

    Button ib1,ib2;
    RelativeLayout rl1;
    ImageView iv2;
    Activity activity;
    public static int playtype;

    class rotate extends Thread
    {
        int x=0;
        boolean b=true;
        public void run()
        {
            while(true)
            {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        iv2.setRotationX(x);
                        iv2.setRotationY(x);
                    }
                });

                x=x+1;
                try
                {
                    Thread.sleep(15);
                }
                catch (InterruptedException e){}
                if(x==360)
                    x=0;
                if((x==90 || x==270) && b) {
                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setImageResource(R.drawable.dice2);
                        }
                    });
                    b = false;
                }
                else if((x==90|| x==270) && !b) {
                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setImageResource(R.drawable.dice);
                        }
                    });
                    b=true;
                }
            }
        }
    }

    rotate thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        thread=new rotate();
        setContentView(R.layout.activity_main);
        ib1=(Button)findViewById(R.id.ib1);
        ib2=(Button)findViewById(R.id.ib2);
        rl1=(RelativeLayout)findViewById(R.id.rl1);
        iv2=(ImageView)findViewById(R.id.iv2);
        activity=new Activity();
        layout();
    }

    public void layout()
    {
        iv2.getLayoutParams().width=getWindowManager().getDefaultDisplay().getHeight()/5;
        iv2.getLayoutParams().width=getWindowManager().getDefaultDisplay().getHeight()/5;
        thread.start();
        ib1.getLayoutParams().width=(int)(getWindowManager().getDefaultDisplay().getWidth()/(float)1.5);
        ib1.getLayoutParams().height=getWindowManager().getDefaultDisplay().getHeight()/7;
        ib2.getLayoutParams().width=(int)(getWindowManager().getDefaultDisplay().getWidth()/(float)1.5);
        ib2.getLayoutParams().height=getWindowManager().getDefaultDisplay().getHeight()/7;

    }

    public void singleplayer(View view)
    {
        Intent intent=new Intent(this,QuizTopic.class);
        playtype=1;
        startActivity(intent);
    }

    public void doubleplayer(View view)
    {
        playtype=2;
        Intent intent=new Intent(this,MainBluetoothActivity.class);
        startActivity(intent);
    }

    public void statistics(View v)
    {
        Intent intent=new Intent(this,Statistics.class);
        startActivity(intent);
    }

}
