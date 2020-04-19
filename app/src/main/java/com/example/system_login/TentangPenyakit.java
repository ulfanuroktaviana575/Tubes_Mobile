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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentangpenyakit);
        hawar = findViewById(R.id.text1);
        blast = findViewById(R.id.text2);
        bercak= findViewById(R.id.text3);
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
    }
    }
