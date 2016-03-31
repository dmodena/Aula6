/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.RegexCatalogo;
import java.util.Scanner;

/**
 *
 * @author dmodena
 */
public class TesteCatalogo {
    
    public static void main(String Args[]) {
        int cadastrarListarVolumes = imprimeCadastrarListarVolumes();
        
        if(cadastrarListarVolumes == 1) {
            int tipoVolume = imprimeSelecaoTipoVolume();
        }
        else {
            
        }
    }
    
    public static int imprimeCadastrarListarVolumes() {
        Scanner sc = new Scanner(System.in);
        String s;
        
        do {
            System.out.print("Escolha uma opcao (1 - Cadastrar Volume, 2 - Listar Volumes): ");
            s = sc.nextLine();
        } while(!(RegexCatalogo.validarCadastrarListarVolumes(s)));
        
        return Integer.parseInt(s);        
    }
    
    private static int imprimeSelecaoTipoVolume() {
        Scanner sc = new Scanner(System.in);
        String s;
        
        do {
            System.out.print("Tipo do volume (1 - CD, 2 - DVD, 3 - Livro): ");
            s = sc.nextLine();
        } while(!(RegexCatalogo.validarTipoVolume(s)));
        
        return Integer.parseInt(s);  
    }
}
