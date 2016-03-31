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
public abstract class Assistente extends Funcionario {
    private String codigoIdentificacao;
    
    public String getCodigoIdentificacao() {
        return codigoIdentificacao;
    }
    
    public void setCodigoIdentificacao(String codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }
}
