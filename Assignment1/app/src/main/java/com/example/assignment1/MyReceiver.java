package com.example.assignment1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class MyReceiver extends BroadcastReceiver {

    public MainActivity MainActivityObject;

    @Override
    public void onReceive(Context context, Intent intent) {

        MainActivityObject.tv.setText("");

    }
}
