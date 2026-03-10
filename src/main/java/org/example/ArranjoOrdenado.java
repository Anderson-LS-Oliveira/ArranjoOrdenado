package org.example;

import java.util.Random;
import java.util.function.Consumer;

public class ArranjoOrdenado {

    private int[] arranjo;
    private int capacidade;
    private int tamanho;

    private boolean crescente;

    public ArranjoOrdenado(int capacidade, boolean crescente){
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.crescente = crescente;
        arranjo = new int[capacidade];
    }

    public void percorrer(Consumer<Integer> consumer){
        for (int i = 0; i < tamanho; i++){
            consumer.accept(arranjo[i]);
        }
    }

    public void inserir(int valor){

        if (tamanho == capacidade){
            throw new RuntimeException("Arranjo está cheio!");
        }
        int indice = 0;
        for (indice = 0; indice < tamanho; indice++){
            if (crescente){
                if (valor < arranjo[indice]){
                    break;
                }
            } else {
                if (valor > arranjo[indice]){
                    break;
                }
            }
        }
        for (int i = tamanho - 1; i >= indice; i--){
            arranjo[i + 1] = arranjo[i];
        }
        arranjo[indice] = valor;
        tamanho++;
    }

    public void excluir(int valor){

        if (tamanho == 0) {
            throw new RuntimeException("O arranjo está vazio!");
        }
        int indice = 0;
        for (indice = 0; indice < tamanho; indice++){
            if (valor == arranjo[indice]){
                break;
            }
        }
        if (indice == tamanho){
            throw new RuntimeException("O elemento "+valor+" não está no arranjo.");
        }
        for (int i = indice; i < tamanho -1; i++){
            arranjo[i] = arranjo[i +1];
        }
        tamanho--;
    }

    public static long inserirCrescente(int valor){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(valor, true);

        long T1 = System.nanoTime();
        for (int i = 1; i <= valor; i++){
            arranjo.inserir(i);
        }
        long T2 = System.nanoTime();

        return T2 - T1;
    }

    public static long inserirDescrescente(int valor){

        ArranjoOrdenado arranjo = new ArranjoOrdenado(valor, false);

        long T1 = System.nanoTime();
        for (int i = valor; i >= 1; i--){
            arranjo.inserir(i);
        }
        long T2 = System.nanoTime();

        return T2 - T1;
    }

    public static long inserirAleatorio(int valor){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(valor, true);

        Random random = new Random();
        int[] numeros = new int[valor];
        long T1 = System.nanoTime();
        for (int i = 0; i < valor; i++){
            int num = random.nextInt(valor);
            arranjo.inserir(num);
            numeros[i] = num;
        }
        long T2 = System.nanoTime();

        return T2 - T1;
    }

    public static long excluirCrescente(int valor){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(valor, true);

        for(int i = 1; i <= valor; i++){
            arranjo.inserir(i);
        }
        long T1 = System.nanoTime();
        for(int i = 1; i <= valor; i++){
            arranjo.excluir(i);
        }
        long T2 = System.nanoTime();

        return T2 - T1;
    }

    public static long excluirDecrescente(int valor){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(valor, false);

        for(int i = 1; i <= valor; i++){
            arranjo.inserir(i);
        }
        long T1 = System.nanoTime();
        for(int i = valor; i >= 1; i--){
            arranjo.excluir(i);
        }
        long T2 = System.nanoTime();

        return T2 - T1;
    }

    public static long excluirAleatorio(int valor){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(valor, true);

        Random random = new Random();
        int[] numeros = new int[valor];
        for(int i = 0; i < valor; i++){
            int num = random.nextInt(valor);
            arranjo.inserir(num);
            numeros[i] = num;
        }
        long T1 = System.nanoTime();
        for(int i = 0; i < valor; i++){
            arranjo.excluir(numeros[i]);
        }
        long T2 = System.nanoTime();

        return T2 - T1;
    }

    public static double media(long[] tempos){
        long soma = 0;
        for(long t : tempos){
            soma += t;
        }
        return soma / (double) tempos.length;
    }

    public static double desvioPadrao(long[] tempos, double media){
        double soma = 0;
        for(long t : tempos){
            soma += Math.pow(t - media, 2);
        }
        return Math.sqrt(soma / tempos.length);
    }

}