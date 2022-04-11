package com.example.homeapp.modelos;

public class Usuario  implements Cloneable{
    private int id;
    private String nome;
    private String email;
    private String documento;
    private String telefone;
    private String senha;
    private String cep;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;


    public Usuario(){}

   // public Usuario(String email, String senha){
       // this.email = email;
       // this.senha = senha;
   // }

    public Usuario(int id, String email, String senha){
        this.id = id;
        this.email = email;
        this.senha = senha;
    }

    public Usuario (String nome, String email, String cpf, String telefone, String senha,
                    String cep, String endereco, String bairro, String cidade, String estado){
        this.nome = nome;
        this.email = email;
        this.documento = cpf;
        this.telefone = telefone;
        this.senha = senha;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Usuario (int id, String nome, String email, String cpf, String telefone, String senha,
                    String cep, String endereco, String bairro, String cidade, String estado){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.documento = cpf;
        this.telefone = telefone;
        this.senha = senha;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Usuario(Usuario u){
        this.id = u.id;
        this.nome = u.nome;
        this.email = u.email;
        this.documento = u.documento;
        this.telefone = u.telefone;
        this.senha = u.senha;
        this.cep = u.cep;
        this.endereco = u.endereco;
        this.bairro = u.bairro;
        this.cidade = u.cidade;
        this.estado = u.estado;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getDocumento(){
        return this.documento;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getCep(){
        return this.cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getBairro(){
        return this.bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getCidade(){
        return this.cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    @Override
    public Object clone(){
        Usuario clone = new Usuario(this);
        return clone;
    }
}