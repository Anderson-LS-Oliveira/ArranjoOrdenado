package org.example;

import java.util.Random;

import static org.example.ArranjoOrdenado.*;


public class Main {
    public static void main(String[] args) {

        int n = 100;
        int execucoes = 100;

        long[] temposCrescente = new long[execucoes];
        long[] temposDecrescente = new long[execucoes];
        long[] temposAleatorio = new long[execucoes];

        for(int i = 0; i < execucoes; i++){

            temposCrescente[i] = excluirCrescente(n);
            temposDecrescente[i] = excluirDecrescente(n);
            temposAleatorio[i] = excluirAleatorio(n);
        }

        double mediaC = media(temposCrescente);
        double mediaD = media(temposDecrescente);
        double mediaA = media(temposAleatorio);

        double desvioC = desvioPadrao(temposCrescente, mediaC);
        double desvioD = desvioPadrao(temposDecrescente, mediaD);
        double desvioA = desvioPadrao(temposAleatorio, mediaA);

        System.out.println("Resultados:");

        System.out.println("Crescente: " + mediaC + " +/- " + desvioC);
        System.out.println("Decrescente: " + mediaD + " +/- " + desvioD);
        System.out.println("Aleatorio: " + mediaA + " +/- " + desvioA);
    }
}