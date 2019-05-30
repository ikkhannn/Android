package com.example.lab9boundservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MyService imranService;
    boolean isBound = false;

    EditText add1;
    EditText add2;
    EditText sub1;
    EditText sub2;
    EditText mul1;
    EditText mul2;
    EditText div1;
    EditText div2;
    EditText add;
    EditText sub;
    EditText mul;
    EditText div;


    Button calcAdd;
    Button calcMul;
    Button calcDiv;
    Button calcSub;




    public void showTime(View view){
        String currenTime =  imranService.getCurrentTime();



           }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add1=(EditText)findViewById(R.id.add1);
        add2=(EditText)findViewById(R.id.add2);
        sub1=(EditText)findViewById(R.id.sub1);
        sub2=(EditText)findViewById(R.id.sub2);
        mul1=(EditText)findViewById(R.id.mul1);
        mul2=(EditText)findViewById(R.id.mul2);
        div1=(EditText)findViewById(R.id.div1);
        div2=(EditText)findViewById(R.id.div2);


        calcAdd=(Button)findViewById(R.id.calcAdd);
        calcMul=(Button)findViewById(R.id.calcMul);
        calcSub=(Button)findViewById(R.id.calcSub);
        calcDiv=(Button)findViewById(R.id.calcDiv);

         add=(EditText)findViewById(R.id.add);
        sub=(EditText)findViewById(R.id.sub);
        mul=(EditText)findViewById(R.id.mul);
        div=(EditText)findViewById(R.id.div);




        Intent i = new Intent(this, MyService.class);
        bindService(i,myconnection, Context.BIND_AUTO_CREATE);
    }

    private final ServiceConnection myconnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MyService.MyLocalBinder binder = (MyService.MyLocalBinder) iBinder;
            imranService= binder.getService();

            if(imranService!=null){
                Log.d("imran","service chal rahi");
            }

            isBound = true;

        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            isBound = false;
        }
    };


    public void clickAdd(View view){


        Double ans=imranService.getAdd(Integer.valueOf(add1.getText().toString()),Integer.valueOf(add2.getText().toString()));

        add.setText(ans.toString());
    }

    public void clickMul(View view){
        Double ans=imranService.getMul(Integer.valueOf(mul1.getText().toString()),Integer.valueOf(mul2.getText().toString()));

        mul.setText(ans.toString());
    }
    public void clickSub(View view){
        Double ans=imranService.getSub(Integer.valueOf(sub1.getText().toString()),Integer.valueOf(sub2.getText().toString()));

        sub.setText(ans.toString());
    }
    public void clickDiv(View view){
        Double ans=imranService.getDiv(Integer.valueOf(div1.getText().toString()),Integer.valueOf(div2.getText().toString()));

        div.setText(ans.toString());
    }




}
