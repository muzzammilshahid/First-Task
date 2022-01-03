package com.example.task;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button firstButton = findViewById(R.id.button);
        Button secondButton = findViewById(R.id.button2);

        firstButton.setOnClickListener(v -> {
            ImageView img= findViewById(R.id.imageView);
            img.setImageResource(R.drawable.second);
        });


        secondButton.setOnClickListener(v -> {
            ImageView img= findViewById(R.id.imageView);
            img.setImageResource(R.drawable.first);
        });

    }
}