package com.example.lab8services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.BtnStart);
        btn2=(Button)findViewById(R.id.BtnStop);

    }

    public void StartMyService(View v){

        Intent i=new Intent(this,MyService.class);
        startService(i);
    }

    public void StopMyService(View v){
        Intent ii=new Intent(this,MyService.class);
        stopService(ii);
    }

}
