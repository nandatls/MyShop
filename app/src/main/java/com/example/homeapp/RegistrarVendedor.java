package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.homeapp.database.BancoSQLite;
import com.example.homeapp.modelos.Usuario;
import com.example.homeapp.modelos.Vendedor;


public class RegistrarVendedor extends AppCompatActivity {

    Button buttoncadastrarvend;


    EditText editTextNomeUsuario;
    EditText editTextEmail;
    EditText editTextDoc;
    EditText editTextTel;
    EditText editTextSenha;
    EditText editTextCep;
    EditText editTextEnd;
    EditText editTextBairro;
    EditText editTextCidade;
    EditText editTextEst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registrar_vendedor);

        editTextNomeUsuario = findViewById(R.id.edttxt_telaregistrovendedor_nome);
        editTextEmail = findViewById(R.id.edttxt_telaregistrovendedor_email);
        editTextDoc = findViewById(R.id.edttxt_telaregistrovendedor_documento);
        editTextTel= findViewById(R.id.edttxt_telaregistrovendedor_telefone);
        editTextSenha = findViewById(R.id.edttxt_telaregistrovendedor_senha);
        editTextCep = findViewById(R.id.edttxt_telaregistrovendedor_cep);
        editTextEnd = findViewById(R.id.edttxt_telaregistrovendedor_endereco);
        editTextBairro = findViewById(R.id.edttxt_telaregistrovendedor_bairro);
        editTextCidade = findViewById(R.id.edttxt_telaregistrovendedor_cidade);
        editTextEst = findViewById(R.id.edttxt_telaregistrovendedor_estado);


        buttoncadastrarvend = findViewById(R.id.btn_telaregistrovendedor_cadastrar);


        buttoncadastrarvend.setOnClickListener(view -> {


            BancoSQLite db = new BancoSQLite(this);

            if(db.inserirVendedor(new Vendedor(
                    editTextNomeUsuario.getText().toString(),
                    editTextEmail.getText().toString(),
                    editTextDoc.getText().toString(),
                    editTextTel.getText().toString(),
                    editTextSenha.getText().toString(),
                    editTextCep.getText().toString(),
                    editTextEnd.getText().toString(),
                    editTextBairro.getText().toString(),
                    editTextCidade.getText().toString(),
                    editTextEst.getText().toString()
            ))) {
                Toast.makeText(this, "Vendedor Cadastrado com Sucesso!", Toast.LENGTH_SHORT).show();
                Intent ito = new Intent(getApplicationContext(), PerfilConta.class);
                startActivity(ito);
                //Após login joga pra tela perfil usuario;
            }
            else Toast.makeText(this, "Não foi possível realizar o cadastro!", Toast.LENGTH_SHORT).show();
        });



    }
}