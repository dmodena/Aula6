/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Instrumento;
import com.dmodena.model.Bateria;
import com.dmodena.model.Saxofone;
import com.dmodena.model.Viola;
import java.util.Scanner;

/**
 *
 * @author dmodena
 */
public class TesteInstrumentos {
    
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int intInstrumento;
        int intOpcao;
        Instrumento instrumento;
        

        System.out.print("Selecione um instrumento (1 - Bateria, 2 - Saxofone, 3 - Viola): ");
        intInstrumento = Integer.parseInt(sc.nextLine());

        
        switch(intInstrumento) {
            case 1:
                instrumento = new Bateria();
                break;
            case 2:
                instrumento = new Saxofone();
                break;
            default:
                instrumento = new Viola();
                break;
        }
        
        System.out.print("Escolha uma opção (1 - Ver definição, 2 - Ver tipo, 3 - Tocar): ");
        intOpcao = Integer.parseInt(sc.nextLine());            

        
        switch(intOpcao) {
            case 1:
                System.out.println("\n" + instrumento.getDefinicao());
                break;
            case 2:
                System.out.println("\n" + instrumento.getTipo());
                break;
            default:
                System.out.println("\n" + instrumento.tocar());
                break;
        }
    }
}
