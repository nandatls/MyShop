package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginVendas extends AppCompatActivity {
    Button botaoRegistrar;
    Button botaoEntrar;
    TextView textViewEsqueceuSenha;
    EditText editTextEmail;
    EditText editTextSenha;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_vendas);

        editTextEmail = findViewById(R.id.edttxt_telaloginvendas_email);
        editTextSenha = findViewById(R.id.edttxt_telaloginvendas_senha);


        botaoRegistrar = findViewById(R.id.btn_telaloginvendas_registrar);
        botaoRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrar = new Intent(getApplicationContext(),CadastrarDadosUsuario.class);
                startActivity(registrar);
            }
        });

        botaoEntrar = findViewById(R.id.btn_telaloginvendas_entrar);
        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent entrar = new Intent(getApplicationContext(), RegistrarVendedor.class);
                startActivity(entrar);
            }
        });

        textViewEsqueceuSenha = findViewById(R.id.txtv_telaloginvendas_esqueceusenha);
        textViewEsqueceuSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent senha = new Intent(getApplicationContext(), RecuperacaodeSenha.class);
                startActivity(senha);
            }
        });


    }
}