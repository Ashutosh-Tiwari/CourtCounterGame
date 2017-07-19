package com.example.ashutoshtiwari.gamescore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int foulTeamA = 0;
    private int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void score1A(View view) {
        scoreTeamA += 1;
        displayTeamA(scoreTeamA);
    }

    public void score2A(View view) {
        scoreTeamA += 2;
        displayTeamA(scoreTeamA);
    }

    public void score3A(View view) {
        scoreTeamA += 3;
        displayTeamA(scoreTeamA);
    }

    public void score1B(View view) {

        scoreTeamB += 1;
        displayTeamB(scoreTeamB);
    }

    public void score2B(View view) {

        scoreTeamB += 2;
        displayTeamB(scoreTeamB);
    }

    public void score3B(View view) {

        scoreTeamB += 3;
        displayTeamB(scoreTeamB);
    }

    public void foul1A(View view) {

        foulTeamA += 1;
        foulForTeamA(foulTeamA);
    }

    public void foul1B(View view) {

        foulTeamB += 1;
        foulForTeamB(foulTeamB);
    }

    private void displayTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    private void displayTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    private void foulForTeamA(int foulTeamA) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foulTeamA));
    }

    private void foulForTeamB(int foulTeamB) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foulTeamB));
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayTeamA(0);
        displayTeamB(0);
        foulForTeamA(0);
        foulForTeamB(0);
    }
}
