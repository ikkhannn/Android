package com.example.threadsexample03;

import android.util.Log;

public class MyThread extends Thread {
    String data;
    public MyThread(String data){
        this.data=data;
    }

    @Override
    public void run() {
        synchronized (data) {
            Log.i(MainActivity.TAG, this.getState().toString());
            try {
                for (int k = 0; k < data.length(); k++) {
                    Log.d(MainActivity.TAG, data.charAt(k) + "");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Log.e(MainActivity.TAG, e.getMessage());
            }

        }
    }
}