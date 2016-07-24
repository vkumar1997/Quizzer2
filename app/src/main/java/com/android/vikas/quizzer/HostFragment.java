package com.android.vikas.quizzer;

import android.app.Activity;
import android.app.Fragment;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;


public class HostFragment extends Fragment implements View.OnClickListener{
    Context context;
    BluetoothServerSocket serversock[]=new BluetoothServerSocket[3];
    BluetoothAdapter b;
    BluetoothSocket socket[]=new BluetoothSocket[3];
    View view,v;
    ProgressBar pb1;
    ProgressBar pb2;
    ProgressBar pb3;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    Activity activity;

    @Override
    public View onCreateView (final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        activity=new Activity();
        context = inflater.getContext();
        b = BluetoothAdapter.getDefaultAdapter();
        if (b == null)
            Toast.makeText(context, "Bluetooth on device not available", Toast.LENGTH_SHORT).show();
        if (!b.isEnabled()) {
            Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(turnOn, 0);
        }
        view = inflater.inflate(R.layout.activity_host_fragment, container, false);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        v=getView();
        pb1=(ProgressBar)view.findViewById(R.id.pb1);
        pb2=(ProgressBar)view.findViewById(R.id.pb2);
        pb3=(ProgressBar)view.findViewById(R.id.pb3);
        Button b1=(Button)v.findViewById(R.id.b1);
        pb1.setVisibility(View.GONE);
        pb2.setVisibility(View.GONE);
        pb3.setVisibility(View.GONE);
        b1.setOnClickListener(this);
        tv1=(TextView)v.findViewById(R.id.tv1);
        tv2=(TextView)v.findViewById(R.id.tv2);
        tv3=(TextView)v.findViewById(R.id.tv3);
    }

    class Thread1 extends Thread {

        public void run() {
            try {
                serversock[0] = b.listenUsingRfcommWithServiceRecord("Quizzer",npvalue.uuid[0]);
            } catch (IOException e) {}

            try

            {
                    socket[0] = serversock[0].accept(20000);
            } catch (Exception e) {

               activity.runOnUiThread(new Runnable() {
                    public void run() {
                        tv1.setText("Time Out");
                        pb1.setVisibility(View.GONE);
                    }
                });
            }

            if (socket[0] != null) {
                try {
                    serversock[0].close();
                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            tv1.setText(npvalue.device[0] + "\nConnected");
                            npvalue.serverside.add(socket[0]);
                            pb1.setVisibility(View.GONE);
                        }
                    });
                }
                catch (IOException e) {}
            }
        }
    }






    class Thread2 extends Thread {

        public void run() {
            try {
                serversock[1] = b.listenUsingRfcommWithServiceRecord("Quizzer",npvalue.uuid[1] );
            } catch (IOException e) {}
            try
            {
                socket[1] = serversock[1].accept(20000);
            } catch (IOException e) {

                activity.runOnUiThread(new Runnable() {
                    public void run() {
                        tv2.setText("Time Out");
                        pb2.setVisibility(View.GONE);
                    }
                });
            }

            if (socket[1] != null) {
                try {
                    serversock[1].close();

                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            tv2.setText(npvalue.device[1]+"\nConnected");
                            pb2.setVisibility(View.GONE);
                            npvalue.serverside.add(socket[1]);
                        }
                    });
                }
                catch (IOException e) {}
            }
        }
    }


    class Thread3 extends Thread {

        public void run() {
            try {
                serversock[2] = b.listenUsingRfcommWithServiceRecord("Quizzer",npvalue.uuid[2] );
            } catch (IOException e)
            {}
            try

            {
                socket[2] = serversock[2].accept(20000);
            } catch (IOException e) {

                activity.runOnUiThread(new Runnable() {
                    public void run() {
                        tv3.setText("Time Out");
                        pb3.setVisibility(View.GONE);
                    }
                });
            }

            if (socket[1] != null) {
                try {
                    serversock[2].close();

                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            tv3.setText(npvalue.device[2]+"\nConnected");
                            pb3.setVisibility(View.GONE);
                            npvalue.serverside.add(socket[2]);
                        }
                    });
                }
                catch (IOException e) {

                }
            }
        }
    }

    class Thread4 extends AsyncTask<Void,Void,Void>
    {
        public Void doInBackground(Void... r)
        {
            while(npvalue.serverside.size()!=npvalue.no_of_clients)
            {}
            return null;
        }
        public  void onPostExecute(Void r)
        {
            Intent intent=new Intent(getActivity(),QuizTopic.class);
            startActivity(intent);
            activity.finish();
        }
    }






    public void onClick(View v)
    {

        tv1.setText(npvalue.device[0]+"\nConnecting.....");
        pb1.setVisibility(View.VISIBLE);
        if(v.getId()==R.id.b1) {
            try {
                socket[0] = null;
                serversock[0]=null;
                socket[1]=null;
                serversock[1]=null;
                socket[2]=null;
                serversock[2]=null;
                npvalue.serverside.clear();
            } catch (Exception e) {
                Toast.makeText(context, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
            }
            if(npvalue.no_of_clients==1) {
                Thread1 thread1 = new Thread1();
                thread1.start();
            }
            else if(npvalue.no_of_clients==2) {
                tv2.setText(npvalue.device[1]+"\nConnecting.....");
                pb2.setVisibility(View.VISIBLE);
                Thread1 thread1 = new Thread1();
                thread1.start();
                Thread2 thread2 = new Thread2();
                thread2.start();
            }

            else if(npvalue.no_of_clients==3){
                tv2.setText(npvalue.device[1] + "\nConnecting.....");
                pb2.setVisibility(View.VISIBLE);
                tv3.setText(npvalue.device[2] + "\nConnecting.....");
                pb3.setVisibility(View.VISIBLE);
                Thread1 thread1 = new Thread1();
                thread1.start();
                Thread2 thread2 = new Thread2();
                thread2.start();
                Thread3 thread3=new Thread3();
                thread3.start();
            }
            new Thread4().execute();

        }

        }


}
