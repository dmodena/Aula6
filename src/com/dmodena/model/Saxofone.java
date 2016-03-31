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
public class Saxofone extends Instrumento {
    
    public Saxofone() {
        super.setDefinicao("Saxofone é um instrumento de sopro");
        super.setTipo("Sopro");
    }
    
    @Override
    public String tocar() {
        return "Tocando o som de um saxofone";
    }
}
