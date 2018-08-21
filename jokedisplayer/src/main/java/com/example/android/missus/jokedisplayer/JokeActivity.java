package com.example.android.missus.jokedisplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public final static String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeText = findViewById(R.id.joke);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra(JOKE)) {
            jokeText.setText(intent.getStringExtra(JOKE));
        } else {
            jokeText.setText(R.string.no_joke);
        }
    }
}
