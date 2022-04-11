package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaProdutosEncontrados extends AppCompatActivity {

    ImageView imageViewPrimeiroProduto;
    ImageView imageViewSegundoProduto;
    ImageButton buttonMaioresInfPrimeiroProduto;
    ImageButton buttonMaioresInfSegundoProduto;
    TextView textViewInformacoesPrimeiroProduto;
    TextView textViewInformacoesSegundoProduto;


    //menu

    ImageButton imageButtonvender;
    ImageButton imageButtonFaleConosco;
    ImageButton imageButtonListaCategorias;
    ImageButton imageButtonCarrinho;
    ImageButton imageButtonConta;
    ImageButton imageButtonHome;
    ImageButton imageButtonvoltar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lista_produtos_encontrados);

        imageViewPrimeiroProduto = findViewById(R.id.imgv_telalistaprodutosencontrados_primeiroproduto);
        imageViewSegundoProduto = findViewById(R.id.imgv_telalistaprodutosencontrados_segundoproduto);
        textViewInformacoesPrimeiroProduto = findViewById(R.id.txtv_telalistaprodutosencontrados_informacoesprimeiroproduto);
        textViewInformacoesSegundoProduto = findViewById(R.id.txtv_telalistaprodutosencontrados_informacoessegundoproduto);
        buttonMaioresInfSegundoProduto = findViewById(R.id.imgbtn_telalistaprodutosencontrados_mostrarinfsegundoproduto);


        buttonMaioresInfPrimeiroProduto = findViewById(R.id.imgbtn_telalistaprodutosencontrados_mostrarinfprimeiroproduto);
        buttonMaioresInfPrimeiroProduto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent detalhes = new Intent(getApplicationContext(), AdicionarProdutoCarrinho.class);
                startActivity(detalhes);
            }
        });

        //menu

        imageButtonvender = findViewById(R.id.imgbtn_telalistaprodutosencontrados_vender);
        imageButtonvender.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent vender= new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(vender);
            }
        });

        imageButtonFaleConosco = findViewById(R.id.imgbtn_telalistaprodutosencontrados_ajuda);
        imageButtonFaleConosco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent suporte= new Intent(getApplicationContext(), ContatoConosco.class);
                startActivity(suporte);
            }
        });

        imageButtonListaCategorias = findViewById(R.id.imgbtn_telalistaprodutosencontrados_listacateg);
        imageButtonListaCategorias.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent lista = new Intent(getApplicationContext(), CategoriasProdutos.class);
                startActivity(lista);
            }
        });

        imageButtonCarrinho = findViewById(R.id.imgbtn_telalistaprodutosencontrados_carrinho);
        imageButtonCarrinho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent carrinho = new Intent(getApplicationContext(), CarrinhodeProdutos.class);
                startActivity(carrinho);
            }
        });

        imageButtonConta = findViewById(R.id.imgbtn_telalistaprodutosencontrados_perfil);
        imageButtonConta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent conta = new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(conta);
            }
        });

        imageButtonHome = findViewById(R.id.imgbtn_telalistaprodutosencontrados_home);
        imageButtonHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
            }
        });

       /* imageButtonvoltar = findViewById(R.id.imgbtn_telalistaprodutosencontrados_voltar);
        imageButtonvoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent home = new Intent(getApplicationContext(), CategoriasProdutos.class);
                startActivity(home);
            }
        });*/



    }
}