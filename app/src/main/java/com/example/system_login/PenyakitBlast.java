package com.example.system_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PenyakitBlast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit_blast);
    }
    public void Kendali(View view){
        Intent intent = new Intent(PenyakitBlast.this, PengendalianBlast.class);
        startActivity(intent);
    }
}
