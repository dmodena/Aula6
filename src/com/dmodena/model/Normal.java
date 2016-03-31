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
public class Normal extends Ingresso {
    
    public Normal(double valor) {
        super.setValor(valor);
    }
    
    public double imprimeValor() {
        return super.getValor();
    }
}
