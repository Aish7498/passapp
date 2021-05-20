package com.example.apppass;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private CardView requestCard , progressCard , historyCard , settingCard ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestCard = (CardView) findViewById(R.id.request);
        progressCard = (CardView) findViewById(R.id.progress);
        historyCard = (CardView) findViewById(R.id.history);
        settingCard = (CardView) findViewById(R.id.setting);

        requestCard.setOnClickListener(this);
        progressCard.setOnClickListener(this);
        historyCard.setOnClickListener(this);
        settingCard.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId())  {
            case R.id.request : i = new Intent(this, Request.class);startActivity(i);
                break;

            case R.id.progress : i = new Intent(this, Progress.class);startActivity(i);
                break;

            case R.id.history : i = new Intent(this, History.class);startActivity(i);
                break;

            case R.id.setting : i = new Intent(this, Setting.class);startActivity(i);
                break;


            default:
                break;
        }

    }
}