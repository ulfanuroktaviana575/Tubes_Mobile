package com.example.system_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PenyakitBercak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit_bercak);
    }
    public void Kendali(View view){
        Intent intent = new Intent(PenyakitBercak.this, PengendalianBercak.class);
        startActivity(intent);
    }
}
