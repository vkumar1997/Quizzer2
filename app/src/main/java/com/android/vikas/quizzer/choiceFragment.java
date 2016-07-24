package com.android.vikas.quizzer;

import android.app.Fragment;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;

public class choiceFragment extends Fragment implements View.OnClickListener {
    Context context;
    Button b1;
    BluetoothAdapter bluetooth;
    BluetoothDevice client;
    View v;
    Set<BluetoothDevice> pairedDevices;
    ListView lv1;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        context=inflater.getContext();
        bluetooth=BluetoothAdapter.getDefaultAdapter();
        if(bluetooth==null)
            Toast.makeText(context, "Bluetooth on device not available", Toast.LENGTH_SHORT).show();
        if (!bluetooth.isEnabled()) {
            Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(turnOn, 0);
        }
        return inflater.inflate(R.layout.activity_choice_fragment,container,false);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list();

    }

    public void list()
    {
        v=getView();
        lv1=(ListView)v.findViewById(R.id.lv1);
        pairedDevices=bluetooth.getBondedDevices();
        ArrayList<String> list=new ArrayList<>();

        int i=0;
        for(BluetoothDevice ob:pairedDevices)
        {
            try {
                list.add(ob.getName());
                i++;
            }
            catch (Exception e)
            {
                Toast.makeText(context, "Error while making list", Toast.LENGTH_SHORT).show();
            }
        }

        ArrayAdapter<String> listAdapter=new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_list_item_multiple_choice,list);
        lv1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lv1.setAdapter(listAdapter);
    }

    public void onStart()
    {
        super.onStart();
        b1=(Button)getView().findViewById(R.id.b3);
        b1.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        if(v.getId()==R.id.b3)
        {
           int position=lv1.getChildCount();

            npvalue.no_of_clients=lv1.getCheckedItemCount();
           if (npvalue.no_of_clients==0)
           {
               Toast.makeText(context,"Select atleast one player to continue", Toast.LENGTH_SHORT).show();
           }
            else if(npvalue.no_of_clients>3)
           {
               Toast.makeText(context,"Only two clients (three players) supported right now", Toast.LENGTH_SHORT).show();
           }
            else {

               SparseBooleanArray sp = lv1.getCheckedItemPositions();
               int x=0;
               for (int i = 0; i < position; i++) {
                   if (sp.get(i)) {
                       String Device=lv1.getItemAtPosition(i).toString();
                       for(BluetoothDevice ob:pairedDevices)
                       {
                           if(Device.equals(ob.getName()))
                           {
                               client = ob;
                               break;
                           }
                       }

                       npvalue.uuid[x]= UUID.fromString("935bc57c-e840-11e5-9730-" + client.getAddress().replace(":", ""));
                       npvalue.device[x]=client.getName();
                       x++;

                   }

               }
               MainBluetoothActivity.connect();

           }

        }
    }
}
