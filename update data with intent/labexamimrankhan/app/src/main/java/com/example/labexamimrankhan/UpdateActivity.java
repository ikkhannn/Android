package com.example.labexamimrankhan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class UpdateActivity extends AppCompatActivity {

EditText m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);



m=(EditText)findViewById(R.id.marksedit);


    }

    public void updatemarks(View v){

       int marks= Integer.parseInt(m.getText().toString());

        Intent i=new Intent();
        i.putExtra("message",String.valueOf(marks));
        setResult(2,i);
        finish();
    }

}
