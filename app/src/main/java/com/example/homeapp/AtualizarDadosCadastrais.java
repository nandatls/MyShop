package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class AtualizarDadosCadastrais extends AppCompatActivity {

    Button buttonAtualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atualizar_dados_cadastrais);


        buttonAtualizar = findViewById(R.id.btn_telaatualizardadoscadastrais_atualizar);
        buttonAtualizar.setOnClickListener(view -> {
            Intent it = new Intent(getApplicationContext(), PerfilConta.class);
            startActivity(it);
            Toast.makeText(this, "Dados atualizados com sucesso !", Toast.LENGTH_SHORT).show();


        });


    }
}