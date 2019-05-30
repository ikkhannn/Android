package com.example.threadsexample01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

//Two methods to create Threads
//1-By extending Thread class
//2-By implementing Runnable interface
public class MainActivity extends AppCompatActivity {
    public static final String TAG="ThreadsExample01";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnStart1Clicked(View view) {
        Th01 th01=new Th01();
        Log.d(TAG, "Starting thread 1");
        th01.start();
        Log.d(TAG, "Thread 1 started");
    }

    public void onBtnStart2Clicked(View view) {
        Thread th02=new Thread(new Run01());
        Log.d(TAG, "Starting thread 2");
        th02.start();
        Log.d(TAG, "Thread 2 started");
    }
}
