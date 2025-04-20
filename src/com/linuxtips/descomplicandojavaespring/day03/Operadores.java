package com.linuxtips.descomplicandojavaespring.day03;

public class Operadores {

    public static void main(String[] args) {

        // Operador de atribuição
        int idade = 25;
        System.out.println("Valor de atribuicao a idade: " + idade);

        // Operadores matemáticos
        int soma = idade + 5;
        System.out.println("Resultado da soma: " + soma);
        int multiplicacao = soma * 2;
        System.out.println("Resultado da multiplicacao: " + multiplicacao);
        int divisao = multiplicacao / 2;
        System.out.println("Resultado da divisao: " + divisao);
        int modulo = divisao % 4;
        System.out.println("Resultado do modulo: " + modulo);

        // Incremento e decremento
        int incremento = 15;
        System.out.println("Valor original antes do incremento: " + incremento);
        incremento++;
        System.out.println("Valor apos o incremento: " + incremento);

        int decremento = 20;
        System.out.println("Valor original antes do decremento: " + decremento);
        decremento--;
        System.out.println("Valor apos o decremento: " + decremento);

        // Operadores de igualdade
        long valor1 = 1L;
        long valor2 = 2L;

        if (valor1 == valor2) {
            System.out.println("Valores iguais");
        } else {
            System.out.println("Valores Diferentes");
        }

        double valor3 = 10.2;
        double valor4 = 100.2;

        if (valor3 != valor4) {
            System.out.println("Valores Diferentes");
        } else {
            System.out.println("Valores iguais");
        }

        // Operadores relacionais
        int primeiroValor = 1234;
        int segundoValor = 1233;

        if (primeiroValor > segundoValor) {
            System.out.println(primeiroValor + " é maior que " + segundoValor);
        }

        if (primeiroValor >= segundoValor) {
            System.out.println(primeiroValor + " é maior ou igual a " + segundoValor);
        }

        // Operadores lógicos
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println("Resultado de verdadeiro || falso: " + (verdadeiro || falso));
        System.out.println("Resultado de verdadeiro && falso: " + (verdadeiro && falso));
    }
}
