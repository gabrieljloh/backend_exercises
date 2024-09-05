package org.example;

import java.util.ArrayList;

public class BasePorto {
    protected String nome;
    protected ArrayList<Barco> barcosAtracados;

    public BasePorto(String nome) {
        this.nome = nome;
        this.barcosAtracados = new ArrayList<>();
    }

    public void atracarBarco(Barco barco) {
        barcosAtracados.add(barco);
        System.out.println("Barco " + barco.getNome() + " atracado no " + nome);
    }

    public void desatracarBarco(Barco barco) {
        barcosAtracados.remove(barco);
        System.out.println("Barco " + barco.getNome() + " desatracado do " + nome);
    }

    public void listarBarcos() {
        System.out.println("Barcos atracados no " + nome + ":");
        for (Barco barco : barcosAtracados) {
            System.out.println(barco);
        }
    }
}
