package org.example;

import java.util.Random;

import static org.example.ArranjoOrdenado.*;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int x = 100000;

        for (int i = 0; i <= 100; i++){
            inserirCrescente(x);
            inserirDescrescente(x);
            inserirAleatorio(x);
        }



    }
}