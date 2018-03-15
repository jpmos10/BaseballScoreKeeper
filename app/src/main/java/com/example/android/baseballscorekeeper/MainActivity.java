package com.example.android.baseballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int HomeStrike = 0;
    int HomeBall = 0;
    int HomeOut = 0;
    int HomeScore = 0;
    int VisitingStrike = 0;
    int VisitingBall = 0;
    int VisitingOuts = 0;
    int VisitingScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForHomeScore(0);
        displayForHomeStrike(0);
        displayForHomeBall(0);
        displayForHomeOut(0);
        displayForVisitingScore(0);
        displayForVisitingStrike(0);
        displayForVisitingBall(0);
        displayForVisitingOut(0);


    }

    public void addHomeStrike(View view) {
        if (HomeStrike == 2) {
            HomeOut++;
            HomeStrike = 0;
            HomeBall = 0;
            displayForHomeStrike(HomeStrike);
            displayForHomeOut(HomeOut);
            displayForHomeBall(HomeBall);

        } else if (HomeOut == 3) {
            HomeOut = 0;
            displayForHomeOut(HomeOut);
        } else {
            HomeStrike++;
        }
        displayForHomeStrike(HomeStrike);
    }

    public void addHomeBall(View view) {
        if (HomeBall == 4) {
            HomeBall = 0;
        } else {
            HomeBall++;
        }
        displayForHomeBall(HomeBall);
    }

    public void addHomeOuts(View view) {
        if (HomeOut == 3) {
            HomeOut = 0;
            displayForHomeOut(HomeOut);
        } else {
            HomeOut++;
        }
        displayForHomeOut(HomeOut);
    }

    public void addHomeRunScored(View view) {
        HomeScore++;
        displayForHomeScore(HomeScore);
    }

    public void addVisitingStrike(View view) {
        if (VisitingStrike == 2) {
            VisitingOuts++;
            VisitingStrike = 0;
            VisitingBall = 0;
            displayForVisitingStrike(VisitingStrike);
            displayForVisitingOut(VisitingOuts);
            displayForVisitingBall(VisitingBall);

        } else if (VisitingOuts == 3) {
            VisitingOuts = 0;
            displayForVisitingOut(VisitingOuts);
        } else {
            VisitingStrike++;
        }
        displayForVisitingStrike(VisitingStrike);
    }


    public void addVisitingBall(View view) {
        if (VisitingBall == 4) {
            VisitingBall = 0;
        } else {
            VisitingBall++;
        }
        displayForVisitingBall(VisitingBall);
    }

    public void addVisitingOuts(View view) {
        if (VisitingOuts == 3) {
            VisitingOuts = 0;
            displayForVisitingOut(VisitingOuts);
        } else {
            VisitingOuts++;
        }
        displayForVisitingOut(VisitingOuts);
    }


    public void addVisitingRunScored(View view) {
        VisitingScore++;
        displayForVisitingScore(VisitingScore);
    }

    public void resetScore(View view) {
        HomeStrike = 0;
        HomeBall = 0;
        HomeOut = 0;
        HomeScore = 0;
        VisitingStrike = 0;
        VisitingBall = 0;
        VisitingOuts = 0;
        VisitingScore = 0;
        displayForHomeScore(HomeScore);
        displayForHomeStrike(HomeStrike);
        displayForHomeBall(HomeBall);
        displayForHomeOut(HomeOut);
        displayForVisitingScore(VisitingScore);
        displayForVisitingStrike(VisitingStrike);
        displayForVisitingBall(VisitingBall);
        displayForVisitingOut(VisitingOuts);
    }

    public void displayForHomeScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeTeam_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForHomeStrike(int strike) {
        TextView scoreView = (TextView) findViewById(R.id.homeTeam_strike);
        scoreView.setText(String.valueOf(strike));
    }

    public void displayForHomeBall(int ball) {
        TextView scoreView = (TextView) findViewById(R.id.homeTeam_ball);
        scoreView.setText(String.valueOf(ball));
    }

    public void displayForHomeOut(int outs) {
        TextView scoreView = (TextView) findViewById(R.id.homeTeam_outs);
        scoreView.setText(String.valueOf(outs));
    }

    public void displayForVisitingScore(int VisitingScore) {
        TextView scoreView = (TextView) findViewById(R.id.VisitingTeam_score);
        scoreView.setText(String.valueOf(VisitingScore));
    }

    public void displayForVisitingStrike(int strike) {
        TextView scoreView = (TextView) findViewById(R.id.VisitingTeam_strike);
        scoreView.setText(String.valueOf(strike));
    }

    public void displayForVisitingBall(int ball) {
        TextView scoreView = (TextView) findViewById(R.id.VisitingTeam_ball);
        scoreView.setText(String.valueOf(ball));
    }

    public void displayForVisitingOut(int outs) {
        TextView scoreView = (TextView) findViewById(R.id.VisitingTeam_outs);
        scoreView.setText(String.valueOf(outs));
    }

}


