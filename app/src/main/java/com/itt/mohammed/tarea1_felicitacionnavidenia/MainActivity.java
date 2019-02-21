package com.itt.mohammed.tarea1_felicitacionnavidenia;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.media.MediaPlayer.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miFuente = Typeface.createFromAsset(getAssets(), "HappyBirthday.ttf");
        TextView titulo = (TextView) findViewById(R.id.titulo);
        titulo.setTypeface(miFuente);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.birthday_song);
        mediaPlayer.start();
    }
}
