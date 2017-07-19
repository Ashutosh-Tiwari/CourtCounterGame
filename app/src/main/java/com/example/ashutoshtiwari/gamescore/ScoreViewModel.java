package com.example.ashutoshtiwari.gamescore;

import android.arch.lifecycle.ViewModel;

/**
 * Created by Ashutosh.tiwari on 19/07/17.
 */

public class ScoreViewModel extends ViewModel {

    private int scoreTeamA = 0;

    private int scoreTeamB = 0;

    private int foulTeamA = 0;

    private int foulTeamB = 0;

    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public void setScoreTeamA(int socreTeamA) {
        this.scoreTeamA = socreTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }

    public int getFoulTeamA() {
        return foulTeamA;
    }

    public void setFoulTeamA(int foulTeamA) {
        this.foulTeamA = foulTeamA;
    }

    public int getFoulTeamB() {
        return foulTeamB;
    }

    public void setFoulTeamB(int foulTeamB) {
        this.foulTeamB = foulTeamB;
    }
}
