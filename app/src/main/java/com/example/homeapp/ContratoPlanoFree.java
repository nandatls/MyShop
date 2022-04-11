package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ContratoPlanoFree extends AppCompatActivity {

    Button buttonCadastroProduto;
    RadioButton radioButtonAceitarTermosF;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrato_plano_free);

        radioButtonAceitarTermosF = findViewById(R.id.rbtn_telacontratoplanofree_aceitedetermoscontrato);

        buttonCadastroProduto = findViewById(R.id.btn_telacontratoplanofree_cadastrarproduto);
        buttonCadastroProduto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent cadastro = new Intent(getApplicationContext(), RegistrarProduto.class);
                startActivity(cadastro);
            }
        });


    }
}