package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AdicionarProdutoCarrinho extends AppCompatActivity {

    Button adicionarcarrinho;
    ImageView imagemProduto;
    EditText editTextDescricaoProduto;
    EditText editTextDescricaoLoja;
    //ImageView imageViewproduto;
    //ImageView produtoiphone2;


    //menu
    ImageButton vend;
    ImageButton suporte;
    ImageButton lista;
    ImageButton carrinho;
    ImageButton conta;
    ImageButton home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_produto_carrinho);

        imagemProduto = findViewById(R.id.imgv_telaadicionarprodutocarrinho_imagemproduto);
        editTextDescricaoProduto = findViewById(R.id.edttxt_telaadicionarprodutocarrinho_descricaoproduto);
        editTextDescricaoLoja = findViewById(R.id.edttxt_telaadicionarprodutocarrinho_descricaoloja);
        //imageViewproduto = findViewById(R.id.imgv_telaadicionarprodutocarrinho_imagemproduto);
        adicionarcarrinho = findViewById(R.id.btn_telaadicionarprodutocarrinho_adicionarnocarrinho);

        home = findViewById(R.id.imgbtn_telaadicionarprodutocarrinho_home);
        vend = findViewById(R.id.imgbtn_telaadicionarprodutocarrinho_vender);
        lista = findViewById(R.id.imgbtn_telaadicionarprodutocarrinho_listacategorias);
        carrinho = findViewById(R.id.imgbtn_telaadicionarprodutocarrinho_carrinho);
        conta = findViewById(R.id.imgbtn_telaadicionarprodutocarrinho_perfil);
        suporte = findViewById(R.id.imgbtn_telaadicionarprodutocarrinho_ajuda);

        //recuoerando dados da activitymain

        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        int produto = intent.getIntExtra("produto", 1);

        editTextDescricaoProduto.setText(" " + nome);
        imagemProduto.setImageResource(produto);

       adicionarcarrinho.setOnClickListener(View-> {
           Intent pagamento = new Intent(getApplicationContext(), FinalizarCompra.class);
           startActivity(pagamento);

    });

        home.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent hom= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(hom);
            }
        });

        vend.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent vend= new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(vend);
            }
        });


        lista.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent lista = new Intent(getApplicationContext(), CategoriasProdutos.class);
                startActivity(lista);
            }
        });

        carrinho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent carrinho = new Intent(getApplicationContext(), CarrinhodeProdutos.class);
                startActivity(carrinho);
            }
        });
        conta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent conta = new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(conta);
            }
        });

        suporte.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent suporte= new Intent(getApplicationContext(), ContatoConosco.class);
                startActivity(suporte);
            }
        });

   }
}