package com.example.threadstates;

import android.util.Log;

class ThreadB extends Thread{
    int total;
    @Override
    public void run(){

        synchronized(MainActivity.class){

            try {
                MainActivity.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            Log.d(MainActivity.TAG, this.getState().toString());
            MainActivity.ma.HandleLog(this.getState().toString());
            notify();

           // Log.d(MainActivity.TAG, this.getState().toString());
            MainActivity.ma.HandleLog(this.getState().toString());
        }
    }
}