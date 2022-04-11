package com.example.homeapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homeapp.database.BancoSQLite;
import com.example.homeapp.modelos.Usuario;
import com.example.homeapp.modelos.Vendedor;

public class LoginUsuario extends AppCompatActivity {


    EditText editTextEmail;
    EditText editTextSenha;
    TextView textViewEsqueceuSenha;
    Button buttonRegistrar;
    RadioButton radioButtonusu;
    RadioButton radioButtonvend;

    Button vendedor;
    Button cliente;

    Button teste;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuario);


        vendedor = findViewById(R.id.btn_telaloginusuario_vend);
        cliente = findViewById(R.id.btn_telaloginusuario_cliente);

        textViewEsqueceuSenha = findViewById(R.id.txtv_telaloginusuario_esqueceuasenha);
        editTextEmail = findViewById(R.id.edttxt_telaloginusuario_login);
        editTextSenha = findViewById(R.id.edttxt_telaloginusuario_digitarsenhar);






        teste = findViewById(R.id.btn_telaloginusuario_registrar);

        textViewEsqueceuSenha.setOnClickListener(view -> {
            Intent recsenha = new Intent(getApplicationContext(), RecuperacaodeSenha.class);
            startActivity(recsenha);

        });



        vendedor.setOnClickListener(view ->{


            try {
                BancoSQLite db = new BancoSQLite(this);
                Vendedor vendedor = db.selecionarVendedor(editTextEmail.getText().toString());


                if (vendedor.getSenha().equals(editTextSenha.getText().toString())) {

                    Intent intenta = new Intent(getApplicationContext(), PerfilConta.class);
                    startActivity(intenta);


                }else { Toast.makeText(this, "Senha Incorreta !", Toast.LENGTH_SHORT).show();}
            } catch (Exception e) {
                Toast.makeText(this, "Usuário não Cadastrado !", Toast.LENGTH_SHORT).show();


            }

        });



        cliente.setOnClickListener(view -> {

            //txtv_telaperfilconta_tornarpremium

            try {
                BancoSQLite db = new BancoSQLite(this);
               Usuario usuario = db.selecionarUsuario(editTextEmail.getText().toString());


                if (usuario.getSenha().equals(editTextSenha.getText().toString())) {

                    Intent intento = new Intent(getApplicationContext(), PerfilConta.class);
                    startActivity(intento);





                }else { Toast.makeText(this, "Senha Incorreta !", Toast.LENGTH_SHORT).show();}
            } catch (Exception e) {
                Toast.makeText(this, "Usuário não Cadastrado !", Toast.LENGTH_SHORT).show();



            }

        });

        teste.setOnClickListener(view -> {



            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(true);
            builder.setTitle("Qual tipo de conta você deseja cadastrar ? ");
            //builder.setMessage("Qual tipo de conta vc deseja cadastrar ?");
            builder.setIcon(R.drawable.logosemfundo);


            builder.setNegativeButton("Vendedor", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent intentii = new Intent(getApplicationContext(), RegistrarVendedor.class);
                    startActivity(intentii);

                }
            });


            builder.setPositiveButton("Cliente", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent intentii = new Intent(getApplicationContext(), CadastrarDadosUsuario.class);
                    startActivity(intentii);
                }
            });



            AlertDialog alert = builder.create();

            alert.getWindow().setGravity(Gravity.CENTER);

            alert.show();
        }); }

        }



