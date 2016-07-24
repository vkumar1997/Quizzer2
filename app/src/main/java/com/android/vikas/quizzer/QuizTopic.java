package com.android.vikas.quizzer;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class QuizTopic extends Activity implements View.OnClickListener {

    ImageButton ib3,ib4,ib5,ib6,ib8,ib9,ib10,ib11,ib12,ib13,ib14,ib15,ib16,ib17,ib18,ib19,ib20,ib21,ib22,ib23,ib24;
    TextView tv1,tv3,tv4,tv5,tv8,tv9,tv10,tv11,tv12,tv14,tv15,tv16,tv17,tv18,tv19,tv20,tv22,tv23,tv24,tv26,tv27,maintext;
    ColorDrawable cd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        extra_values.topics.clear();
        setContentView(R.layout.activity_quiz_topic);
        ib3=(ImageButton)findViewById(R.id.ib3);
        ib4=(ImageButton)findViewById(R.id.ib4);
        ib5=(ImageButton)findViewById(R.id.ib5);
        ib6=(ImageButton)findViewById(R.id.ib6);
        ib8=(ImageButton)findViewById(R.id.ib8);
        ib9=(ImageButton)findViewById(R.id.ib9);
        ib10=(ImageButton)findViewById(R.id.ib10);
        ib11=(ImageButton)findViewById(R.id.ib11);
        ib12=(ImageButton)findViewById(R.id.ib12);
        ib13=(ImageButton)findViewById(R.id.ib13);
        ib14=(ImageButton)findViewById(R.id.ib14);
        ib15=(ImageButton)findViewById(R.id.ib15);
        ib16=(ImageButton)findViewById(R.id.ib16);
        ib17=(ImageButton)findViewById(R.id.ib17);
        ib18=(ImageButton)findViewById(R.id.ib18);
        ib19=(ImageButton)findViewById(R.id.ib19);
        ib20=(ImageButton)findViewById(R.id.ib20);
        ib21=(ImageButton)findViewById(R.id.ib21);
        ib22=(ImageButton)findViewById(R.id.ib22);
        ib23=(ImageButton)findViewById(R.id.ib23);
        ib24=(ImageButton)findViewById(R.id.ib24);
        tv1=(TextView)findViewById(R.id.tv1);
        tv3=(TextView)findViewById(R.id.tv3);
        tv4=(TextView)findViewById(R.id.tv4);
        tv5=(TextView)findViewById(R.id.tv5);
        tv8=(TextView)findViewById(R.id.tv8);
        tv9=(TextView)findViewById(R.id.tv9);
        tv10=(TextView)findViewById(R.id.tv10);
        tv11=(TextView)findViewById(R.id.tv11);
        tv12=(TextView)findViewById(R.id.tv12);
        tv14=(TextView)findViewById(R.id.tv14);
        tv15=(TextView)findViewById(R.id.tv15);
        tv16=(TextView)findViewById(R.id.tv16);
        tv17=(TextView)findViewById(R.id.tv17);
        tv18=(TextView)findViewById(R.id.tv18);
        tv19=(TextView)findViewById(R.id.tv19);
        tv20=(TextView)findViewById(R.id.tv20);
        tv22=(TextView)findViewById(R.id.tv22);
        tv23=(TextView)findViewById(R.id.tv23);
        tv24=(TextView)findViewById(R.id.tv24);
        tv26=(TextView)findViewById(R.id.tv26);
        tv27=(TextView)findViewById(R.id.tv27);
        maintext=(TextView)findViewById(R.id.maintext);
        ib3.setOnClickListener(this);
        ib4.setOnClickListener(this);
        ib5.setOnClickListener(this);
        ib6.setOnClickListener(this);
        ib8.setOnClickListener(this);
        ib9.setOnClickListener(this);
        ib10.setOnClickListener(this);
        ib11.setOnClickListener(this);
        ib12.setOnClickListener(this);
        ib13.setOnClickListener(this);
        ib14.setOnClickListener(this);
        ib15.setOnClickListener(this);
        ib16.setOnClickListener(this);
        ib17.setOnClickListener(this);
        ib18.setOnClickListener(this);
        ib19.setOnClickListener(this);
        ib20.setOnClickListener(this);
        ib21.setOnClickListener(this);
        ib22.setOnClickListener(this);
        ib23.setOnClickListener(this);
        ib24.setOnClickListener(this);


    }

    public void onStart()
    {
       super.onStart();
        extra_values.topics.clear();
        tv1.setBackgroundColor(Color.BLACK);
        tv3.setBackgroundColor(Color.BLACK);
        tv4.setBackgroundColor(Color.BLACK);
        tv5.setBackgroundColor(Color.BLACK);
        tv8.setBackgroundColor(Color.BLACK);
        tv9.setBackgroundColor(Color.BLACK);
        tv10.setBackgroundColor(Color.BLACK);
        tv11.setBackgroundColor(Color.BLACK);
        tv12.setBackgroundColor(Color.BLACK);
        tv14.setBackgroundColor(Color.BLACK);
        tv15.setBackgroundColor(Color.BLACK);
        tv16.setBackgroundColor(Color.BLACK);
        tv17.setBackgroundColor(Color.BLACK);
        tv18.setBackgroundColor(Color.BLACK);
        tv19.setBackgroundColor(Color.BLACK);
        tv20.setBackgroundColor(Color.BLACK);
        tv22.setBackgroundColor(Color.BLACK);
        tv24.setBackgroundColor(Color.BLACK);
        tv26.setBackgroundColor(Color.BLACK);
        tv27.setBackgroundColor(Color.BLACK);
        maintext.setText("Please select your topic. You can select multiple topics if you want. Enjoy!!\n\nNo topics selected yet.");
    }


    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.ib3:
                cd=(ColorDrawable) tv1.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(1111818120);
                    extra_values.topics.clear();
                    extra_values.topics.add(tv1.getText().toString());
                    tv3.setBackgroundColor(Color.BLACK);
                    tv4.setBackgroundColor(Color.BLACK);
                    tv5.setBackgroundColor(Color.BLACK);
                    tv8.setBackgroundColor(Color.BLACK);
                    tv9.setBackgroundColor(Color.BLACK);
                    tv10.setBackgroundColor(Color.BLACK);
                    tv11.setBackgroundColor(Color.BLACK);
                    tv12.setBackgroundColor(Color.BLACK);
                    tv14.setBackgroundColor(Color.BLACK);
                    tv15.setBackgroundColor(Color.BLACK);
                    tv16.setBackgroundColor(Color.BLACK);
                    tv17.setBackgroundColor(Color.BLACK);
                    tv18.setBackgroundColor(Color.BLACK);
                    tv19.setBackgroundColor(Color.BLACK);
                    tv20.setBackgroundColor(Color.BLACK);
                    tv22.setBackgroundColor(Color.BLACK);
                    tv23.setBackgroundColor(Color.BLACK);
                    tv24.setBackgroundColor(Color.BLACK);
                    tv26.setBackgroundColor(Color.BLACK);
                    tv27.setBackgroundColor(Color.BLACK);
                }
                else
                {
                extra_values.topics.remove(tv1.getText().toString());
                tv1.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib4:
                cd=(ColorDrawable) tv3.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv3.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv3.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv3.getText().toString());
                    tv3.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib5:
                cd=(ColorDrawable) tv4.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv4.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv4.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv4.getText().toString());
                    tv4.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib6:
                cd=(ColorDrawable) tv5.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv5.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv5.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv5.getText().toString());
                    tv5.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib8:
                cd=(ColorDrawable) tv8.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv8.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv8.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv8.getText().toString());
                    tv8.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib9:
                cd=(ColorDrawable) tv9.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv9.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv9.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv9.getText().toString());
                    tv9.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib10:
                cd=(ColorDrawable) tv10.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv10.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv10.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv10.getText().toString());
                    tv10.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib11:
                cd=(ColorDrawable) tv11.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv11.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv11.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv11.getText().toString());
                    tv11.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib12:
                cd=(ColorDrawable) tv12.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv12.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv12.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv12.getText().toString());
                    tv12.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib13:
                cd=(ColorDrawable) tv14.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv14.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv14.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv14.getText().toString());
                    tv14.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib14:
                cd=(ColorDrawable) tv15.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv15.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv15.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv15.getText().toString());
                    tv15.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib15:
                cd=(ColorDrawable) tv16.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv16.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv16.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv16.getText().toString());
                    tv16.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib16:
                cd=(ColorDrawable) tv17.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv17.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv17.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv17.getText().toString());
                    tv17.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib17:
                cd=(ColorDrawable) tv18.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv18.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv18.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv18.getText().toString());
                    tv18.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib18:
                cd=(ColorDrawable) tv19.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv19.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv19.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv19.getText().toString());
                    tv19.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib19:
                cd=(ColorDrawable) tv20.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv20.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv20.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv20.getText().toString());
                    tv20.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib20:
                cd=(ColorDrawable) tv22.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv22.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv22.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv22.getText().toString());
                    tv22.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib21:
                cd=(ColorDrawable) tv23.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv23.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv23.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv23.getText().toString());
                    tv23.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib22:
                cd=(ColorDrawable) tv24.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv24.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv24.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv24.getText().toString());
                    tv24.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib23:
                cd=(ColorDrawable) tv26.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv26.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv26.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv26.getText().toString());
                    tv26.setBackgroundColor(Color.BLACK);
                }
                break;
            case R.id.ib24:
                cd=(ColorDrawable) tv27.getBackground();
                if(cd.getColor()!=1111818120) {
                    tv1.setBackgroundColor(Color.BLACK);
                    extra_values.topics.remove(tv1.getText().toString());
                    tv27.setBackgroundColor(1111818120);
                    extra_values.topics.add(tv27.getText().toString());
                }
                else
                {
                    extra_values.topics.remove(tv27.getText().toString());
                    tv27.setBackgroundColor(Color.BLACK);
                }
                break;
        }

        if(extra_values.topics.size()==0)
        {
            maintext.setText("Please select your topic. You can select multiple topics if you want. Enjoy!!\n\nNo topics selected yet.");
        }
        else {
            maintext.setText("");
            for (String ob : extra_values.topics) {
                if(maintext.getText().toString().equals(""))
                {
                    maintext.setText(""+ob+" Selected");
                }
                else
                {
                    maintext.setText(maintext.getText().toString()+"\n"+ob+" Selected");
                }
            }
        }
    }


    public void singleplay(View view)
    {
        if(MainActivity.playtype==2 && extra_values.topics.size()!=0)
        {
            Intent intent = new Intent(this, hostplay.class);
            startActivity(intent);
            finish();
        }
        else if(MainActivity.playtype==1 && extra_values.topics.size()!=0) {
            Intent intent = new Intent(this, singleplay.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"You haven't selected a topic",Toast.LENGTH_SHORT);
        }
    }
}
