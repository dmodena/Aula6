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
public class Dvd extends Volume {
    private int tipo;
    private boolean extras;

    public Dvd(int id, String descricao, int anoAquisicao, ArrayList<String> autores, int tipo, boolean extras) {
        super.setId(id);
        super.setDescricao(descricao);
        super.setAnoAquisicao(anoAquisicao);
        super.setAutores(autores);  
        this.tipo = tipo;
        this.extras = extras;
    }
    
    // 1 - musical, 2 - filme
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if(tipo == 1 || tipo == 2)
            this.tipo = tipo;
    }

    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
    }
    
    @Override
    public String imprimir() {
        return "DVD " + tipo + (extras == true ? "com" : "sem") + " extras.";
    }
}
