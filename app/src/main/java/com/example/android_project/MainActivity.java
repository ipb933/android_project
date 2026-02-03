package com.example.cat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etName, etColor, etTailLenght;
    Button btnAdd, btnViewCat;


    ArrayList<Cat> cats = new ArrayList<Cat>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText) findViewById(R.id.etName);
        etColor = (EditText) findViewById(R.id.etColor);
        etTailLenght = (EditText) findViewById(R.id.etTailLenght);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
        btnViewCat = (Button) findViewById(R.id.btnViewCat);
        btnViewCat.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if (view == btnAdd){
            try {
                double TailLenght = Double.parseDouble(etTailLenght.getText().toString());
                cats.add(new Cat(etName.getText().toString(), etColor.getText().toString(), TailLenght));
            } catch (Exception e){
                Toast.makeText(this, "not a legal TailLenght", Toast.LENGTH_SHORT).show();
            }
        }
        if (view == btnViewCat){
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("cats",cats);
            startActivity(intent);
        }
    }
}