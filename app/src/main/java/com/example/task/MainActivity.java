package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button firstbutton = (Button) findViewById(R.id.button);
        Button secondbutton = (Button) findViewById(R.id.button2);

        firstbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img= (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.second);
            }
        });


        secondbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img= (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.first);
            }
        });

    }
}