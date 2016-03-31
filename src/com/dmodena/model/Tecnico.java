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
public class Tecnico extends Assistente {
    private double bonusSalarial;
    
    public Tecnico(String nome, double salario, String codigoIdentificacao, double bonusSalarial) {
        super.setNome(nome);
        super.setSalario(salario);
        super.setCodigoIdentificacao(codigoIdentificacao);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }    
    
    @Override
    public String toString() {
        return super.getNome() + " " + super.getSalario() + " " + super.getCodigoIdentificacao() + " " + bonusSalarial;
    }
}
