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
public class Administrativo extends Assistente {
    private int turno;
    private double adicionalNoturno;
    
    public Administrativo(String nome, double salario, String codigoIdentificacao, int turno, double adicionalNoturno) {
        super.setNome(nome);
        super.setSalario(salario);
        super.setCodigoIdentificacao(codigoIdentificacao);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    // Turnos: 1- Diurno, 2 - Noturno
    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        if(turno == 1 || turno == 2) this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
    
    @Override
    public String toString() {
        return super.getNome() + " " + super.getSalario() + " " + super.getCodigoIdentificacao() + " " + turno + " " + adicionalNoturno;
    }
}
