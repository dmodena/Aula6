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
public class Cd extends Volume {
    private String genero;
    private ArrayList<String> idFaixas;

    public Cd(int id, String descricao, int anoAquisicao, ArrayList<String> autores, String genero, ArrayList<String> idFaixas) {
        super.setId(id);
        super.setDescricao(descricao);
        super.setAnoAquisicao(anoAquisicao);
        super.setAutores(autores);  
        this.genero = genero;
        this.idFaixas = idFaixas;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<String> getIdFaixas() {
        return idFaixas;
    }

    public void setIdFaixas(ArrayList<String> idFaixas) {
        this.idFaixas = idFaixas;
    }
}
