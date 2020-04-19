package com.example.system_login;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class RegistrasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
    }

    public void Daftar(View view) {
        Intent intent = new Intent(RegistrasiActivity.this, MainActivity.class);
        startActivity(intent);
         }
}
