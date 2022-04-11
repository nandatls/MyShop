package com.example.homeapp.modelos;

import android.text.Editable;

public class Produto implements Cloneable{
    private int idprod;
    private String codbarras;
    //private String categoria;
    private String nomep;
    private String quantidade;
    private String descprod;
    private String marca;
    private String precocusto;
    private String precovenda;
    //private String foto;

    public Produto(){}

 public  Produto(String codbarras, String nomep, String quantidade, String descprod,
                 String marca, String precocusto, String precovenda){

     this.codbarras = codbarras;
     //this.categoria = categoria;
     this.nomep = nomep;
     this.quantidade = quantidade;
     this.descprod = descprod;
     this.marca = marca;
     this.precocusto = precocusto;
     this.precovenda = precovenda;
 }

 public Produto(int idprod, String codbarras){
     this.idprod = idprod;
     this.codbarras = codbarras;

 }
    public Produto(int idprod, String codbarras,  String nomep, String quantidade, String descprod,
                    String marca, String precocusto, String precovenda){
        this.idprod = idprod;
        this.codbarras = codbarras;

        this.nomep = nomep;
        this.quantidade = quantidade;
        this.descprod = descprod;
        this.marca = marca;
        this.precocusto = precocusto;
        this.precovenda = precovenda;
        //this.foto = foto;
    }

    public Produto(Produto p){
        this.idprod = p.idprod;
        this.codbarras = p.codbarras;

        this.nomep = p.nomep;
        this.descprod = p.descprod;
        this.marca = p.marca;
        this.quantidade = p.quantidade;
        this.precocusto = p.precocusto;
        this.precovenda = p.precovenda;

    }



    public int getId(){
        return this.idprod;
    }

    public void setId(int idprod){
        this.idprod = idprod;
    }

    public String getCodbarras(){
        return this.codbarras;
    }

    public void setCodbarras(String codbarras){
        this.codbarras = codbarras;
    }



    public String getNome(){
        return this.nomep;
    }

    public void setNome(String nomep){
        this.nomep = nomep;
    }

    public String getDescprod(){
        return this.descprod;
    }
    public void setDescprod(String descprod){
        this.descprod = descprod;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(String quantidade){
        this.quantidade = quantidade;
    }


    public String getPrecocusto(){
        return this.precocusto;
    }

    public void setPrecocusto(String precocusto){
        this.precocusto = precocusto;
    }

    public String getPrecovenda(){
        return this.precovenda;
    }

    public void setPrecovenda(String precovenda){
        this.precovenda = precovenda;
    }

    /*public String getFoto(){
        return this.foto;
    }
    public void setFoto(String foto){
        this.foto = foto;
    }*/



    @Override
    public Object clone(){
        Produto clone = new Produto(this);
        return clone;
    }
}