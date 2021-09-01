package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BasketCourtActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    public void referToTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void referToTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket_court);
        referToTeamA(scoreTeamA);
        referToTeamB(scoreTeamB);
    }

    public void btnScoreTwoA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayTeamA(scoreTeamA);
    }

    public void btnScoreTreeA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamA(scoreTeamA);
    }

    public void btnScoreFreeTrowA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamA(scoreTeamA);
    }

    public void btnScoreTwoB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayTeamB(scoreTeamB);
    }

    public void btnScoreTreeB (View view){
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);
    }

    public  void btnFreeTrowB (View view){
        scoreTeamB = scoreTeamB + 1;
        displayTeamB(scoreTeamB);
    }

    private void displayTeamA(int scoreTeamA) {
        TextView countView = findViewById(R.id.score_team_a);
        countView.setText("" + scoreTeamA);
    }

    public void displayTeamB(int scoreTeamB) {
        TextView countView = findViewById(R.id.score_team_b);
        countView.setText("" + scoreTeamB);
    }

    public void btnReset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamB(scoreTeamB);
        displayTeamA(scoreTeamA);
    }
}


