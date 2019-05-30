package com.example.lab8services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyService extends Service{
MediaPlayer mp;
    @Nullable
    @Override

   public IBinder onBind(Intent intent){
       Toast.makeText(getApplicationContext(),"onBind", Toast.LENGTH_SHORT).show();
       return null;
   }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(getApplicationContext(),"onCreate: Service Created",Toast.LENGTH_SHORT).show();
        mp=MediaPlayer.create(this, R.raw.song);
        mp.setLooping(true);




    }
@Override
    public int onStartCommand(Intent intent,int flags,int startId){
       Toast.makeText(getApplicationContext(),"Start Command : Service started",Toast.LENGTH_SHORT).show();

        mp.start();
       return super.onStartCommand(intent,flags,startId);


    }

@Override
    public void onDestroy(){
       Toast.makeText(getApplicationContext(),"onDestroy: Service Stopped",Toast.LENGTH_SHORT).show();
       super.onDestroy();
       mp.stop();
    }
}
