package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Adicionarcarrinhodalistadeprodutosenc extends AppCompatActivity {

    ImageButton produto1;
    ImageButton produto2;

    //menu
    ImageButton inicial;
    ImageButton venda;
    ImageButton categ;
    ImageButton carrinh;
    ImageButton cont;
    ImageButton falecon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionarcarrinhodalistadeprodutosenc);


        inicial = findViewById(R.id.imgbtn_telaadicionarcarrinhodalistaprodutosencontrados_home);
        venda = findViewById(R.id.imgbtn_telaadicionarcarrinhodalistaprodutosencontrados_vender);
        categ = findViewById(R.id.imgbtn_telaadicionarcarrinhodalistaprodutosencontrados_listacateg);
        carrinh = findViewById(R.id.imgbtn_telaadicionarcarrinhodalistaprodutosencontrados_carrinho);
        cont = findViewById(R.id.imgbtn_telaadicionarcarrinhodalistaprodutosencontrados_perfil);
        falecon = findViewById(R.id.imgbtn_telaadicionarcarrinhodalistaprodutosencontrados_ajuda);



        //trazendo img pra outra tela usando o tenis

        produto2 = findViewById(R.id.imgbtn_telaadicionarcarrinhodalista_mostrarinfprimeiroproduto);
        produto2.setOnClickListener(View->{
            Intent detalhesDoProduto1 = new Intent(this, PagamentoProduto.class);
            //passar os dados
            detalhesDoProduto1.putExtra("produto2", R.drawable.samsung);
            startActivity(detalhesDoProduto1);
        });

        produto1 = findViewById(R.id.imgbtn_telaadicionarcarrinholistaprodutosencontrados_mostrarinfsegundoproduto);
        produto1.setOnClickListener(View->{
            Intent detalhesDoProduto1 = new Intent(this, PagamentoProduto.class);
            //passar os dados
            detalhesDoProduto1.putExtra("produto2", R.drawable.samsungg);
            startActivity(detalhesDoProduto1);
        });



        venda = findViewById(R.id.imgbtn_telaadicionarcarrinhodalistaprodutosencontrados_vender);
        venda.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent vender= new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(vender);
            }
        });

        falecon = findViewById(R.id.imgbtn_telaadicionarcarrinhodalistaprodutosencontrados_ajuda);
        falecon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent suporte= new Intent(getApplicationContext(), ContatoConosco.class);
                startActivity(suporte);
            }
        });

        categ = findViewById(R.id.imgbtn_telaadicionarcarrinhodalistaprodutosencontrados_listacateg);
        categ.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent lista = new Intent(getApplicationContext(), CategoriasProdutos.class);
                startActivity(lista);
            }
        });

        carrinh = findViewById(R.id.imgbtn_telaadicionarcarrinhodalistaprodutosencontrados_carrinho);
        carrinh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent carrinho = new Intent(getApplicationContext(), CarrinhodeProdutos.class);
                startActivity(carrinho);
            }
        });

        cont = findViewById(R.id.imgbtn_telaadicionarcarrinhodalistaprodutosencontrados_perfil);
        cont.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent conta = new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(conta);
            }
        });

        inicial = findViewById(R.id.imgbtn_telaadicionarcarrinhodalistaprodutosencontrados_home);
        inicial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
            }
        });



    }
}