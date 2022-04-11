package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class PagamentoProduto extends AppCompatActivity {

    Button buttonPagar;
    ImageView imageViewImagemPrimeiroProduto;
    RadioButton radioButtonPagamentoCartao;
    RadioButton radioButtonPagamentoBoleto;
    RadioButton radioButtonEnderecoEntrega;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pagamento_produto);

        imageViewImagemPrimeiroProduto = findViewById(R.id.imgv_telapagamentoproduto_produto);

        Intent intent = getIntent();
        //String nome = intent.getStringExtra("nome");
        int produto = intent.getIntExtra("produto2", 1);

        //editTextDescricaoProduto.setText("Celular " + nome);
        imageViewImagemPrimeiroProduto.setImageResource(produto);


        //imageViewImagemPrimeiroProduto = findViewById(R.id.imgv_telapagamentoproduto_produto);
        radioButtonPagamentoCartao = findViewById(R.id.rbtn_telapagamentoproduto_cartaocredito);
        radioButtonPagamentoBoleto = findViewById(R.id.rbtn_telapagamentoproduto_boleto);
        radioButtonEnderecoEntrega = findViewById(R.id.rbtn_telapagamentoproduto_endereco);

        buttonPagar = findViewById(R.id.btn_telapagamentoproduto_pagar);
        buttonPagar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent pagar = new Intent(getApplicationContext(), MainActivity.class);
                Toast.makeText(getApplicationContext(), "Pagamento Efetuado com Sucesso !", Toast.LENGTH_SHORT).show();

                startActivity(pagar);
            }
        });


    }
}