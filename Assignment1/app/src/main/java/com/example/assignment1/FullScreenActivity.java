package com.example.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FullScreenActivity extends AppCompatActivity {


    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

    }

    public void CloseFullScreen(View v){
        finish();
    }

}
