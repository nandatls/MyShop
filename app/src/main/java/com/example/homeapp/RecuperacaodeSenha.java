package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RecuperacaodeSenha extends AppCompatActivity {

    EditText editTextNovaSenha;
    EditText editTextRepetirNovaSenha;
    Button buttonRedefinirSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperacaode_senha);

        editTextNovaSenha = findViewById(R.id.edttxt_telarecuperacaodesenha_novasenha);
        editTextRepetirNovaSenha = findViewById(R.id.edttxt_telarecuperacaodesenha_repitanovasenha);
        buttonRedefinirSenha = findViewById(R.id.btn_telarecuperacaodesenha_redefinirsenha);

            buttonRedefinirSenha.setOnClickListener(view -> { //redireciona para tela cadastrar dados usuario
            Intent it = new Intent(getApplicationContext(),PerfilConta.class);
            startActivity(it);
            Toast.makeText(this, "Senha Atualizada com Sucesso !", Toast.LENGTH_SHORT).show();

        });

    }
}