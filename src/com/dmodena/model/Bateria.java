/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

/**
 *
 * @author dmodena
 */
public class Bateria extends Instrumento {
    
    public Bateria() {
        super.setDefinicao("Bateria é um instrumento de percussão");
        super.setTipo("Percussão");
    }
    
    @Override
    public String tocar() {
        return "Tocando o som de uma bateria";
    }
}
