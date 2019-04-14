package com.example.assignment1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class MyReceiver extends BroadcastReceiver {

    public MainActivity MainActivityObject;


    MyReceiver(MainActivity ma){
    MainActivityObject=ma;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        MainActivityObject.tv.append("\n"+intent.getStringExtra("state"));

    }
}
