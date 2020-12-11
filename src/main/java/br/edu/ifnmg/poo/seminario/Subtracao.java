/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.seminario;

/**
 * O objetivo da classe é oferecer uma representação matemática para o símbolo de "-",
 * ou seja, efetuar a subtração.
 * @author André Vinícius
 */
public class Subtracao extends Expressao{
    private Expressao expEsquerda;
    private Expressao expDireita;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Subtracao(Expressao expEsquerda, Expressao expDireita) {
        super();
        this.expEsquerda = expEsquerda;
        this.expDireita = expDireita;
    }
//</editor-fold>    
    
    @Override
    public int interpret(){
        return expEsquerda.interpret() - expDireita.interpret();
    }
    
    @Override
    public String toString() {
        return expEsquerda + " - " + expDireita + " = " + (Integer.parseInt(expEsquerda.toString())-Integer.parseInt(expDireita.toString()));
    }
}
