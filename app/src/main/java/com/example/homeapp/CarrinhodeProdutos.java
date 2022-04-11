package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class CarrinhodeProdutos extends AppCompatActivity {

    //menu

    ImageButton imageButtonvenda;
    ImageButton imageButtonFaleConosco;
    ImageButton imageButtonListaCategorias;
    ImageButton imageButtonCarrinho;
    ImageButton imageButtonConta;
    ImageButton imageButtonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho_de_produtos);


        //menu

        imageButtonvenda = findViewById(R.id.imgbtn_telacarrinhodeprodutos_vender);
        imageButtonvenda.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent vender = new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(vender);
            }
        });

        imageButtonFaleConosco = findViewById(R.id.imgbtn_telacarrinhodeprodutos_ajuda);
        imageButtonFaleConosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent suporte = new Intent(getApplicationContext(), ContatoConosco.class);
                startActivity(suporte);
            }
        });

        imageButtonListaCategorias = findViewById(R.id.imgbtn_telacarrinhodeprodutos_listacateg);
        imageButtonListaCategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lista = new Intent(getApplicationContext(), CategoriasProdutos.class);
                startActivity(lista);
            }
        });

        imageButtonCarrinho = findViewById(R.id.imgbtn_telacarrinhodeprodutos_carrinho);
        imageButtonCarrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent carrinho = new Intent(getApplicationContext(), CarrinhodeProdutos.class);
                startActivity(carrinho);
            }
        });

        imageButtonConta = findViewById(R.id.imgbtn_telacarrinhodeprodutos_perfil);
        imageButtonConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conta = new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(conta);
            }
        });

        imageButtonHome = findViewById(R.id.imgbtn_telacarrinhodeprodutos_home);
        imageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
            }
        });

    }
}