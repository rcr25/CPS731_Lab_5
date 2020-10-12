package com.example.lab5;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    MediaPlayer intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        intro = new MediaPlayer();
        intro = MediaPlayer.create(this, R.raw.intro);
        intro.start();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                intro.stop();
                finish();
                startActivity(new Intent(Splash.this, ItemListActivity.class));

            }
        };
        Timer opening = new Timer();
        opening.schedule(task,5000);
    }
}
