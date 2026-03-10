package org.example;

import static org.example.ArranjoOrdenado.*;

public class Main {
    public static void main(String[] args) {

        int n = 100000;
        int execucoes = 100;

        long[] temposInsercaoCrescente = new long[execucoes];
        long[] temposInsercaoCrescenteDec = new long[execucoes];
        long[] temposInsercaoDecrescente = new long[execucoes];
        long[] temposInsercaoDecrescenteDec = new long[execucoes];
        long[] temposInsercaoAleatorio = new long[execucoes];
        long[] temposInsercaoAleatorioDec = new long[execucoes];

        long[] temposExclusaoCrescente = new long[execucoes];
        long[] temposExclusaoCrescenteDec = new long[execucoes];
        long[] temposExclusaoDecrescente = new long[execucoes];
        long[] temposExclusaoDecrescenteDec = new long[execucoes];
        long[] temposExclusaoAleatorio = new long[execucoes];
        long[] temposExclusaoAleatorioDec = new long[execucoes];

        for(int i = 0; i < execucoes; i++){

            temposInsercaoCrescente[i] = inserirCrescente(n);
            temposInsercaoCrescenteDec[i] = inserirCrescente(n);
            temposInsercaoDecrescente[i] = inserirDescrescente(n);
            temposInsercaoDecrescenteDec[i] = inserirDescrescente(n);
            temposInsercaoAleatorio[i] = inserirAleatorio(n);
            temposInsercaoAleatorioDec[i] = inserirAleatorio(n);

            temposExclusaoCrescente[i] = excluirCrescente(n);
            temposExclusaoCrescenteDec[i] = excluirCrescente(n);
            temposExclusaoDecrescente[i] = excluirDecrescente(n);
            temposExclusaoDecrescenteDec[i] = excluirDecrescente(n);
            temposExclusaoAleatorio[i] = excluirAleatorio(n);
            temposExclusaoAleatorioDec[i] = excluirAleatorio(n);
        }

        double mediaInsercaoCrescente = media(temposInsercaoCrescente);
        double mediaInsercaoDecrescente = media(temposInsercaoDecrescente);
        double mediaInsercaoAleatorio = media(temposInsercaoAleatorio);

        double mediaInsercaoCrescenteDec = media(temposInsercaoCrescenteDec);
        double mediaInsercaoDecrescenteDec = media(temposInsercaoDecrescenteDec);
        double mediaInsercaoAleatorioDec = media(temposInsercaoAleatorioDec);

        double desvioInsercaoCrescente = desvioPadrao(temposInsercaoCrescente, mediaInsercaoCrescente);
        double desvioInsercaoDecrescente = desvioPadrao(temposInsercaoDecrescente, mediaInsercaoDecrescente);
        double desvioInsercaoAleatorio = desvioPadrao(temposInsercaoAleatorio, mediaInsercaoAleatorio);

        double desvioInsercaoCrescenteDec = desvioPadrao(temposInsercaoCrescenteDec, mediaInsercaoCrescenteDec);
        double desvioInsercaoDecrescenteDec = desvioPadrao(temposInsercaoDecrescenteDec, mediaInsercaoDecrescenteDec);
        double desvioInsercaoAleatorioDec = desvioPadrao(temposInsercaoAleatorioDec, mediaInsercaoAleatorioDec);

        double mediaExclusaoCrescente = media(temposExclusaoCrescente);
        double mediaExclusaoDecrescente = media(temposExclusaoDecrescente);
        double mediaExclusaoAleatorio = media(temposExclusaoAleatorio);

        double mediaExclusaoCrescenteDec = media(temposExclusaoCrescenteDec);
        double mediaExclusaoDecrescenteDec = media(temposExclusaoDecrescenteDec);
        double mediaExclusaoAleatorioDec = media(temposExclusaoAleatorioDec);

        double desvioExclusaoCrescente = desvioPadrao(temposExclusaoCrescente, mediaExclusaoCrescente);
        double desvioExclusaoDecrescente = desvioPadrao(temposExclusaoDecrescente, mediaExclusaoDecrescente);
        double desvioExclusaoAleatorio = desvioPadrao(temposExclusaoAleatorio, mediaExclusaoAleatorio);

        double desvioExclusaoCrescenteDec = desvioPadrao(temposExclusaoCrescenteDec, mediaExclusaoCrescenteDec);
        double desvioExclusaoDecrescenteDec = desvioPadrao(temposExclusaoDecrescenteDec, mediaExclusaoDecrescenteDec);
        double desvioExclusaoAleatorioDec = desvioPadrao(temposExclusaoAleatorioDec, mediaExclusaoAleatorioDec);

        System.out.println("Inserção\t\tOrdenação crescente\t\tOrdenação decrescente");

        System.out.println("Inserção crescente\t"
                + mediaInsercaoCrescente + " +/- " + desvioInsercaoCrescente + "\t\t"
                + mediaInsercaoCrescenteDec + " +/- " + desvioInsercaoCrescenteDec);

        System.out.println("Inserção decrescente\t"
                + mediaInsercaoDecrescente + " +/- " + desvioInsercaoDecrescente + "\t\t"
                + mediaInsercaoDecrescenteDec + " +/- " + desvioInsercaoDecrescenteDec);

        System.out.println("Inserção aleatória\t"
                + mediaInsercaoAleatorio + " +/- " + desvioInsercaoAleatorio + "\t\t"
                + mediaInsercaoAleatorioDec + " +/- " + desvioInsercaoAleatorioDec);

        System.out.println();
        System.out.println("Exclusão\t\tOrdenação crescente\t\tOrdenação decrescente");

        System.out.println("Exclusão crescente\t"
                + mediaExclusaoCrescente + " +/- " + desvioExclusaoCrescente + "\t\t"
                + mediaExclusaoCrescenteDec + " +/- " + desvioExclusaoCrescenteDec);

        System.out.println("Exclusão decrescente\t"
                + mediaExclusaoDecrescente + " +/- " + desvioExclusaoDecrescente + "\t\t"
                + mediaExclusaoDecrescenteDec + " +/- " + desvioExclusaoDecrescenteDec);

        System.out.println("Exclusão aleatória\t"
                + mediaExclusaoAleatorio + " +/- " + desvioExclusaoAleatorio + "\t\t"
                + mediaExclusaoAleatorioDec + " +/- " + desvioExclusaoAleatorioDec);
    }
}