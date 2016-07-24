package com.android.vikas.quizzer;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Vikas on 3/13/2016.
 */
public class npvalue {
    static int no_of_clients;
    static UUID uuid[]=new UUID[3];
    static String device[]=new String[3];
    static ArrayList<BluetoothSocket> serverside=new ArrayList<>();
    static BluetoothSocket clientside;
    static BluetoothDevice serverdevice;
}
