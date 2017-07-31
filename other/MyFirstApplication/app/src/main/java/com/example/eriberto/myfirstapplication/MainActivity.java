package com.example.eriberto.myfirstapplication;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {
    int eriScore = 0;
    int vitScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * Team A Code Started
    * */
    public void eriPlusFiveScore(View view) {

        eriScore = eriScore + 5;
        displayForEri(eriScore);
    }

    public void eriPlusTenScore(View view) {
        eriScore = eriScore + 10;
        displayForEri(eriScore);
    }

    public void eriMinusFiveScore(View view) {
        displayMessage();

    }

    private void displayForEri(int score) {
        TextView scoreView = (TextView) findViewById(R.id.eri_score);
        scoreView.setText("" + score);
    }

    private void displayMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_Material_Dialog_Alert);
        builder.setTitle("Attenzione")
                .setMessage("Veronica Vit, non essere così crudele :(")
                .setPositiveButton(
                        "Ok, non lo faccio più",
                        new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
        /*
        TextView messageView = (TextView) findViewById(R.id.message);
        messageView.setText("Veronica Vit, non essere così crudele :(");
        */
    }
/*
* Team A Code finish
* */

    /*
    * Team B Code Started
    * */
    public void vitPlusFiveScore(View view) {

        vitScore = vitScore + 5;
        displayForVit(vitScore);
    }

    public void vitPlusTenScore(View view) {
        vitScore = vitScore + 10;
        displayForVit(vitScore);
    }

    public void vitMinusFiveScore(View view) {
        vitScore = vitScore-5;
        displayForVit(vitScore);
    }

    private void displayForVit(int score) {
        TextView scoreView = (TextView) findViewById(R.id.vit_score);
        scoreView.setText("" + score);
        if (score < 0) {
            scoreView.setTextColor(Color.RED);
        } else{
            scoreView.setTextColor(Color.BLACK);
        }
    }
     /*
    * Team B Code finish
    * */

    //Reset button code
    public void resetButton(View view) {
        eriScore = 0;
        vitScore = 0;
        displayForEri(0);
        displayForVit(0);

    }
}