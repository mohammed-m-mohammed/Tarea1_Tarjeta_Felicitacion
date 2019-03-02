package com.itt.mohammed.tarea1_felicitacionnavidenia;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import static android.media.MediaPlayer.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miFuente = Typeface.createFromAsset(getAssets(), "HappyBirthday.ttf");
        TextView titulo = (TextView) findViewById(R.id.titulo);
        TextView texto2 = (TextView) findViewById(R.id.textView2);
        TextView texto3 = (TextView) findViewById(R.id.textView3);

        titulo.setTypeface(miFuente);

        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        titulo.startAnimation(animacion);

        Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slideup);
        texto2.startAnimation(slideUp);
        texto3.startAnimation(slideUp);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.birthday_song);
        mediaPlayer.start();
    }
}
