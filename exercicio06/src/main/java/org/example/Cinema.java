package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cinema {

    private ArrayList<Filme> filmesDisponiveis = new ArrayList<>();
    private LinkedList<Ingresso> ingressosVendidos = new LinkedList<>();


    public void adicionarFilme(String nome, Float preco, Integer idadeMinima) {
        Filme filme = new Filme(nome, preco, idadeMinima);
        filmesDisponiveis.add(filme);
    }
}
