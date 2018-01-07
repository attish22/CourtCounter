package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //** Scores for Team A
    int scoreTeamA = 0;

    //** Scores for Team B
    int scoreTeamB = 0;


    //**Reset
    public void reseScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is add +3 to team A.
     */
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3 ;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This method is add +2 to team A.
     */
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2 ;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This method is add +1 to team A.
     */
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1 ;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method is add +3 to team B.
     */
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3 ;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method is add +2 to team B.
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2 ;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method is add +1 to team B.
     */
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1 ;
        displayForTeamB(scoreTeamB);

    }
}

