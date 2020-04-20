package com.example.system_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BusukPelepah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busuk_pelepah);
    }
    public void Pindah(View view){
        Intent intent = new Intent(BusukPelepah.this, PengendalianBusukpelepah.class);
        startActivity(intent);
    }
}
