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
public class CamaroteSuperior extends Vip {
    private double extraCamarote;
    
    public CamaroteSuperior(double valor, double valorAdicional, double extraCamarote) {
        super(valor, valorAdicional);
        this.extraCamarote = extraCamarote;
    }
    
    public double getExtraCamarote() {
        return extraCamarote;
    }
    
    public void setExtraCamarote(double extraCamarote) {
        this.extraCamarote = extraCamarote;
    }
    
    @Override
    public double imprimeValor() {
        return super.getValor() + super.getValorAdicional() + extraCamarote;
    }
}
