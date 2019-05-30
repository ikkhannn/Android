package com.example.threadstates;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    static MainActivity ma;
    Handler handler;
    public static final String TAG="ThreadsExample03";
    String data="Critical Data";
    final String update_text="update";
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.update);
    ma=this;

        handler = new Handler(new Handler.Callback(){
            @Override
            public boolean handleMessage(Message msg) {

                if(msg.what==1) {

                    Bundle data=msg.getData();
                    String s=data.getString("s");

                    tv.append("\n"+s);
                }
                return false;
            }
        });

    }

    public void onBtnRunClicked(View view) {
        MyThread th=new MyThread(data);

       // Log.i(TAG, th.getState().toString());
        MainActivity.ma.HandleLog(th.getState().toString());
        synchronized (data) {
            th.start();

           // Log.i(TAG, th.getState().toString());
            MainActivity.ma.HandleLog(th.getState().toString());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Log.e(TAG, e.getMessage());
            }

           // Log.d(TAG, th.getState().toString());

            MainActivity.ma.HandleLog(th.getState().toString());
        }

        try {
            Thread.sleep(500);
           // Log.i(TAG, th.getState().toString());
            MainActivity.ma.HandleLog(th.getState().toString());

            Thread.sleep(1000);
           // Log.i(TAG, th.getState().toString());
            MainActivity.ma.HandleLog(th.getState().toString());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadB b = new ThreadB();

        b.start();


        synchronized(this){

                for(int i=0; i<100 ; i++){



                }


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

                notify();


              //  Log.d(TAG, Thread.State);


           // Log.d(TAG, b.getState().toString());
            MainActivity.ma.HandleLog(b.getState().toString());
        }





    }

    public void HandleLog(String m) {
        Message msg=new Message();
        msg.what=1;
        Bundle data=msg.getData();
        data.putString("s",m);
        handler.sendMessage(msg);
    }



}
