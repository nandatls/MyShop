package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class ContratoPlanoPremium extends AppCompatActivity {

    Button buttonPagPlanoPremium;
    RadioButton radioButtonAceitarTermosP;

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
        setContentView(R.layout.activity_contrato_plano_premium);

        radioButtonAceitarTermosP = findViewById(R.id.rbtn_telacontratoplanopremium_aceitartermos);

        buttonPagPlanoPremium = findViewById(R.id.btn_telacontratoplanopremium_contratarplano);
        buttonPagPlanoPremium.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent pagar = new Intent(getApplicationContext(), PagamentoPremium.class);
                startActivity(pagar);
            }
        });

        //menu

        imageButtonvender = findViewById(R.id.imgbtn_telacontratoplanopremium_vender);
        imageButtonvender.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent vender= new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(vender);
            }
        });

        imageButtonFaleConosco = findViewById(R.id.imgbtn_telacontratoplanopremium_ajuda);
        imageButtonFaleConosco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent suporte= new Intent(getApplicationContext(), ContatoConosco.class);
                startActivity(suporte);
            }
        });

        imageButtonListaCategorias = findViewById(R.id.imgbtn_telacontratoplanopremium_listacateg);
        imageButtonListaCategorias.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent lista = new Intent(getApplicationContext(), CategoriasProdutos.class);
                startActivity(lista);
            }
        });

        imageButtonCarrinho = findViewById(R.id.imgbtn_telacontratoplanopremium_carrinho);
        imageButtonCarrinho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent carrinho = new Intent(getApplicationContext(), CarrinhodeProdutos.class);
                startActivity(carrinho);
            }
        });

        imageButtonConta = findViewById(R.id.imgbtn_telacontratoplanopremium_perfil);
        imageButtonConta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent conta = new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(conta);
            }
        });

        imageButtonHome = findViewById(R.id.imgbtn_telacontratoplanopremium_home);
        imageButtonHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
            }
        });



    }
}