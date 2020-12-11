/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.seminario;

import java.util.Stack;

/**
 * Seminário de Programação Orientada a Objetos
 * Programa para resolver uma expressão pós-fixada.
 * O código foi baseado nas seguintes referências:
 * - https://timepasstechies.com/interpreter-design-pattern-java-example/
 * - https://www.oodesign.com/interpreter-pattern.html
 * - https://springframework.guru/gang-of-four-design-patterns/interpreter-pattern/
 * @author André Vinícius
 * @version 1.0
 */
public class Program {
    public static void main(String[] args) {
        String expressao = "1 2 3 * +";
        
        Stack<Expressao> stack = new Stack<>();
        String[] tokenExpressao = expressao.split(" ");
        for (String str : tokenExpressao){
            if (isOperator(str)) {
                Expressao expDireita = stack.pop();
                Expressao expEsquerda = stack.pop();
                Expressao operador = getOperator(str, expEsquerda, expDireita);
                int result = operador.interpret();
                stack.push(new Numero(result));
            } else {
                Expressao num = new Numero(Integer.parseInt(str));
                stack.push(num);
            }
        }
        System.out.println("Expressão: " + expressao);
        System.out.println("Resultado: " + stack.pop().interpret());
    }
    /**
     * Função para verificar se um determinado token do tipo string,
     * é um operador.
     * @param str Token recebido para verificação.
     * @return Verdadeiro, caso o token seja um operador ou falso, caso não seja.
     */
    public static boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*");
    }
    /**
     * Função para verificar qual operação fazer com determinado símbolo. 
     * @param str String contendo o símbolo matemático.
     * @param expEsquerda Expressão númerica da esquerda.
     * @param expDireita Expressão númerica da direita.
     * @return Retorna uma expressão ou um valor nulo, caso o símbolo da string não se encaixe nos casos abaixo.                                                                                                                                                                                                                    
     */
    public static Expressao getOperator(String str, Expressao expEsquerda, Expressao expDireita) {
        switch (str) {
            case "+":
                return new Adicao(expEsquerda, expDireita);
            case "-":
                return new Subtracao(expEsquerda, expDireita);
            case "*":
                return new Multiplicacao(expEsquerda, expDireita);
            case "/":
                return new Divisao(expEsquerda, expDireita);
            default:
                break;
        }
        return null;
    }
}