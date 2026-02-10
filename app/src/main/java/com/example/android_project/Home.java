package com.example.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Home extends AppCompatActivity implements View.OnClickListener{
    Button btnAdd, btnShowRobots, btnShowGames;
    ArrayList<Robot> robots = new ArrayList<>();
    ArrayList<RobotAtGame> robotsAtGame = new ArrayList<>();
    RobotsAtGameAdapter robotsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        robotsAdapter = new RobotsAtGameAdapter(this, 0, 0, robotsAtGame);
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
            Intent intent = new Intent(this, Add.class);
            addCat.launch(intent);
        }
        if (view == btnShowGames)
        {
            Intent intent = new Intent(this, ShowGames.class);
            intent.putExtra("games", robotsAtGame);
            startActivity(intent);
        }
    }

    private final ActivityResultLauncher<Intent> addCat =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                    result -> {
                        if (result.getResultCode() == RESULT_OK) {
                            if (result.getData() != null) {
                                RobotAtGame r   = (RobotAtGame) result.getData().getSerializableExtra("cat");
                                robotsAtGame.add(r);
                                robotsAdapter.notifyDataSetChanged();
                            }
                        } else if (result.getResultCode() == RESULT_CANCELED) {
                            Toast.makeText(this, "Cancel by User", Toast.LENGTH_SHORT).show();
                        }
                    });
}