package com.example.eri.appconteggiopuntivit;


    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.widget.TextView;

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
        eriScore = eriScore - 5;
        displayForEri(eriScore);
    }

    private void displayForEri(int score) {
        TextView scoreView = (TextView) findViewById(R.id.eri_score);
        scoreView.setText("" + score);
    }
/*
* Team A Code finish
* */

    /*
    * Team B Code Started
    * */
    public void vitPlusFiveScore(View view) {

        vitScore = vitScore + 5;
        displayForEri(vitScore);
    }

    public void vitPlusTenScore(View view) {
        vitScore = vitScore + 10;
        displayForEri(vitScore);
    }

    public void vitMinusFiveScore(View view) {
        vitScore = vitScore - 5;
        displayForEri(vitScore);
    }

    private void displayForVit(int score) {
        TextView scoreView = (TextView) findViewById(R.id.vit_score);
        scoreView.setText("" + score);
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