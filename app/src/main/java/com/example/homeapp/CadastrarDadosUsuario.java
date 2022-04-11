package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.homeapp.database.BancoSQLite;
import com.example.homeapp.modelos.Usuario;

public class CadastrarDadosUsuario extends AppCompatActivity {


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



    Button buttonCadastrar;
    ImageButton imageButtonVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_dados_usuario);


        editTextEmail = findViewById(R.id.edttxt_telacadastrardadosusuario_emailusuario);
        editTextSenha = findViewById(R.id.edttxt_telacadastrardadosusuario_senhausuario);
        editTextNomeUsuario = findViewById(R.id.edttxt_telacadastrardadosusuario_nomeusuario);
        editTextDoc = findViewById(R.id.edttxt_telacadastrardadosusuario_docusuario);
        editTextTel= findViewById(R.id.edttxt_telacadastrardadosusuario_telefoneusuario);
        editTextCep = findViewById(R.id.edttxt_telacadastrardadosusuario_cep);
        editTextEnd = findViewById(R.id.edttxt_telacadastrardadosusuario_end);
        editTextBairro = findViewById(R.id.edttxt_telacadastrardadosusuario_bairro);
        editTextCidade = findViewById(R.id.edttxt_telacadastrardadosusuario_cidade);
        editTextEst = findViewById(R.id.edttxt_telacadastrardadosusuario_estado);



        buttonCadastrar = findViewById(R.id.btn_telacadastrardadosusuario_cadastrar);


        buttonCadastrar.setOnClickListener(view -> {
            BancoSQLite db = new BancoSQLite(this);

            if(db.inserirUsuario(new Usuario(
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
                Toast.makeText(this, "Cliente Cadastrado com sucessso!", Toast.LENGTH_SHORT).show();
                Intent it = new Intent(getApplicationContext(), PerfilConta.class);
                startActivity(it);
               //Após login joga pra tela perfil usuario;
            }
            else Toast.makeText(this, "Não foi possível realizar o cadastro!", Toast.LENGTH_SHORT).show();
        });



  }

}