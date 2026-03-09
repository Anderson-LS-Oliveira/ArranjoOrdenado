package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArranjoOrdenadoTest {

    @Test
    public void inserirNumArranjoCheio(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(2);
        try{
            arranjo.inserir(10);
            arranjo.inserir(10);
            arranjo.inserir(10);
            Assertions.fail("Deve lançar uma exceção quando o ArranjoOrdenado estiver cheio.");
        }catch (RuntimeException ignored){}
    }

    @Test
    public void inserirNumArranjoVazio(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        arranjo.inserir(9);
        StringBuilder builder = new StringBuilder();
        arranjo.percorrer(i -> builder.append(i));
        Assertions.assertEquals("9",builder.toString());
    }

    @Test
    public void inserirDoisElementosArranjo(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        arranjo.inserir(4);
        arranjo.inserir(9);
        StringBuilder builder = new StringBuilder();
        arranjo.percorrer(i -> builder.append(i));
        Assertions.assertEquals("49",builder.toString());
    }

    @Test
    public void inserirNoMeioDeDoisElementosArranjo(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        arranjo.inserir(4);
        arranjo.inserir(9);
        arranjo.inserir(5);
        StringBuilder builder = new StringBuilder();
        arranjo.percorrer(i -> builder.append(i));
        Assertions.assertEquals("459",builder.toString());
    }

    @Test
    public void inserirNoComecoArranjo(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        arranjo.inserir(4);
        arranjo.inserir(9);
        arranjo.inserir(5);
        arranjo.inserir(1);
        StringBuilder builder = new StringBuilder();
        arranjo.percorrer(i -> builder.append(i));
        Assertions.assertEquals("1459",builder.toString());
    }

    @Test
    public void excluirUmElementoNoMeioDoArranjo(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        arranjo.inserir(4);
        arranjo.inserir(9);
        arranjo.inserir(5);
        arranjo.inserir(1);
        arranjo.excluir(4);
        StringBuilder builder = new StringBuilder();
        arranjo.percorrer(i -> builder.append(i));
        Assertions.assertEquals("159",builder.toString());
    }

    @Test
    public void excluirDeArranjoVazio(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        try{
            arranjo.excluir(10);
            Assertions.fail("Deve lançar uma exceção quando o ArranjoOrdenado estiver vazio.");
        }catch (RuntimeException ignored){}
    }

    @Test
    public void excluirValorInexistente(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        try{
            arranjo.inserir(4);
            arranjo.inserir(9);
            arranjo.excluir(7);
            Assertions.fail("Deve lançar uma exceção quando o elemento não estiver no arranjo.");
        }catch (RuntimeException ignored){}
    }

    @Test
    public void excluirPrimeiroElemento(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        arranjo.inserir(4);
        arranjo.inserir(9);
        arranjo.inserir(5);
        arranjo.excluir(4);

        StringBuilder builder = new StringBuilder();
        arranjo.percorrer(i -> builder.append(i));

        Assertions.assertEquals("59",builder.toString());
    }

    @Test
    public void excluirUltimoElemento(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        arranjo.inserir(4);
        arranjo.inserir(9);
        arranjo.inserir(5);
        arranjo.excluir(9);

        StringBuilder builder = new StringBuilder();
        arranjo.percorrer(i -> builder.append(i));

        Assertions.assertEquals("45",builder.toString());
    }


}