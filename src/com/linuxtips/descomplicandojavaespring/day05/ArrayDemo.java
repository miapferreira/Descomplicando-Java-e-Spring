package com.linuxtips.descomplicandojavaespring.day05;


import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

    public static void main(String[] args) {


        //Estrutura de dados simples para armazenar uma coleção de elementos//

        //maneira mais simples de declarar array
        int[] arrayDeInt;
        //maneira menos comum
        int arrayDeInt2[];

        //inicializando uma array caso o número de elementos já for conhecido
        int[] arrayDeInt3 = new int[20];


        // Preenchendo o array
        Integer[] arrayDeInt4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Descobrindo o tamanho do array
        int arraySize = arrayDeInt4.length;
        System.out.println("O tamanho do array é " + arraySize);

        //Percorrendo o array
        List<Integer> itens = Arrays.asList(arrayDeInt4);
        itens.forEach(System.out::println);

        //Copiando um array CopyOfRange
        String[] treinamento = new String[]{
                "treinamento",
                "descomplicando",
                "java",
                "e",
                "spring",
                "da",
                "linux",
                "tips"};

        String[] treinamentoNome = Arrays.copyOfRange(treinamento,1, 5);
        List<String> treinamentoNomeList = List.of(treinamentoNome);
        treinamentoNomeList.forEach(System.out::println);

        // Não é possível escolher o range

        String[] arrayCom2 = Arrays.copyOf(treinamentoNome, 2);
        List<String> arrayCom2List = List.of(arrayCom2);
        arrayCom2List.forEach(System.out::println);



        }



    }
