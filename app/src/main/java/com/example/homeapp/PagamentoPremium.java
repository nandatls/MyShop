package com.example.homeapp;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class PagamentoPremium extends AppCompatActivity {


    RadioButton radioButtonOpcaoCartao;
    RadioButton radioButtonOpcaoBoleto;
    Button buttonPagar;

    // menu
    ImageButton imageButtonvender;
    ImageButton imageButtonFaleConosco;
    ImageButton imageButtonListaCategorias;
    ImageButton imageButtonCarrinho;
    ImageButton imageButtonConta;
    ImageButton imageButtoninicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pagamento_premium);


        radioButtonOpcaoCartao = findViewById(R.id.rdbtn_telapagamentopremium_cartao);
        radioButtonOpcaoBoleto = findViewById(R.id.rdbtn_telaPagamentoPremium_boleto);

        buttonPagar = findViewById(R.id.btn_telapagamentopremium_pagar);
        buttonPagar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent pagar = new Intent(getApplicationContext(), MainActivity.class);
                Toast.makeText(getApplicationContext(), "Pagamento Efetuado com Sucesso !", Toast.LENGTH_SHORT).show();
                startActivity(pagar);

            }
        });

        //menu

        imageButtonvender = findViewById(R.id.imgbtn_telapagamentopremium_vender);
        imageButtonvender.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent vender= new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(vender);
            }
        });

        imageButtonFaleConosco = findViewById(R.id.imgbtn_telapagamentopremium_ajuda);
        imageButtonFaleConosco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent suporte= new Intent(getApplicationContext(), ContatoConosco.class);
                startActivity(suporte);
            }
        });

        imageButtonListaCategorias = findViewById(R.id.imgbtn_telapagamentopremium_listacateg);
        imageButtonListaCategorias.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent lista = new Intent(getApplicationContext(), CategoriasProdutos.class);
                startActivity(lista);
            }
        });

        imageButtonCarrinho = findViewById(R.id.imgbtn_telapagamentopremium_carrinho);
        imageButtonCarrinho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent carrinho = new Intent(getApplicationContext(), CarrinhodeProdutos.class);
                startActivity(carrinho);
            }
        });

        imageButtonConta = findViewById(R.id.imgbtn_telapagamentopremium_perfil);
        imageButtonConta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent conta = new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(conta);
            }
        });

        imageButtoninicial = findViewById(R.id.imgbtn_telapagamentopremium_home);
        imageButtoninicial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
            }
        });


    }
}