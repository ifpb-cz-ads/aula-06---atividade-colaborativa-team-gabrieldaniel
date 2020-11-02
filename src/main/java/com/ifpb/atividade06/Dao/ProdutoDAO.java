package com.ifpb.atividade06.Dao;

import com.ifpb.atividade06.Models.Produto;

import java.util.ArrayList;

public class ProdutoDAO {

    private ArrayList<Produto> produtos;

    public ProdutoDAO(){
        this.produtos = new ArrayList<Produto>();
        this.produtos.add(new Produto("Arroz", "1", 9.00f));
        this.produtos.add(new Produto("Feijão", "2", 10.00f));
        this.produtos.add(new Produto("Macarrão", "3", 9.00f));
        this.produtos.add(new Produto("Notebook", "4", 9.00f));
        this.produtos.add(new Produto("Xiaomi Melhor e mais barato", "5", 500.00f));
        this.produtos.add(new Produto("Kulbot Kingkong(Para jogar frifas na floresta)", "6", 100.00f));
    }

    public ArrayList<Produto> read(){
        return this.produtos;
    }


}
