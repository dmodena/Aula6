/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Animal;
import com.dmodena.model.Cachorro;
import com.dmodena.model.Gato;
import com.dmodena.model.Leao;
import com.dmodena.model.Lobo;
import java.util.ArrayList;

/**
 *
 * @author dmodena
 */
public class TesteAnimais {
    public static void main(String Args[]) {
        ArrayList<Animal> animais = new ArrayList<>();
        
        Animal cachorro = new Cachorro(10, "America do Sul");
        Animal gato = new Gato(5, "America do Norte");
        Animal leao = new Leao(90, "Africa");
        Animal lobo = new Lobo(25, "Europa");
        
        animais.add(cachorro);
        animais.add(gato);
        animais.add(leao);
        animais.add(lobo);
        
        for(Animal a : animais) {
            System.out.println(a.getPeso());
            System.out.println(a.getHabitat());
            System.out.println(a.alimentar());
            
            if(a instanceof Cachorro) 
                System.out.println(((Cachorro) a).brincar());
            if(a instanceof Gato)
                System.out.println(((Gato) a).brincar());
            
            System.out.println();            
        }
    }
}
