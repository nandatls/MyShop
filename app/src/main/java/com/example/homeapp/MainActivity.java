package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //menu
    ImageButton imageButtonCadastrarVendedor;
    ImageButton imageButtonFaleConosco;
    ImageButton imageButtonListaCategoria;
    ImageButton imageButtonCarrinho;
    ImageButton imageButtonConta;

    ImageButton imageButtonFiguraanterior;
    ImageButton imageButtonProximaFigura;
    ImageView imageViewFotoCarrossel;

    //utilizadas para levar dados para outra tela;
    ImageButton bicicletas;
    ImageButton produtoiphone;
    ImageButton camisas;
    ImageButton sapatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    TextView valorproduto00 = findViewById(R.id.txtv_telahome_celulares);
    //String iphonevalor = "3.400";
    //valorproduto00.setText(iphonevalor);
    TextView valorproduto01 = findViewById(R.id.txtv_telahome_bicicleta);
    TextView valorproduto02 = findViewById(R.id.txtv_telahome_camisas);
    TextView valorproduto03 = findViewById(R.id.txtv_telahome_sapatos);

        //trazendo img pra outra tela usando o tenis

      produtoiphone = findViewById(R.id.imgbtn_telahome_celulares);
      produtoiphone.setOnClickListener(View->{
          Intent detalhesDoProduto = new Intent(this, AdicionarProdutoCarrinho.class);
          //passar os dados
          detalhesDoProduto.putExtra("nome", valorproduto00.getText().toString());
          detalhesDoProduto.putExtra("produto", R.drawable.iphone);
          startActivity(detalhesDoProduto);
        });

        bicicletas = findViewById(R.id.imgbtn_telahome_bicicletas);
        bicicletas.setOnClickListener(View->{
            Intent detalhesDoProduto = new Intent(this, AdicionarProdutoCarrinho.class);
            //passar os dados
            detalhesDoProduto.putExtra("nome", valorproduto01.getText().toString());
            detalhesDoProduto.putExtra("produto", R.drawable.bicicleta);
            startActivity(detalhesDoProduto);
        });

        camisas = findViewById(R.id.imgbtn_telahome_camisas);
        camisas.setOnClickListener(View->{
            Intent detalhesDoProduto = new Intent(this, AdicionarProdutoCarrinho.class);
            //passar os dados
            detalhesDoProduto.putExtra("nome", valorproduto02.getText().toString());
            detalhesDoProduto.putExtra("produto", R.drawable.camisa);
            startActivity(detalhesDoProduto);
        });

        sapatos = findViewById(R.id.imgbtn_telahome_sapatos);
        sapatos.setOnClickListener(View->{
            Intent detalhesDoProduto = new Intent(this, AdicionarProdutoCarrinho.class);
            //passar os dados
            detalhesDoProduto.putExtra("nome", valorproduto03.getText().toString());
            detalhesDoProduto.putExtra("produto", R.drawable.tenis);
            startActivity(detalhesDoProduto);
        });





        imageButtonFiguraanterior = findViewById(R.id.imgbtn_telahome_imganterior);
        imageButtonProximaFigura = findViewById(R.id.imgbtn_telahome_proximaimg);
        imageViewFotoCarrossel = findViewById(R.id.imgv_telahome_imagemcarrossel);

        imageButtonFiguraanterior.setOnClickListener(view -> {
        imageViewFotoCarrossel.setImageResource(R.drawable.carrosselcelular);

        });

        imageButtonProximaFigura.setOnClickListener(view -> {
        imageViewFotoCarrossel.setImageResource(R.drawable.linhasnotebook);
        });

        /*imageButtonCelulares = findViewById(R.id.imgbtn_telahome_celulares);
        imageButtonCelulares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent celulares = new Intent(getApplicationContext(),AdicionarProdutoCarrinho.class);
                startActivity(celulares);
            }
        });*/

        imageButtonCadastrarVendedor = findViewById(R.id.imgbtn_telahome_vender);
        imageButtonCadastrarVendedor.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent vender= new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(vender);
            }
        });

        imageButtonFaleConosco = findViewById(R.id.imgbtn_telahome_ajuda);
        imageButtonFaleConosco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent suporte= new Intent(getApplicationContext(), ContatoConosco.class);
                startActivity(suporte);
            }
        });

        imageButtonListaCategoria = findViewById(R.id.imgbtn_telahome_listacategorias);
        imageButtonListaCategoria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent lista = new Intent(getApplicationContext(), CategoriasProdutos.class);
                startActivity(lista);
            }
        });

        imageButtonCarrinho = findViewById(R.id.imgbtn_telahome_carrinho);
        imageButtonCarrinho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent carrinho = new Intent(getApplicationContext(), CarrinhodeProdutos.class);
                startActivity(carrinho);
            }
        });

        imageButtonConta = findViewById(R.id.imgbtn_telahome_perfil);
        imageButtonConta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent conta = new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(conta);
            }
        });


    }

}