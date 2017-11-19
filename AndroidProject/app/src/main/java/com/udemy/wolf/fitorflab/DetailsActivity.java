package com.udemy.wolf.fitorflab;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity
public class DetailsActivity extends AppCompatActivity {

    @ViewById
    LinearLayout mainBG;

    @ViewById
    TextView headerTxt;

    @ViewById
    ImageView mainImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);

        headerTxt.setText(exerciseTitle);

        Resources.Theme theme = getApplicationContext().getTheme();

        // TODO: These values should all be grouped into a class and stored in a config XML and loaded by ID

        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS))
        {
            mainBG.setBackgroundColor(getResources().getColor(R.color.sectionWeight, theme));
            mainImg.setImageDrawable(getResources().getDrawable(R.drawable.weight, theme));
        }
        else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA))
        {
            mainBG.setBackgroundColor(getResources().getColor(R.color.sectionYoga, theme));
            mainImg.setImageDrawable(getResources().getDrawable(R.drawable.lotus, theme));
        }
        else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_CARDIO))
        {
            mainBG.setBackgroundColor(getResources().getColor(R.color.sectionCardio, theme));
            mainImg.setImageDrawable(getResources().getDrawable(R.drawable.heart, theme));
        }
    }
}
