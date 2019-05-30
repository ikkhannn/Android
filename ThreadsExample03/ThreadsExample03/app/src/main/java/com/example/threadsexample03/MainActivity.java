package com.example.threadsexample03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="ThreadsExample03";
    String data="Critical Data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnRunClicked(View view) {
        MyThread th=new MyThread(data);
        Log.i(TAG, th.getState().toString());
        synchronized (data) {
            th.start();
            Log.i(TAG, th.getState().toString());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Log.e(TAG, e.getMessage());
            }
            Log.d(TAG, th.getState().toString()+"hahaha");
        }

        try {
            Thread.sleep(500);
            Log.i(TAG, th.getState().toString());

            Thread.sleep(1000);
            Log.i(TAG, th.getState().toString());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
