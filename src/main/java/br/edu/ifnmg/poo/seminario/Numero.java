/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.seminario;

/**
 * Essa classe fornece uma representação para um número em uma expressão.
 * @author André Vinícius
 */
public class Numero extends Expressao {
    private int numero;
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Numero(int numero) {
        super();
        this.numero = numero;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
//</editor-fold>    
    
    @Override
    public int interpret(){
        return getNumero();
    }

    @Override
    public String toString() {
        return String.valueOf(numero);
    }
    
    
}
