package com.example.lab9boundservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyService extends Service {
    private final IBinder bindingObject = new MyLocalBinder();

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return bindingObject;
    }
    public  String getCurrentTime(){
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss",         Locale.getDefault());
        return (df.format(new Date()));

    }

    public Double getAdd(int num1,int num2){

       int num=num1+num2;
        return Double.valueOf(num);
    }

    public Double getSub(int num1,int num2){

        int num=num1-num2;
        return Double.valueOf(num);
    }
    public Double getDiv(int num1,int num2){

        int num=num1/num2;
        return Double.valueOf(num);
    }
    public Double getMul(int num1,int num2){

        int num=num1*num2;
        return Double.valueOf(num);
    }


    public  class MyLocalBinder extends Binder {
        public MyService getService(){
            return MyService.this;
        }
    }
}
