package com.example.system_login;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TentangPenyakit extends AppCompatActivity {
    TextView hawar;
    TextView blast;
    TextView bercak;
    TextView busuk;
    TextView tungro;
    TextView pelepah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentangpenyakit);
        hawar = findViewById(R.id.text1);
        blast = findViewById(R.id.text2);
        bercak= findViewById(R.id.text3);
        busuk = findViewById(R.id.text4);
        tungro = findViewById(R.id.text5);
        pelepah = findViewById(R.id.text6);
        hawar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TentangPenyakit.this, PenyakitHawar.class);
                startActivity(intent);
            }
        });
        blast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TentangPenyakit.this, PenyakitBlast.class);
                startActivity(intent);
            }
        });
        bercak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TentangPenyakit.this, PenyakitBercak.class);
                startActivity(intent);
            }
        });
        busuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TentangPenyakit.this, PenyakitBusukbatang.class);
                startActivity(intent);
            }
        });
        tungro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TentangPenyakit.this, PenyakitTungro.class);
                startActivity(intent);
            }
        });
        tungro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TentangPenyakit.this, BusukPelepah.class);
                startActivity(intent);
            }
        });
    }
    }
