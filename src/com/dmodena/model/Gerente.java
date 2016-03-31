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
public class Gerente extends Funcionario {
    
    public Gerente(String nome, double salario) {
        super.setNome(nome);
        super.setSalario(salario);
    }    
    
    @Override
    public String toString() {
        return super.getNome() + " " + super.getSalario();
    }
}
