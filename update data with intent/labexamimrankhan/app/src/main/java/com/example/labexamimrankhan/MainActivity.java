package com.example.labexamimrankhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgp;
RadioButton rdbtn;
RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    RadioButton rb5;

TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);
        rb4=(RadioButton)findViewById(R.id.rb4);
        rb5=(RadioButton)findViewById(R.id.rb5);
tv=(TextView)findViewById(R.id.tv);


    }

    public void onClickBtnUpdate(View v) {

        rdgp = (RadioGroup) findViewById(R.id.rdgpid);

        int selectedid = rdgp.getCheckedRadioButtonId();
        rdbtn=(RadioButton)findViewById(selectedid);



        Intent i = new Intent(MainActivity.this, UpdateActivity.class);



        startActivityForResult(i, 2);







    }
    protected void onActivityResult(int reqcode,int resultcode,Intent data){
        super.onActivityResult(reqcode,resultcode,data);

        if(resultcode != RESULT_CANCELED){
        if(reqcode==2){
            String message=data.getStringExtra("message");

            rdbtn.setText(message+"/100");

            int subject1=100;
            int subject2=100;
            int subject3=100;
            int subject4=100;
            int subject5=100;

            int totalmarks=subject1+subject2+subject3+subject4+subject5;

            int obtmarks1=Integer.parseInt(firstTwo(rb1.getText().toString()));
            int obtmarks2=Integer.parseInt(firstTwo(rb2.getText().toString()));
            int obtmarks3=Integer.parseInt(firstTwo(rb3.getText().toString()));
            int obtmarks4=Integer.parseInt(firstTwo(rb4.getText().toString()));
            int obtmarks5=Integer.parseInt(firstTwo(rb5.getText().toString()));


            int obtainedmarks=obtmarks1+obtmarks2+obtmarks3+obtmarks4+obtmarks5;

            Double per=Double.valueOf(obtainedmarks)/500;
            Double percentage=per*100;

            tv.append("Summary");


            tv.append("Total Obtained marks : "+obtainedmarks);
            tv.append("Total maximum marks : "+500);
            tv.append("Percentage"+ percentage);




        }
    }}

    public String firstTwo(String str) {
        return str.length() < 2 ? str : str.substring(0, 2);
    }


}
