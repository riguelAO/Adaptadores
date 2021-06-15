package com.example.adaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.adaptadores.Activitys.DestinosActivity;

public class MainActivity extends AppCompatActivity {
    public static final long SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void bienvenido(View view) {

        startActivity(new Intent(this,MenuPrincipal.class));
    }
}