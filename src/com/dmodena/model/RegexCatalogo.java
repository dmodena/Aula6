/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dmodena
 */
public class RegexCatalogo {
    
    public static boolean validarCadastrarListarVolumes(String hex) {
        Pattern pattern = Pattern.compile("[12]{1}");
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
    
    public static boolean validarTipoVolume(String hex) {
        Pattern pattern = Pattern.compile("[123]{1}");
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
    
    public static boolean validarIdVolume(String hex) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
