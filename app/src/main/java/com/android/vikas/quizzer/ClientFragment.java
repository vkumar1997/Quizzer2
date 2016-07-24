package com.android.vikas.quizzer;

import android.app.Fragment;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;

public class ClientFragment extends Fragment {
    BluetoothAdapter B;
    BluetoothDevice server;
    BluetoothSocket socket;
    String address;
    Context context;
    TextView tv2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context = inflater.getContext();
        B = BluetoothAdapter.getDefaultAdapter();
        if (B == null)
            Toast.makeText(context, "Bluetooth on device not available", Toast.LENGTH_SHORT).show();

        if (B.isEnabled() == false) {
            startActivityForResult(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE), 0);
        }
        return inflater.inflate(R.layout.activity_client_fragment, container, false);

    }

    public void onStart() {
        super.onStart();
        tv2 = (TextView) getView().findViewById(R.id.tv2);
        tv2.setText("Select a device to connect");
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list();

    }


    public void list() {
        View v = getView();
        ListView lv1 = (ListView) v.findViewById(R.id.lv1);
        Set<BluetoothDevice> pairedDevices = B.getBondedDevices();
        ArrayList<String> list = new ArrayList<>();

        int i = 0;
        for (BluetoothDevice ob : pairedDevices) {
            try {
                list.add(ob.getName());
                i++;
            } catch (Exception e) {
                Toast.makeText(context, "Error while making list", Toast.LENGTH_SHORT).show();
            }
        }

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, list);
        lv1.setAdapter(listAdapter);
        setclicks(lv1, pairedDevices);

    }


    public void setclicks(ListView lv1, final Set<BluetoothDevice> pairedDevices) {
        socket = null;
        npvalue.clientside = null;
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                String Device = listView.getItemAtPosition(position).toString();
                for (BluetoothDevice ob : pairedDevices) {
                    if (Device.equals(ob.getName())) {
                        server = ob;
                        break;
                    }
                }npvalue.serverdevice = server;
                address = B.getAddress();
                if (address.equals("02:00:00:00:00:00")) {
                    address = android.provider.Settings.Secure.getString(context.getContentResolver(), "bluetooth_address");
                }
                connect();
            }
        };

        lv1.setOnItemClickListener(itemClickListener);
    }


    public void connect() {
        View v = getView();
        tv2 = (TextView) v.findViewById(R.id.tv2);
        tv2.setText("Connecting..." + address.replace(":", ""));
        new sync().execute();
    }

    private class sync extends AsyncTask<Void, Void, Integer> {

        String s = "";
        View v = getView();
        TextView tv2 = (TextView) v.findViewById(R.id.tv2);

        protected Integer doInBackground(Void... r) {


            try {

                socket = server.createRfcommSocketToServiceRecord(UUID.fromString("935bc57c-e840-11e5-9730-" + address.replace(":", "")));
            } catch (Exception e) {

                s = e.getMessage();
                return 1;
            }

            try {
                if (B.isDiscovering()) {
                    B.cancelDiscovery();
                }
                socket.connect();
                return 0;
            } catch (IOException connectException) {
                try {
                    s = connectException.getMessage();
                    socket.close();
                    return 1;
                } catch (IOException closeException) {
                    s = closeException.getMessage();
                    return 1;
                }
            }

        }

        protected void onPostExecute(Integer i) {
            if (i == 0 && socket != null) {
                npvalue.clientside=socket;
                tv2.setText("Connected");
                Intent intent=new Intent(getActivity(),clientplay.class);
                startActivity(intent);
                getActivity().finish();
            }
            else
            {
                tv2.setText("Not connected");
            }
        }
    }
}