package com.example.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class CalculatorActivity extends AppCompatActivity {


String num1="";
String num2="";
String operand="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        final TextView TextView1=(TextView)findViewById(R.id.TextView1);
        Button Button7 = (Button) findViewById(R.id.rollbutton);
        Button Button8 = (Button) findViewById(R.id.rollbutton);
        Button Button9 = (Button) findViewById(R.id.rollbutton);
        Button ButtonDivide = (Button) findViewById(R.id.rollbutton);
        Button Button6 = (Button) findViewById(R.id.rollbutton);
        Button Button5 = (Button) findViewById(R.id.rollbutton);
        Button Button4 = (Button) findViewById(R.id.rollbutton);
        Button ButtonMultiply = (Button) findViewById(R.id.rollbutton);
        Button Button3 = (Button) findViewById(R.id.rollbutton);
        Button Button2 = (Button) findViewById(R.id.rollbutton);
        Button Button1 = (Button) findViewById(R.id.rollbutton);
        Button ButtonMinus = (Button) findViewById(R.id.rollbutton);
        Button ButtonC= (Button) findViewById(R.id.rollbutton);
        Button Button0= (Button) findViewById(R.id.rollbutton);
        Button ButtonEquals = (Button) findViewById(R.id.rollbutton);
        Button ButtonPlus = (Button) findViewById(R.id.rollbutton);
        String num1="";
        String num2="";



        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt= (String) TextView1.getText();
                TextView1.setText(txt+"1");

            }
        });


        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt= (String) TextView1.getText();
                TextView1.setText(txt+"2");

            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt= (String) TextView1.getText();
                TextView1.setText(txt+"3");

            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt= (String) TextView1.getText();
                TextView1.setText(txt+"4");

            }
        });Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt= (String) TextView1.getText();
                TextView1.setText(txt+"5");

            }
        });Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt= (String) TextView1.getText();
                TextView1.setText(txt+"6");

            }
        });Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt= (String) TextView1.getText();
                TextView1.setText(txt+"7");

            }
        });Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt= (String) TextView1.getText();
                TextView1.setText(txt+"8");

            }
        });Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt= (String) TextView1.getText();
                TextView1.setText(txt+"9");

            }
        });Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt= (String) TextView1.getText();
                TextView1.setText(txt+"0");

            }
        });ButtonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand="*";
            }
        });ButtonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand="/";
            }
        });ButtonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand="-";
            }
        });ButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            operand="+";

            }
        });ButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            TextView1.setText("");
            }
        });






    }
}
