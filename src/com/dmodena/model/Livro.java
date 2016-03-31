/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.util.ArrayList;

/**
 *
 * @author dmodena
 */
public class Livro extends Volume {
    private String editora;
    private int anoPublicacao;

    public Livro(int id, String descricao, int anoAquisicao, ArrayList<String> autores, String editora, int anoPublicacao) {
        super.setId(id);
        super.setDescricao(descricao);
        super.setAnoAquisicao(anoAquisicao);
        super.setAutores(autores);  
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }
    
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
