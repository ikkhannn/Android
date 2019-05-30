package com.example.threadsexample01;
//Creating a runnable class to create a Thread

import android.util.Log;

public class Run01 implements Runnable {
    @Override
    public void run() {
        try {
            for (Integer i = 1; i <= 10; i++) {
                Log.d(MainActivity.TAG, "\t\t"+i.toString());
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            Log.e(MainActivity.TAG, e.getMessage());
        }
    }
}
