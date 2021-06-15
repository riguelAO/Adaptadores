package com.example.adaptadores;

import android.content.Intent;
import android.os.Bundle;

import com.example.adaptadores.Activitys.AgenciasActivity;
import com.example.adaptadores.Activitys.DestinosActivity;
import com.example.adaptadores.Activitys.HotelesActivity;
import com.example.adaptadores.Activitys.RestaurantsActivity;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {

    Button destinos, restaurant,agencias,iglesias, conversor, hoteles , mapa , informacion, compartir ,favoritos , cerca, buscar ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());

        destinos = findViewById(R.id.btn_destinos);
        restaurant = findViewById(R.id.btn_restaurante);
        agencias = findViewById(R.id.btn_agencias);
        iglesias = findViewById(R.id.btn_museos);
        conversor = findViewById(R.id.btn_conversor);
        hoteles = findViewById(R.id.btn_hoteles);
        mapa = findViewById(R.id.btn_mapa);
        informacion = findViewById(R.id.btn_informacion);
        compartir = findViewById(R.id.bt_compartir);
        favoritos = findViewById(R.id.bt_favoritos);
        cerca = findViewById(R.id.bt_cerca);
        buscar = findViewById(R.id.bt_buscar);


        destinos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, DestinosActivity.class);
                startActivity(intent);
            }
        });

        agencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, AgenciasActivity.class);
                startActivity(intent);
            }
        });

        hoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, HotelesActivity.class);
                startActivity(intent);
            }
        });
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, RestaurantsActivity.class);
                startActivity(intent);
            }
        });

    }
}


