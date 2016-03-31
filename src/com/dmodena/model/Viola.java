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
public class Viola extends Instrumento {
    
    public Viola() {
        super.setDefinicao("Viola é instrumento de corda");
        super.setTipo("Corda");
    }
    
    @Override
    public String tocar() {
        return "Tocando o som de uma viola";
    }
}
