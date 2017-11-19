package com.udemy.wolf.fitorflab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity
public class MainActivity extends AppCompatActivity {

    public static final String EXERCISE_WEIGHTS = "Weight lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Running";

    @Click
    void weightBtn()
    {
        this.loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);
    }

    @Click
    void yogaBtn()
    {
        this.loadDetailActivity(MainActivity.EXERCISE_YOGA);
    }

    @Click
    void cardioBtn()
    {
        this.loadDetailActivity(MainActivity.EXERCISE_CARDIO);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void loadDetailActivity(String exerciseTitle)
    {

    }
}
