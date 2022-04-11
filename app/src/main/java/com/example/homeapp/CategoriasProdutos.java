package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CategoriasProdutos extends AppCompatActivity {


    Button buttonPrimeiraCategoria;
    Button buttonSegundaCategoria;
    Button buttonTerceiraCategoria;
    Button buttonQuartaCategoria;
    Button buttonQuintaCategoria;
    Button buttonSextaCategoria;
    Button buttonSetimaCategoria;

    //menu

    ImageButton imageButtonvender;
    ImageButton imageButtonFaleConosco;
    ImageButton imageButtonListaCategorias;
    ImageButton imageButtonCarrinho;
    ImageButton imageButtonConta;
    ImageButton imageButtonHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias_produtos);

        buttonPrimeiraCategoria = findViewById(R.id.btn_telacategoriasprodutos_primeiroproduto);
        buttonTerceiraCategoria = findViewById(R.id.btn_telacategoriasprodutos_terceiroproduto);
        buttonQuartaCategoria = findViewById(R.id.btn_telacategoriasprodutos_quartoproduto);
        buttonQuintaCategoria = findViewById(R.id.btn_telacategoriasprodutos_quintoproduto);
        buttonSextaCategoria = findViewById(R.id.btn_telacategoriasprodutos_sextoproduto);
        buttonSetimaCategoria = findViewById(R.id.btn_telacategoriasprodutos_setimoproduto);


        buttonSegundaCategoria = findViewById(R.id.btn_telacategoriasprodutos_segundoproduto);
        buttonSegundaCategoria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent busca = new Intent(getApplicationContext(), Adicionarcarrinhodalistadeprodutosenc.class);
                startActivity(busca);
            }
        });

        //menu

        imageButtonvender = findViewById(R.id.imgbtn_telacategoriasprodutos_vender);
        imageButtonvender.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent vender= new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(vender);
            }
        });

        imageButtonFaleConosco = findViewById(R.id.imgbtn_telacategoriasprodutos_ajuda);
        imageButtonFaleConosco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent suporte= new Intent(getApplicationContext(), ContatoConosco.class);
                startActivity(suporte);
            }
        });

        imageButtonListaCategorias = findViewById(R.id.imgbtn_telacategoriasprodutos_listacateg);
        imageButtonListaCategorias.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent lista = new Intent(getApplicationContext(), CategoriasProdutos.class);
                startActivity(lista);
            }
        });

        imageButtonCarrinho = findViewById(R.id.imgbtn_telacategoriasprodutos_carrinho);
        imageButtonCarrinho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent carrinho = new Intent(getApplicationContext(), CarrinhodeProdutos.class);
                startActivity(carrinho);
            }
        });

        imageButtonConta = findViewById(R.id.imgbtn_telacategoriasprodutos_perfil);
        imageButtonConta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent conta = new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(conta);
            }
        });

        imageButtonHome = findViewById(R.id.imgbtn_telacategoriasprodutos_home);
        imageButtonHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
            }
        });

    }
}