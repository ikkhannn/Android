package com.example.threadstates;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;

public class MyThread extends Thread {
    String data;
    public MyThread(String data){
        this.data=data;
    }

Handler handler;

    @Override
    public void run() {
        synchronized (data) {
           // Log.i(MainActivity.TAG, this.getState().toString());
        MainActivity.ma.HandleLog(this.getState().toString());

            try {
                for (int k = 0; k < data.length(); k++) {

                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Log.e(MainActivity.TAG, e.getMessage());
            }

        }
    }
}