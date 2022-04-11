package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class PedidoFinalizado extends AppCompatActivity {



    ImageView imageViewProdutoEscolhido;
    TextView textViewNomeProduto;
    EditText editTextInformacoesCompra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_finalizado);


        imageViewProdutoEscolhido = findViewById(R.id.imgv_telapedidofinalizado_imagemprodutoescolhido);
        textViewNomeProduto = findViewById(R.id.txtv_telapedidofinalizado_nomeproduto);
        editTextInformacoesCompra = findViewById(R.id.edttxt_telapedidofinalizado_informacoesdacompra);

    }
}