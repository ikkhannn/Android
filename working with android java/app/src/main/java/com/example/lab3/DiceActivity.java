package com.example.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        Button rollButton = (Button) findViewById(R.id.rollbutton);
        final ImageView leftDice = (ImageView) findViewById(R.id.imageView_Leftdice);
        final ImageView rightDice = (ImageView) findViewById(R.id.imageView_Rightdice);
        final int[] diceArray = {
                R.drawable.dice_1,
                R.drawable.dice_2,
                R.drawable.dice_3,
                R.drawable.dice_4,
                R.drawable.dice_5,
                R.drawable.dice_6,
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("1", "Button has been Pressed ");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("Dice", "" + number);
                leftDice.setImageResource(diceArray[number]);
                number = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);

            }
        });

    }
}
