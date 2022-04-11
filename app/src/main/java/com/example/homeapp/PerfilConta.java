package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homeapp.database.BancoSQLite;
import com.example.homeapp.modelos.Usuario;

public class PerfilConta extends AppCompatActivity {

    Button buttonCadastroNovoProduto;
    Button buttonAtualizarDados;
    ImageButton imageButtonlogout;
    TextView textViewSerPremium;

    //menu
    ImageButton imageButtonvender;
    ImageButton imageButtonFaleConosco;
    ImageButton imageButtonListaCategorias;
    ImageButton imageButtonCarrinho;
    ImageButton imageButtonConta;
    ImageButton imageButtonHome;

    EditText login;
    EditText cidade;
    EditText nome;
    EditText estado;
    EditText tel;

    private Animation animation;
    private TextView txtv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_perfil_conta);

//tentando trazer os dados para o perfil
        login = findViewById(R.id.edttxt_telaperfilconta_email);
        nome = findViewById(R.id.edttxt_telaperfilconta_nome);
        cidade = findViewById(R.id.edttxt_telaperfilconta_cidade);
        estado = findViewById(R.id.edttxt_telaperfilconta_estado);
        tel = findViewById(R.id.edttxt_telaperfilconta_tel);


       BancoSQLite db = new BancoSQLite(this);
                   Usuario usuario = db.selecionarCliente("1");

                   //login.setText(usuario.getId());
                    login.setText(usuario.getEmail());
                    nome.setText(usuario.getNome());
                     cidade.setText(usuario.getCidade());
                     estado.setText(usuario.getEstado());
                     tel.setText(usuario.getTelefone());




//teste






        imageButtonlogout = findViewById(R.id.imgbtn_telaperfilconta_logout);
        imageButtonlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(logout);
            }
        });


        buttonCadastroNovoProduto = findViewById(R.id.btn_telaperfilconta_cadastrarproduto);
        buttonCadastroNovoProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastro = new Intent(getApplicationContext(), RegistrarProduto.class);
                startActivity(cadastro);
            }
        });

        buttonAtualizarDados = findViewById(R.id.btn_telaperfilconta_atualizardadosusuario);
        buttonAtualizarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atualizardados = new Intent(getApplicationContext(),AtualizarDadosCadastrais.class);
                startActivity(atualizardados);

            }
        });

        //Animar texto se tornar premium
        animation = new AlphaAnimation(1, 0); // Altera alpha de visível a invisível
        animation.setDuration(500); // duração - meio segundo
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE); // Repetir infinitamente
        animation.setRepeatMode(Animation.REVERSE); //Inverte a animação no final para que o botão vá desaparecendo

        txtv = (TextView) findViewById(R.id.txtv_telaperfilconta_tornarpremium);
        txtv.startAnimation(animation);

        textViewSerPremium = findViewById(R.id.txtv_telaperfilconta_tornarpremium);
        textViewSerPremium.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent premium = new Intent(getApplicationContext(), ContratoPlanoPremium.class);
                startActivity(premium);
            }
        });

        //menu

        imageButtonvender = findViewById(R.id.imgbtn_telaperfilconta_vender);
        imageButtonvender.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent vender= new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(vender);
            }
        });

        imageButtonFaleConosco = findViewById(R.id.imgbtn_telaperfilconta_ajuda);
        imageButtonFaleConosco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent suporte= new Intent(getApplicationContext(), ContatoConosco.class);
                startActivity(suporte);
            }
        });

        imageButtonListaCategorias = findViewById(R.id.imgbtn_telaperfilconta_listacateg);
        imageButtonListaCategorias.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent lista = new Intent(getApplicationContext(), CategoriasProdutos.class);
                startActivity(lista);
            }
        });

        imageButtonCarrinho = findViewById(R.id.imgbtn_telaperfilconta_carrinho);
        imageButtonCarrinho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent carrinho = new Intent(getApplicationContext(), CarrinhodeProdutos.class);
                startActivity(carrinho);
            }
        });

        imageButtonConta = findViewById(R.id.imgbtn_telaperfilconta_perfil);
        imageButtonConta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent conta = new Intent(getApplicationContext(), LoginUsuario.class);
                startActivity(conta);
            }
        });

        imageButtonHome = findViewById(R.id.imgbtn_telaperfilconta_home);
        imageButtonHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
            }
        });

        }
}