package com.example.homeapp.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import com.example.homeapp.modelos.Produto;
import com.example.homeapp.modelos.Usuario;
import com.example.homeapp.modelos.Vendedor;

public class BancoSQLite extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "Dados_App.db";
    private static final int VERSAO = 1;


    private static final String TABELA = "cliente";
    private static final String ID = "id";
    private static final String NOME = "nome";
    private static final String EMAIL = "email";
    private static final String DOCUMENTO = "documento";
    private static final String TELEFONE = "telefone";
    private static final String SENHA = "senha";
    private static final String CEP = "cep";
    private static final String ENDERECO = "endereco";
    private static final String BAIRRO = "bairro";
    private static final String CIDADE = "cidade";
    private static final String ESTADO = "estado";

    //tabela produto
    private static final String TABELA2 = "produto";
    private static final String IDPROD = "idprod";
    private static final String CODBARRAS = "codbarras";

    private static final String NOMEP = "nomep";
    private static final String QUANTIDADE = "quantidade";
    private static final String DESCRICAO = "descricao";
    private static final String MARCA = "marca";
    private static final String PRECOCUSTO = "precocusto";
    private static final String PRECOVENDA = "precovenda";


    //tabela vendedor


    private static final String TABELA3 = "vendedor";
    private static final String IDV = "id";
    private static final String NOMEV = "nome";
    private static final String EMAILV = "email";
    private static final String DOCUMENTOV = "documento";
    private static final String TELEFONEV = "telefone";
    private static final String SENHAV = "senha";
    private static final String CEPV = "cep";
    private static final String ENDERECOV = "endereco";
    private static final String BAIRROV = "bairro";
    private static final String CIDADEV = "cidade";
    private static final String ESTADOV = "estado";


    public BancoSQLite(Context context){

        super(context, NOME_BANCO, null, VERSAO);
    }

/*private static  final String CREATE_CLIENTE_TABLE = "CREATE TABLE " + TABELA + " ( " +
        ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
        NOME + " TEXT, " +
        EMAIL + " TEXT, " +
        DOCUMENTO + " TEXT, " +
        TELEFONE + " TEXT, " +
        SENHA + " TEXT, " +
        CEP + " TEXT, " +
        ENDERECO + " TEXT, " +
        BAIRRO + " TEXT, " +
        CIDADE + " TEXT, " +
        ESTADO + " TEXT )";*/

   /* private static final String CREATE_PRODUTO_TABLE = "CREATE TABLE " + TABELA2 + " ( " +
            IDPROD + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            CODBARRAS + " TEXT, " +
            CATEGORIA + " TEXT, " +
            NOMEP + " TEXT, " +
            DESCRICAO + " TEXT, " +
            MARCA + " TEXT, " +
            QUANTIDADE + " TEXT, " +
            PRECOCUSTO + " TEXT, " +
            PRECOVENDA + " TEXT )";

    private static final String CREATE_VENDEDOR_TABLE = "CREATE TABLE " + TABELA3 + " ( " +
            IDV + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            NOMEV + " TEXT, " +
            EMAILV + " TEXT, " +
            DOCUMENTOV + " TEXT, " +
            TELEFONEV + " TEXT, " +
            SENHAV + " TEXT, " +
            CEPV + " TEXT, " +
            ENDERECOV + " TEXT, " +
            BAIRROV + " TEXT, " +
            CIDADEV + " TEXT, " +
            ESTADOV + " TEXT )";*/


    @Override
    public void onCreate(SQLiteDatabase db) {
        // Cria tabela usuarios

        String CREATE_CLIENTE_TABLE = "CREATE TABLE " + TABELA + " ( " +
                ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                NOME + " TEXT, " +
                EMAIL + " TEXT, " +
                DOCUMENTO + " TEXT, " +
                TELEFONE + " TEXT, " +
                SENHA + " TEXT, " +
                CEP + " TEXT, " +
                ENDERECO + " TEXT, " +
                BAIRRO + " TEXT, " +
                CIDADE + " TEXT, " +
                ESTADO + " TEXT )";
        db.execSQL(CREATE_CLIENTE_TABLE);

        String CREATE_PRODUTO_TABLE = "CREATE TABLE " + TABELA2 + " ( " +
                IDPROD + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CODBARRAS + " TEXT, " +
                NOMEP + " TEXT, " +
                DESCRICAO + " TEXT, " +
                MARCA + " TEXT, " +
                QUANTIDADE + " TEXT, " +
                PRECOCUSTO + " TEXT, " +
                PRECOVENDA + " TEXT )";
        db.execSQL(CREATE_PRODUTO_TABLE);


        String CREATE_VENDEDOR_TABLE = "CREATE TABLE " + TABELA3 + " ( " +
                IDV + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                NOMEV + " TEXT, " +
                EMAILV + " TEXT, " +
                DOCUMENTOV + " TEXT, " +
                TELEFONEV + " TEXT, " +
                SENHAV + " TEXT, " +
                CEPV + " TEXT, " +
                ENDERECOV + " TEXT, " +
                BAIRROV + " TEXT, " +
                CIDADEV + " TEXT, " +
                ESTADOV + " TEXT )";
        //db.execSQL(CREATE_CLIENTE_TABLE);
       //db.execSQL(CREATE_PRODUTO_TABLE);
        db.execSQL(CREATE_VENDEDOR_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABELA);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + TABELA2);
        onCreate(db);

       db.execSQL("DROP TABLE IF EXISTS " + TABELA3);
        onCreate(db);

    }

    public boolean inserirVendedor(Vendedor v){
        long result;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NOMEV, v.getNome());
        values.put(EMAILV, v.getEmail());
        values.put(DOCUMENTOV, v.getDocumento());
        values.put(TELEFONEV, v.getTelefone());
        values.put(SENHAV, v.getSenha());
        values.put(CEPV, v.getCep());
        values.put(ENDERECOV, v.getEndereco());
        values.put(BAIRROV, v.getBairro());
        values.put(CIDADEV, v.getCidade());
        values.put(ESTADOV, v.getEstado());
        result = db.insert(TABELA3, null, values);
        db.close();

        if(result == -1) return false;
        else return true;
    }


    public boolean inserirUsuario(Usuario u){
        long result;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NOME, u.getNome());
        values.put(EMAIL, u.getEmail());
        values.put(DOCUMENTO, u.getDocumento());
        values.put(TELEFONE, u.getTelefone());
        values.put(SENHA, u.getSenha());
        values.put(CEP, u.getCep());
        values.put(ENDERECO, u.getEndereco());
        values.put(BAIRRO, u.getBairro());
        values.put(CIDADE, u.getCidade());
        values.put(ESTADO, u.getEstado());
        result = db.insert(TABELA, null, values);
        db.close();

        if(result == -1) return false;
        else return true;
    }

    public boolean inserirProduto(Produto p){
        long result;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NOMEP, p.getNome());
        values.put(CODBARRAS, p.getCodbarras());
        values.put(QUANTIDADE, p.getQuantidade());
        values.put(DESCRICAO, p.getDescprod());
        values.put(MARCA, p.getMarca());
        values.put(PRECOCUSTO, p.getPrecocusto());
        values.put(PRECOVENDA, p.getPrecovenda());
        //values.put(FOTO, p.getFoto());

        result = db.insert(TABELA2, null, values);
        db.close();

        if(result == -1) return false;
        else return true;
    }

    public Produto selecionarProduto(String codbarras){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA2,
                new String[]{IDPROD,CODBARRAS, NOMEP, QUANTIDADE, DESCRICAO, MARCA, PRECOCUSTO, PRECOVENDA},
                IDPROD + " = ?",
                new String[]{String.valueOf(codbarras)},null, null, null, null);
        if(cursor != null){
            cursor.moveToFirst();


            Produto p = new Produto(
                    Integer.parseInt(cursor.getString(0)
                    ),
                    cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(4), cursor.getString(6), cursor.getString(7));


            return (Produto) p.clone();
        }
        else return null;
    }

    public Vendedor selecionarVendedor(String email){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA3,
                new String[]{ IDV, NOMEV, EMAILV, DOCUMENTOV, TELEFONEV, SENHAV, CEPV, ENDERECOV, BAIRROV, CIDADEV, ESTADOV},
                EMAILV + " = ?",
                new String[]{ String.valueOf(email)},null, null, null, null);
        if(cursor != null){
            cursor.moveToFirst();

            Vendedor v = new Vendedor(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6),
                    cursor.getString(7),
                    cursor.getString(8),
                    cursor.getString(9),
                    cursor.getString(10));
            return (Vendedor) v.clone();
        }
        else return null;
    }

    public Usuario selecionarUsuario(String email   ){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA,
                new String[]{ID, NOME, EMAIL, DOCUMENTO, TELEFONE, SENHA, CEP, ENDERECO, BAIRRO, CIDADE, ESTADO},
                EMAIL + " = ?",
                new String[]{ String.valueOf(email)},null, null, null, null);
        if(cursor != null){
            cursor.moveToFirst();

            Usuario u = new Usuario(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6),
                    cursor.getString(7),
                    cursor.getString(8),
                    cursor.getString(9),
                    cursor.getString(10));

            return (Usuario) u.clone();
        }
        else return null;
    }

    public Usuario selecionarCliente(String email){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA,
                new String[]{ ID, NOME, EMAIL, DOCUMENTO, TELEFONE, SENHA, CEP, ENDERECO, BAIRRO, CIDADE, ESTADO},
                ID + " = ?",
                new String[]{ String.valueOf(email)},null, null, null, null);
        if(cursor != null){
            cursor.moveToFirst();

            Usuario u = new Usuario(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6),
                    cursor.getString(7),
                    cursor.getString(8),
                    cursor.getString(9),
                    cursor.getString(10));

            return (Usuario) u.clone();
        }
        else return null;
    }

// teste selecionando por id

    public Usuario selecionarUsuarioporID(String id){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA,
                new String[]{ ID, EMAIL, NOME},
                ID + " = ?",
                new String[]{ String.valueOf(id)},null, null, null, null);
        if(cursor != null){
            cursor.moveToFirst();

            Usuario u = new Usuario(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2));

            return (Usuario) u.clone();
        }
        else return null;
    }
}



