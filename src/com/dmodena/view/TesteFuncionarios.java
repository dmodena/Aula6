/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Funcionario;
import com.dmodena.model.Gerente;
import com.dmodena.model.Administrativo;
import com.dmodena.model.Tecnico;
import java.util.ArrayList;

/**
 *
 * @author dmodena
 */
public class TesteFuncionarios {
    public static void main(String Args[]) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
        Gerente gerente = new Gerente("Sr. Gengibre", 5200d);
        Administrativo administrativo = new Administrativo("Alicia", 2700d, "adm201501", 1, 240d);
        Tecnico tecnico = new Tecnico("Silvestre", 2250d, "tec201501", 500d);

        funcionarios.add(gerente);
        funcionarios.add(administrativo);
        funcionarios.add(tecnico);
        
        for(Funcionario f : funcionarios) {
            System.out.println(f.toString());
        }
    }    
}
