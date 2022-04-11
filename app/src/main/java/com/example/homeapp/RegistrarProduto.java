package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.homeapp.database.BancoSQLite;
import com.example.homeapp.modelos.Produto;
import com.example.homeapp.modelos.Usuario;

public class RegistrarProduto extends AppCompatActivity {

    ImageButton botaoVoltar;


    Spinner spinnerListaCategoriaProduto;

    EditText editTextCodigoBarras;
    EditText editTextCategoria;
    EditText editTextQuantidade;
    EditText editTextNomeProduto;
    EditText editTextDescricaoProduto;
    EditText editTextMarcaProduto;
    EditText editTextPrecoCusto;
    EditText editTextPrecoVenda;
    EditText editTextFoto;


    ImageButton imageButtonAdicionarFotoProduto;


    Button buttonRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registrar_produto);

        editTextCodigoBarras = findViewById(R.id.edttxt_telaregistrarproduto_codbarras);

        editTextQuantidade = findViewById(R.id.edttxt_telaregistrarproduto_qtdadeproduto);
        editTextNomeProduto = findViewById(R.id.edttxt_telaregistrarproduto_nomeproduto);
        editTextDescricaoProduto = findViewById(R.id.edttxt_telaregistrarproduto_descricaoproduto);
        editTextMarcaProduto = findViewById(R.id.edttxt_telaregistrarproduto_marcaproduto);
        editTextPrecoCusto = findViewById(R.id.edttxt_telaregistrarproduto_precocusto);
        editTextPrecoVenda = findViewById(R.id.edttxt_telaregistrarproduto_precovenda);



        imageButtonAdicionarFotoProduto = findViewById(R.id.imgbtn_telaregistrarproduto_carregarimagemproduto);

        spinnerListaCategoriaProduto = findViewById(R.id.sp_telaregistrarproduto_listacategorias);
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.listacategorias_array, android.R.layout.simple_spinner_dropdown_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerListaCategoriaProduto.setAdapter(adaptador);

        buttonRegistrar = findViewById(R.id.btn_telaregistrarproduto_registrarproduto);

        botaoVoltar = findViewById(R.id.imgbtn_telaregistrarproduto_voltartelanterior);
        botaoVoltar.setOnClickListener(view -> {


                Intent voltarhome = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(voltarhome);
            });



        buttonRegistrar.setOnClickListener(view -> {

            BancoSQLite db = new BancoSQLite(this);
            if(db.inserirProduto (new Produto (
                    editTextNomeProduto.getText().toString(),
                    editTextCodigoBarras.getText().toString(),
                    editTextQuantidade.getText().toString(),
                    editTextDescricaoProduto.getText().toString(),
                    editTextMarcaProduto.getText().toString(),
                    editTextPrecoCusto.getText().toString(),
                    editTextPrecoVenda.getText().toString()
            ))) {

                Toast.makeText(this, "Produto Cadastrado com sucessso!", Toast.LENGTH_SHORT).show();
                Intent itu = new Intent(getApplicationContext(), PerfilConta.class);
                startActivity(itu);

                //Após login joga pra tela perfil usuario;
            } else { Toast.makeText(this, "Não foi possível realizar o cadastro!", Toast.LENGTH_SHORT).show();}
        });


    }



}