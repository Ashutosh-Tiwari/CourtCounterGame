package com.example.ashutoshtiwari.gamescore;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

/*
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int foulTeamA = 0;
    private int foulTeamB = 0;
*/

    ScoreViewModel scoreViewModel = new ScoreViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        displayTeamA(scoreViewModel.getScoreTeamA());
        displayTeamB(scoreViewModel.getScoreTeamB());
        foulForTeamA(scoreViewModel.getFoulTeamA());
        foulForTeamB(scoreViewModel.getFoulTeamB());
    }

    public void score1A(View view) {
        //scoreTeamA += 1;
        scoreViewModel.setScoreTeamA(scoreViewModel.getScoreTeamA() + 1);
        displayTeamA(scoreViewModel.getScoreTeamA());
    }

    public void score2A(View view) {
        //scoreTeamA += 2;
        scoreViewModel.setScoreTeamA(scoreViewModel.getScoreTeamA() + 2);
        displayTeamA(scoreViewModel.getScoreTeamA());
    }

    public void score3A(View view) {
        //scoreTeamA += 3;
        scoreViewModel.setScoreTeamA(scoreViewModel.getScoreTeamA() + 3);
        displayTeamA(scoreViewModel.getScoreTeamA());
    }

    public void score1B(View view) {
        //scoreTeamB += 1;
        scoreViewModel.setScoreTeamB(scoreViewModel.getScoreTeamB() + 1);
        displayTeamB(scoreViewModel.getScoreTeamB());
    }

    public void score2B(View view) {
        //scoreTeamB += 2;
        scoreViewModel.setScoreTeamB(scoreViewModel.getScoreTeamB() + 2);
        displayTeamB(scoreViewModel.getScoreTeamB());
    }

    public void score3B(View view) {
        //scoreTeamB += 3;
        scoreViewModel.setScoreTeamB(scoreViewModel.getScoreTeamB() + 3);
        displayTeamB(scoreViewModel.getScoreTeamB());
    }

    public void foul1A(View view) {
        //foulTeamA += 1;
        scoreViewModel.setFoulTeamA(scoreViewModel.getFoulTeamA() + 1);
        foulForTeamA(scoreViewModel.getFoulTeamA());
    }

    public void foul1B(View view) {
        //foulTeamB += 1;
        scoreViewModel.setFoulTeamB(scoreViewModel.getFoulTeamB() + 1);
        foulForTeamB(scoreViewModel.getFoulTeamB());
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
/*
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
*/
        scoreViewModel.setScoreTeamA(0);
        scoreViewModel.setScoreTeamB(0);
        scoreViewModel.setFoulTeamB(0);
        scoreViewModel.setFoulTeamA(0);

        displayTeamA(0);
        displayTeamB(0);
        foulForTeamA(0);
        foulForTeamB(0);
    }
}