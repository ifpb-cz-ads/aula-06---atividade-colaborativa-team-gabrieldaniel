package com.ifpb.atividade06.Models;

public class Produto {

    private String nome;
    private String ID;
    private float preco;

    public Produto(String nome, String ID, float preco) {
        this.nome = nome;
        this.ID = ID;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
