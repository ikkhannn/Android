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
    Intent IntentFullScreenActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentDialogueActivity=new Intent(this,DialogueActivity.class);
        IntentFullScreenActivity=new Intent(this,FullScreenActivity.class);
        tv=(TextView)findViewById(R.id.textbox);
        IntentFilter filter=new IntentFilter("Message");
        registerReceiver(r,filter);

        tv.setMovementMethod(new ScrollingMovementMethod());
    }


    public void onClickFullScreen(View v) {

    startActivity(IntentFullScreenActivity);

    }

    public void onClickDialogue(View v){
        startActivity(IntentDialogueActivity);
    }


    @Override
    public void onResume(){
        super.onResume();


            Intent intent = new Intent();
            intent.setAction("Message");
            intent.putExtra("OnResume","OnResume - MainActivity");
            sendBroadcast(intent);


    }

    @Override
    public void onStop(){
        super.onStop();



    }
    @Override
    public void onPause(){
        super.onPause();








    }
    BroadcastReceiver r=new BroadcastReceiver(){
        public void onReceive(Context context, Intent intent) {
           tv.append("On resume");
        }
    };




}