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
public abstract class Volume {
    private int id;
    private String descricao;
    private int anoAquisicao;
    private ArrayList<String> autores;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoAquisicao() {
        return anoAquisicao;
    }

    public void setAnoAquisicao(int anoAquisicao) {
        this.anoAquisicao = anoAquisicao;
    }
    
    public void cadastrarAutor(String autor) {
        autores.add(autor);
    }
    
    public void removerAutor(String autor) {
        autores.remove(autor);
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }    
}
