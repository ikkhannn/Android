package com.example.threadsexample01;

import android.util.Log;
//Example of creating a thread by extending Thread class
public class Th01 extends Thread {
    @Override
    public void run() {
        try {
            for (Integer i = 1; i <= 10; i++) {
                Log.d(MainActivity.TAG, i.toString());
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            Log.e(MainActivity.TAG, e.getMessage());
        }
    }
}