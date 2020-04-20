package com.example.system_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PenyakitTungro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit_tungro);
    }
    public void Kendalipindah(View view){
        Intent intent = new Intent(PenyakitTungro.this, PengendalianTungro.class);
        startActivity(intent);
    }
}
