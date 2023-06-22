package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS=ELEMENTOS DE LA ACTIVIDAD
    MediaPlayer cancion;

    //METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cancion=MediaPlayer.create(this,R.raw.audio);
        cancion.start();

        //Temporizamos el splash
        TimerTask inicioAPP=new TimerTask() {
            @Override
            public void run() {
                //lanzo el HOME
                Intent lanzamiento=new Intent(MainActivity.this,Home.class);
                startActivity(lanzamiento);

            }
        };
        Timer tiempo=new Timer();
        tiempo.schedule(inicioAPP,10000);

    }
}