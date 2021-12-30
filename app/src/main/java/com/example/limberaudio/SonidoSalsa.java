package com.example.limberaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SonidoSalsa extends AppCompatActivity {

    Button m1,m2,m3,m4,m5,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonido_salsa);

        m1 = findViewById(R.id.ms1);
        m2 = findViewById(R.id.ms2);
        m3 = findViewById(R.id.ms3);
        m4 = findViewById(R.id.ms4);
        m5 = findViewById(R.id.ms5);
        stop = findViewById(R.id.stop);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               MediaPlayer mp = MediaPlayer.create(SonidoSalsa.this, R.raw.sgotasdelluvia);
               mp.start();
               if(mp.isPlaying()){
                   stop.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           mp.stop();
                       }
                   });
               }
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(SonidoSalsa.this, R.raw.slocuraenamorarte);
                mp.start();
                if(mp.isPlaying()){
                    stop.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.stop();
                        }
                    });
                }
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(SonidoSalsa.this, R.raw.shazmeolividar);
                mp.start();
                if(mp.isPlaying()){
                    stop.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.stop();
                        }
                    });
                }
            }
        });

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(SonidoSalsa.this, R.raw.samoresnuestro);
                mp.start();
                if(mp.isPlaying()){
                    stop.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.stop();
                        }
                    });
                }
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(SonidoSalsa.this, R.raw.spequenascosas);
                mp.start();
                if(mp.isPlaying()){
                    stop.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.stop();
                        }
                    });
                }
            }
        });




    }
}