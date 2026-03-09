package org.example;

import java.util.Random;

import static org.example.ArranjoOrdenado.*;


public class Main {
    public static void main(String[] args) {

        int n = 100000;
        int execucoes = 100;

        long[] temposInsercaoCrescente = new long[execucoes];
        long[] temposInsercaoDecrescente = new long[execucoes];
        long[] temposInsercaoAleatorio = new long[execucoes];

        long[] temposExclusaoCrescente = new long[execucoes];
        long[] temposExclusaoDecrescente = new long[execucoes];
        long[] temposExclusaoAleatorio = new long[execucoes];


        for(int i = 0; i < execucoes; i++){

            temposInsercaoCrescente[i] = inserirCrescente(n);
            temposInsercaoDecrescente[i] = inserirDescrescente(n);
            temposInsercaoAleatorio[i] = inserirAleatorio(n);

            temposExclusaoCrescente[i] = excluirCrescente(n);
            temposExclusaoDecrescente[i] = excluirDecrescente(n);
            temposExclusaoAleatorio[i] = excluirAleatorio(n);
        }

        double mediaInsercaoCrescente = media(temposInsercaoCrescente);
        double mediaInsercaoDecrescente = media(temposInsercaoDecrescente);
        double mediaInsercaoAleatorio = media(temposInsercaoAleatorio);

        double desvioInsercaoCrescente = desvioPadrao(temposInsercaoCrescente, mediaInsercaoCrescente);
        double desvioInsercaoDecrescente = desvioPadrao(temposInsercaoDecrescente, mediaInsercaoDecrescente);
        double desvioInsercaoAleatorio = desvioPadrao(temposInsercaoAleatorio, mediaInsercaoAleatorio);

        double mediaExclusaoCrescente = media(temposExclusaoCrescente);
        double mediaExclusaoDecrescente = media(temposExclusaoDecrescente);
        double mediaExclusaoAleatorio = media(temposExclusaoAleatorio);

        double desvioExclusaoCrescente = desvioPadrao(temposExclusaoCrescente, mediaExclusaoCrescente);
        double desvioExclusaoDecrescente = desvioPadrao(temposExclusaoDecrescente, mediaExclusaoDecrescente);
        double desvioExclusaoAleatorio = desvioPadrao(temposExclusaoAleatorio, mediaExclusaoAleatorio);

        System.out.println("Insercao:");
        System.out.println("Crescente: " + mediaInsercaoCrescente + " +/- " + desvioInsercaoCrescente);
        System.out.println("Decrescente: " + mediaInsercaoDecrescente + " +/- " + desvioInsercaoDecrescente);
        System.out.println("Aleatorio: " + mediaInsercaoAleatorio + " +/- " + desvioInsercaoAleatorio);

        System.out.println();

        System.out.println("Exclusao:");
        System.out.println("Crescente: " + mediaExclusaoCrescente + " +/- " + desvioExclusaoCrescente);
        System.out.println("Decrescente: " + mediaExclusaoDecrescente + " +/- " + desvioExclusaoDecrescente);
        System.out.println("Aleatorio: " + mediaExclusaoAleatorio + " +/- " + desvioExclusaoAleatorio);
    }
}