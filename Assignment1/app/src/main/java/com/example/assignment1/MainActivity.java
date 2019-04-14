package com.example.assignment1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   public TextView tv;
    Intent IntentDialogueActivity;
    BroadcastReceiver BroadcastReceiverObject;
    Intent IntentFullScreenActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentDialogueActivity=new Intent(this,DialogueActivity.class);
        IntentFullScreenActivity=new Intent(this,FullScreenActivity.class);
        tv=(TextView)findViewById(R.id.textbox);
        IntentFilter filter=new IntentFilter("Message");

        BroadcastReceiverObject=new MyReceiver(this);
        registerReceiver(this.BroadcastReceiverObject,filter);




        tv.setMovementMethod(new ScrollingMovementMethod());
        Intent intent = new Intent();
        intent.setAction("Message");
        intent.putExtra("state","OnCreate - MainActivity");
        sendBroadcast(intent);

    }


    public void onClickFullScreen(View v) {

    startActivity(IntentFullScreenActivity);

    }

    public void onClickDialogue(View v){
        startActivity(IntentDialogueActivity);
    }


    @Override
    protected void onResume(){
        super.onResume();


            Intent intent = new Intent();
            intent.setAction("Message");
            intent.putExtra("state","OnResume - MainActivity");
            sendBroadcast(intent);


    }

    @Override
    protected void onStop(){
        super.onStop();

        Intent intent = new Intent();
        intent.setAction("Message");
        intent.putExtra("state","OnStop - MainActivity");
        sendBroadcast(intent);


    }
    @Override
    protected void onPause(){
        super.onPause();

        Intent intent = new Intent();
        intent.setAction("Message");
        intent.putExtra("state","OnPause - MainActivity");
        sendBroadcast(intent);

    }


    @Override
    protected void onStart() {
        super.onStart();

        Intent intent = new Intent();
        intent.setAction("Message");
        intent.putExtra("state","OnStart - MainActivity");
        sendBroadcast(intent);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Intent intent = new Intent();
        intent.setAction("Message");
        intent.putExtra("state","OnDestroy - MainActivity");
        sendBroadcast(intent);

    }
}