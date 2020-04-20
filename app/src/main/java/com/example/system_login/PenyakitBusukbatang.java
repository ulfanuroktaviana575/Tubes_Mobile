package com.example.system_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class PenyakitBusukbatang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit_busukbatang);
        TextView textView = findViewById(R.id.ciri);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
    public void Pindah(View view){
        Intent intent = new Intent(PenyakitBusukbatang.this, PengendalianBusukbatang.class);
        startActivity(intent);
    }
}
