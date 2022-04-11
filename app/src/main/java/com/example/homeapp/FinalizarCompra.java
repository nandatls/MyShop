package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FinalizarCompra extends AppCompatActivity {

    Button buttonFinalizar;
    ImageView imageViewProdutoSelecionado;

    //menu

    ImageButton imageButtonvender;
    ImageButton imageButtonFaleConosco;
    ImageButton imageButtonListaCategorias;
    ImageButton imageButtonCarrinho;
    ImageButton imageButtonConta;
    ImageButton imageButtonHome;

    //inserindo para teste
    ImageView produto1;
    ImageButton bicicletas;
    ImageButton produtoiphone;
    ImageButton camisas;
    ImageButton sapatos;

//fim de insercao

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_compra);
//adicionado para teste

//fim adicao




        buttonFinalizar = findViewById(R.id.btn_telafinalizarcompra_finalizar);
        buttonFinalizar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent finalizar = new Intent(getApplicationContext(), MainActivity.class);
                Toast.makeText(getApplicationContext(), "Pagamento Efetuado com Sucesso !", Toast.LENGTH_SHORT).show();
                startActivity(finalizar);
            }
        });

        //menu

        imageButtonvender = findViewById(R.id.imgbtn_telafinalizarcompra_vender);
        imageButtonvender.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent vender= new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(vender);
            }
        });

        imageButtonFaleConosco = findViewById(R.id.imgbtn_telafinalizarcompra_ajuda);
        imageButtonFaleConosco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent suporte= new Intent(getApplicationContext(), ContatoConosco.class);
                startActivity(suporte);
            }
        });

        imageButtonListaCategorias = findViewById(R.id.imgbtn_telafinalizarcompra_listacateg);
        imageButtonListaCategorias.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent lista = new Intent(getApplicationContext(), CategoriasProdutos.class);
                startActivity(lista);
            }
        });

        imageButtonCarrinho = findViewById(R.id.imgbtn_telafinalizarcompra_carrinho);
        imageButtonCarrinho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent carrinho = new Intent(getApplicationContext(), CarrinhodeProdutos.class);
                startActivity(carrinho);
            }
        });

        imageButtonConta = findViewById(R.id.imgbtn_telafinalizarcompra_perfil);
        imageButtonConta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent conta = new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(conta);
            }
        });

        imageButtonHome = findViewById(R.id.imgbtn_telafinalizarcompra_home);
        imageButtonHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
            }
        });




    }
}