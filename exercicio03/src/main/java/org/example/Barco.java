package org.example;

public class Barco {
    private String nome;
    private String tamanho;

    public Barco(String nomeConstrutor, String tamanhoConstrutor) {
        System.out.println("Construtor iniciado");
        this.nome = nomeConstrutor;
        this.tamanho= tamanhoConstrutor;
    }
}
