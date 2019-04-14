package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DialogueActivity extends AppCompatActivity{

    public void onCreate(Bundle savedInstanceState){

    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_dialogue);
        Intent intent = new Intent();
        intent.setAction("Message");
        intent.putExtra("state","OnCreate - DialogueActivity");
        sendBroadcast(intent);

    }
// removed buttons because sir didn't include it in the sample apk app

//    public void CloseDialogue(View v){
//        finish();
//    }

    protected void onResume(){
        super.onResume();


        Intent intent = new Intent();
        intent.setAction("Message");
        intent.putExtra("state","OnResume - DialogueActivity");
        sendBroadcast(intent);


    }

    @Override
    protected void onStop(){
        super.onStop();

        Intent intent = new Intent();
        intent.setAction("Message");
        intent.putExtra("state","OnStop - DialogueActivity");
        sendBroadcast(intent);


    }
    @Override
    protected void onPause(){
        super.onPause();

        Intent intent = new Intent();
        intent.setAction("Message");
        intent.putExtra("state","OnPause - DialogueActivity");
        sendBroadcast(intent);

    }


    @Override
    protected void onStart() {
        super.onStart();

        Intent intent = new Intent();
        intent.setAction("Message");
        intent.putExtra("state","OnStart - DialogueActivity");
        sendBroadcast(intent);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Intent intent = new Intent();
        intent.setAction("Message");
        intent.putExtra("state","OnDestroy - DialogueActivity");
        sendBroadcast(intent);

    }


}
