package com.example.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final Random RANDOM = new Random();
    private Button rollDice;
    private ImageView imageView1, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollDice=findViewById(R.id.rollDice);
        imageView1=findViewById(R.id.diceF);
        imageView2=findViewById(R.id.diceS);

        rollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1= randomRoll();
                int val2= randomRoll();

                int res1 =getResources().getIdentifier("dice" + val1, "drawable", "com.example.diceroll");
                int res2 =getResources().getIdentifier("dice" + val2, "drawable", "com.example.diceroll");

            imageView1.setImageResource(res1);
            imageView2.setImageResource(res2);
            }

        });
    }
    public static int randomRoll(){
        return RANDOM.nextInt(6)+1;

    }
}
