package org.example;

public class Barco {
    private String nome;
    private Integer tamanho;

    public Barco(String nomeConstrutor, Integer tamanhoConstrutor) {
        System.out.println("Construtor iniciado");
        this.nome = nomeConstrutor;
        this.tamanho= tamanhoConstrutor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTamanho() {
        return tamanho;
    }

}
