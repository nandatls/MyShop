package com.example.homeapp.modelos;

import android.text.Editable;

public class Vendedor  implements Cloneable{
    private int idv;
    private String nomev;
    private String emailv;
    private String documentov;
    private String telefonev;
    private String senhav;
    private String cepv;
    private String enderecov;
    private String bairrov;
    private String cidadev;
    private String estadov;

    public Vendedor(){}
    public Vendedor(int id, String email, String senha){
        this.idv = id;
        this.emailv = email;
        this.senhav = senha;
    }

    public Vendedor (String nome, String email, String documento, String telefone, String senha,
                    String cep, String endereco, String bairro, String cidade, String estado){
        this.nomev = nome;
        this.emailv = email;
        this.documentov = documento;
        this.telefonev = telefone;
        this.senhav = senha;
        this.cepv = cep;
        this.enderecov = endereco;
        this.bairrov = bairro;
        this.cidadev = cidade;
        this.estadov = estado;
    }

    public Vendedor (int id, String nome, String email, String documento, String telefone, String senha,
                    String cep, String endereco, String bairro, String cidade, String estado){
        this.idv = id;
        this.nomev = nome;
        this.emailv = email;
        this.documentov = documento;
        this.telefonev = telefone;
        this.senhav = senha;
        this.cepv = cep;
        this.enderecov = endereco;
        this.bairrov = bairro;
        this.cidadev = cidade;
        this.estadov = estado;
    }
    public Vendedor(Vendedor v){
        this.idv = v.idv;
        this.nomev = v.nomev;
        this.emailv = v.emailv;
        this.documentov = v.documentov;
        this.telefonev = v.telefonev;
        this.senhav = v.senhav;
        this.cepv = v.cepv;
        this.enderecov = v.enderecov;
        this.bairrov = v.bairrov;
        this.cidadev = v.cidadev;
        this.estadov = v.estadov;
    }

    public int getId(){
        return this.idv;
    }

    public void setId(int id){
        this.idv = id;
    }

    public String getNome(){
        return this.nomev;
    }

    public void setNome(String nome){
        this.nomev = nome;
    }

    public String getEmail(){
        return this.emailv;
    }

    public void setEmail(String email){
        this.emailv = email;
    }

    public String getDocumento(){
        return this.documentov;
    }

    public void setDocumento(String documento){
        this.documentov = documento;
    }

    public String getTelefone(){
        return this.telefonev;
    }

    public void setTelefone(String telefone){
        this.telefonev = telefone;
    }

    public String getSenha(){
        return this.senhav;
    }

    public void setSenha(String senha) {
        this.senhav = senha;
    }

    public String getCep(){
        return this.cepv;
    }

    public void setCep(String cep){
        this.cepv = cep;
    }

    public String getEndereco(){
        return this.enderecov;
    }

    public void setEndereco(String endereco){
        this.enderecov = endereco;
    }

    public String getBairro(){
        return this.bairrov;
    }

    public void setBairro(String bairro){
        this.bairrov = bairro;
    }

    public String getCidade(){
        return this.cidadev;
    }

    public void setCidade(String cidade){
        this.cidadev = cidade;
    }

    public String getEstado(){
        return this.estadov;
    }

    public void setEstado(String estado){
        this.estadov = estado;
    }

    @Override
    public Object clone(){
        Vendedor clone = new Vendedor(this);
        return clone;
    }
}