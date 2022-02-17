package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer furelise = MediaPlayer.create(this, R.raw.furelise);

        TextView text1 = findViewById(R.id.textbox);
        ImageView image1 = findViewById(R.id.imageBox);
        Button play = findViewById(R.id.play);
        Button pause = findViewById(R.id.pause);

        pause .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               furelise.pause();
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               furelise.start();
            }
        });
    }
}