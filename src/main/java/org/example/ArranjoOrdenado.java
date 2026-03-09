package org.example;

import java.util.Random;
import java.util.function.Consumer;

public class ArranjoOrdenado {
    private int[] arranjo;
    private int capacidade;
    private int tamanho;

    public ArranjoOrdenado(int capicidade){
        this.capacidade = capicidade;
        this.tamanho = 0;
        arranjo = new int[capicidade];
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
        //procura a posição do novo elemento
        //[3, 7, 0, 0, 0]
        for (indice = 0; indice < tamanho; indice++){
            if (valor < arranjo[indice]){
                break;
            }
        };

        for (int i = tamanho - 1; i >= indice; i--){
            arranjo[i+1] = arranjo[i];
        }
        arranjo[indice] = valor;
        tamanho++;
    }

    public void excluir(int valor){
        if (tamanho < 1) {
            throw new RuntimeException("O arranjo está vazio!");
        }
        int indice = 0;
        for (indice = 0; indice < tamanho; indice++){
            if (valor < arranjo[indice]){
                break;
            }
        }
        if (indice == tamanho -1){
            throw new RuntimeException("O elemento "+valor+" não está no arranjo.");
        }
        for (int i = indice; i < tamanho; i++){
            arranjo[i-1] = arranjo[i];
        }
        tamanho--;
    }

    public static void inserirCrescente(int valor){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(valor);
        long T1 = System.nanoTime();

        for (int i = 1; i <= valor; i++){
            arranjo.inserir(i);
        }
        long T2 = System.nanoTime();
        long Total = T2 - T1;

        System.out.println("Inserir em ordem crescente - Tempo final: " + Total);
    }

    public static void inserirDescrescente(int valor){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(valor);
        long T1 = System.nanoTime();

        for (int i = valor; i >= 1; i--){
            arranjo.inserir(i);
        }
        long T2 = System.nanoTime();
        long Total = T2 - T1;

        System.out.println("Inserir em ordem decrescente - Tempo final: " + Total);
    }

    public static void inserirAleatorio(int valor){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(valor);
        Random random = new Random();
        int[] numeros = new int[valor];

        long T1 = System.nanoTime();
        for (int i = 0; i < valor; i++){
            int num = random.nextInt(valor);
            arranjo.inserir(num);
            numeros[i] = num;
        }
        long T2 = System.nanoTime();
        long Total = T2 - T1;

        System.out.println("Inserir aleatóriamente - Tempo final: " + Total);
    }






}
