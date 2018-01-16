//*********************************************************
//
//  Author:         Beau Shirdavani
//  Date:           1-16-2018
//  Description:    cs470 hw 01
//                      Android app - number guessing game
//
//      Problem:    fail to get the edit text value
//                  and compare it with winning value
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
    public static int myGuessINT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the MY GUESS value from the edit text box
//        String value= GuessHere.getText().toString();
//        String value= (findViewById(R.id.GuessHere)).getContext().getText(');
//        myGuessINT=Integer.parseInt(value);
        EditText text = (EditText)findViewById(R.id.GuessHere);
        String value = text.getText().toString();
        myGuessINT = Integer.parseInt(value);

        // random number function
        Random randy = new Random();
        rand1 = randy.nextInt(500);
    }

    // make button actions
    // HINT button
    public void hint_butt_click(View view) {
        // implementation for HINT button action
        Toast.makeText(this,"Number = " + rand1,Toast.LENGTH_SHORT).show();
    }

    // SUBMIT button
    public void submit_butt_click(View view) {
        if(myGuessINT == rand1){
            Toast.makeText(this,"GOOD GUESS!",Toast.LENGTH_SHORT).show();
            Random randy2 = new Random();
            rand1 = randy2.nextInt(500);
        }
        else if (myGuessINT < rand1){
            Toast.makeText(this,"too low, guess higher...",Toast.LENGTH_SHORT).show();
        }
        else if (myGuessINT > rand1){
            Toast.makeText(this,"too high, guess lower...",Toast.LENGTH_SHORT).show();
        }
    }
}
