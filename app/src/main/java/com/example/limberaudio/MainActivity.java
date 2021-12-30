package com.example.limberaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnRock, btnSalsa, btnHuayno, btnElectro, btnCumbia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRock = findViewById(R.id.btn_rock);
        btnHuayno = findViewById(R.id.btn_huayno);
        btnSalsa = findViewById(R.id.btn_salsa);
        btnCumbia = findViewById(R.id.btn_cumbia);
        btnElectro = findViewById(R.id.btn_electro);

        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBtnRock();
            }

            private void llamarBtnRock() {
                Intent intent = new Intent(MainActivity.this,SonidoRock.class);
                startActivity(intent);
            }
        });

        btnHuayno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBtnHuayno();
            }

            private void llamarBtnHuayno() {
                Intent intent = new Intent(MainActivity.this,SonidoHuayno.class);
                startActivity(intent);
            }

        });

        btnSalsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBtnSalsa();
            }

            private void llamarBtnSalsa() {
                Intent intent = new Intent(MainActivity.this,SonidoSalsa.class);
                startActivity(intent);
            }
        });

        btnCumbia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBtnSalsa();
            }

            private void llamarBtnSalsa() {
                Intent intent = new Intent(MainActivity.this,SonidoCumbia.class);
                startActivity(intent);
            }

        });

        btnElectro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarBtnElectro();
            }

            private void llamarBtnElectro() {
                Intent intent = new Intent(MainActivity.this,SonidoElectro.class);
                startActivity(intent);
            }

        });

    }
}