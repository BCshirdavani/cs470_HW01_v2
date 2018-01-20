//*********************************************************
//
//  Author:         Beau Shirdavani
//  Date:           1-16-2018
//  Description:    cs470 hw 01
//                      Android app - number guessing game
//
//*********************************************************


package com.example.shymacbook.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static com.example.shymacbook.guessthenumber.R.id.GuessHere;



public class MainActivity extends AppCompatActivity {


    public static int rand1;
    public static int guessINT;
    public static int myGuessINT;
    Random randy = new Random();
    EditText guessINPUT = findViewById(R.id.GuessHere);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize the random number
//        rand1 = randy.nextInt(500);
        roll();
    }



    // make button actions
    // HINT button
    public void hint_butt_click(View view) {
        // implementation for HINT button action
        Toast.makeText(this, "Number = " + rand1, Toast.LENGTH_SHORT).show();
    }



    // SUBMIT button
    public void submit_butt_click(View view) {
        // take the guess input value from edit text field, and convert to integer
        String guessSTRING = guessINPUT.getText().toString();
        guessINT = Integer.parseInt(guessSTRING);
        if (guessINT == rand1){
            Toast.makeText(this, "CORRECT!", Toast.LENGTH_SHORT).show();
//            rand1 = randy.nextInt(500);
            roll();
        }
        else if (guessINT < rand1){
            Toast.makeText(this, "too low, guess higher...", Toast.LENGTH_SHORT).show();
        }
        else if (guessINT > rand1){
            Toast.makeText(this, "too high, guess lower...", Toast.LENGTH_SHORT).show();
        }
    }


    // roll function
    public void roll(){
        rand1 = randy.nextInt(500);
        System.out.println("rand1 = " + rand1);
    }




}