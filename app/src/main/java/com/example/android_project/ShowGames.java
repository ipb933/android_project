package com.example.android_project;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ShowGames extends AppCompatActivity {
    ArrayList<RobotAtGame> robotsAtGame = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_games);
        Intent intent = getIntent();
        robotsAtGame = (ArrayList<RobotAtGame>) intent.getSerializableExtra("games");
    }
}