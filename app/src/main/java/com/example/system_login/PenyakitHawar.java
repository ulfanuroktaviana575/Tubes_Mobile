package com.example.system_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PenyakitHawar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit_hawar);

        }
    public void Kendali(View view){
        Intent intent = new Intent(PenyakitHawar.this, PengendalianHawar.class);
        startActivity(intent);
    }
}
