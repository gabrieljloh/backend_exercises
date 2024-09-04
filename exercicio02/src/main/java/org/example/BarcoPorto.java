package org.example;

import java.util.ArrayList;

public class BarcoPorto {
    private String nome;

    private ArrayList<Barco> barcosAtracados = new ArrayList<>();

    public void atracarBarco(String nome, String tamanho) {
        Barco barco = new Barco(nome, tamanho);
        barcosAtracados.add(barco);
    }

    public void desatracarBarco() {

    }
}
