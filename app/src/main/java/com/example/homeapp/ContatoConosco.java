package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;

public class ContatoConosco extends AppCompatActivity {

   ImageView imageviewvoltarHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato_conosco);

        imageviewvoltarHome = findViewById(R.id.imgbtn_telacontatoconosco_voltartelaanterior);
        imageviewvoltarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarhome = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(voltarhome);

            }
        });
    }
}