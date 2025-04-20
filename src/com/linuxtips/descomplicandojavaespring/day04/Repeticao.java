package com.linuxtips.descomplicandojavaespring.day04;

import java.util.Scanner;

public class Repeticao {

    public static void main(String[] args) {

        // Exemplo de laço for
        for (int i = 0; i <= 100; i++) {
            System.out.println("Nesta repetição, i está valendo " + i);
        }

        // Criando Scanner dentro do método
        Scanner in = new Scanner(System.in);
        int valorSecreto = 0; // Inicializando a variável

        // Loop While para adivinhar o número
        while (valorSecreto != 12345) {
            System.out.println("Adivinhe o valor secreto:");
            valorSecreto = in.nextInt();

            if (valorSecreto == 12345) {
                System.out.println("Você acertou o valor, parabéns!");
            } else {
                System.out.println("Não é este o valor, tente novamente.");
            }
        }

        // do-while
        int valor =10;
        do{
            System.out.println(valor);
            valor ++;
        }while (valor <=50);

        // Fechando o Scanner (boa prática)
        in.close();
    }
}
