package com.example.uno.tennis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counterA;
    private TextView counterB;
    private Integer teamCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INITIALIZING VARIABLES
        counterA = findViewById(R.id.counterA);
        counterB = findViewById(R.id.counterB);

    }

    //FUNCTIONS FOR THE BUTTONS
    public void addOneA(View v){

        counterA.setText(String.valueOf(15));
    }

    public void addOneB(View v){

        counterB.setText(String.valueOf(15));
    }

    public void addTwoA(View v){
        teamCounter = Integer.parseInt(counterA.getText().toString());

        //SETTING NEW SCORE
        counterA.setText(String.valueOf(30));
    }

    public void addThreeA(View v){

        counterA.setText(String.valueOf(40));
    }

    public void addTwoB(View v){

        counterB.setText(String.valueOf(30));
    }

    public void addThreeB(View v){

        //SETTING NEW SCORE
        counterB.setText(String.valueOf(40));
    }

    //FUNCTION FOR RESET BUTTON
    public void resetTeams(View v) {
        //SETTING TEXTVIEWS TO 0
        counterA.setText("0");
        counterB.setText("0");
    }
}
