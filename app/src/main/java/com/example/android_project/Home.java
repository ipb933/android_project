package com.example.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity  implements View.OnClickListener{

    Button btnAdd,btnShowRobots, btnShowGames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
        btnShowRobots = (Button) findViewById(R.id.btnShowRobots);
        btnShowRobots.setOnClickListener(this);
        btnShowGames = (Button) findViewById(R.id.btnShowGames);
        btnShowGames.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if (view == btnAdd)
        {

        }
    }
}