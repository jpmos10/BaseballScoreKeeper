package com.example.android.baseballscorekeeper;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity{
    int HomeStrike = 0;
    int HomeBall = 0;
    int HomeOut = 0;
    int HomeScore = 0;
    int VisitingStrike = 0;
    int VisitingBall = 0;
    int VisitingOut = 0;
    int VisitingScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addHomeStrike(View view){
            if (HomeStrike = 3) {
                HomeOut = HomeOut + 1
        }
    public void addHomeBall(View view) {
    }

    public void addHomeOuts(View view) {
    }
    public void addHomeRunScored(View view) {
    }
}

    public void addVisitorStrike(View view) {
        if ()
    }

    public void addVisitorRunScored(View view) {
    }

    public void addVisitorBall(View view) {
    }

    public void addVisitorOuts(View view) {
    }

    public void resetScore(View view) {
    }



