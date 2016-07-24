package com.android.vikas.quizzer;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;


public class MainBluetoothActivity extends Activity {
    static FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_main);
        Fragment frag=new ClientFragment();
        begintransaction(frag);
    }

    public void choose(View view)
    {

        ft=null;
        ft=getFragmentManager().beginTransaction();
        Fragment frag=new choiceFragment();
        begintransaction(frag);
    }

    public void connecttohost(View view)
    {
        Fragment frag=new ClientFragment();
        begintransaction(frag);
    }

    static public void connect()
    {

        Fragment frag=new HostFragment();
        ft.replace(R.id.fl1,frag);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }

    public void begintransaction(Fragment frag)
    {   FragmentTransaction ft;
        ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.fl1,frag);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }

}
