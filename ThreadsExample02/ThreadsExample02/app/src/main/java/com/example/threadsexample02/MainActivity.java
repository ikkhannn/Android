package com.example.threadsexample02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

//Various states of a thread
public class MainActivity extends AppCompatActivity {
    public static final String TAG="ThreadsExample02";
    MyThread01 th;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnRunCLicked(View view) {
        th=new MyThread01();
        Log.i(TAG, th.getState().toString());
        th.start();
        Log.i(TAG, th.getState().toString());

        try {
            Thread.sleep(500);
            Log.i(TAG, th.getState().toString());
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            Log.e(MainActivity.TAG, e.getMessage());
        }
        Log.i(TAG, th.getState().toString());
    }
}

