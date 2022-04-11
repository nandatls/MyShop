package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrarEndereco extends AppCompatActivity {


    Button buttonCadastrarEnd;
    EditText editTextIdentificadorEndereco;
    EditText editTextViewCep;
    EditText editTextRua;
    EditText editTextNumero;
    EditText editTextBairro;
    EditText editTextCidade;
    EditText editTextUF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_endereco);

        editTextIdentificadorEndereco = findViewById(R.id.edttxt_telaregistrarendereco_nomendereco);
        editTextViewCep = findViewById(R.id.edttxt_telaregistrarendereco_Cep);
        editTextRua = findViewById(R.id.edttxt_telaregistrarendereco_nomerua);
        editTextNumero = findViewById(R.id.edttxt_telaregistrarendereco_numerocasa);
        editTextBairro = findViewById(R.id.edttxt_telaregistrarendereco_bairro);
        editTextCidade = findViewById(R.id.edttxt_telaregistrarendereco_nomecidade);
        editTextUF = findViewById(R.id.edttxt_telaregistrarendereco_UFcidade);

        buttonCadastrarEnd = findViewById(R.id.btn_telaregistrarendereco_cadastrarendereco);
    }

}