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
public class Leao extends Animal {
    
    public Leao(double peso, String habitat) {
        super.setPeso(peso);
        super.setHabitat(habitat);
    }
    
    @Override
    public String alimentar() {
        return "Implementar maneira como um leão se alimenta.";
    }
}
