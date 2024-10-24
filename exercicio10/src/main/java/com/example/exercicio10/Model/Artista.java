package com.example.exercicio10.model;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    private int id;
    private String nome;
    private List<String> generos;
    private String descricao;
    private List<String> musicas;

    public Artista() {
        this.musicas = new ArrayList<>();
        this.generos = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<String> getGeneros() {
        return generos;
    }
    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<String> getMusicas() {
        return musicas;
    }
    public void setMusicas(List<String> musicas) {
        this.musicas = musicas;
    }
    public void adicionarMusica(String musica) {
        if (musica != null && !musica.isEmpty()) {
            musicas.add(musica);
        } else {
            throw new IllegalArgumentException("A música não pode ser vazia");
        }
    }
    public void removerMusica(String musica) {
        musicas.remove(musica);
    }
    @Override
    public String toString() {
        return "Artista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", generos=" + generos +
                ", descricao='" + descricao + '\'' +
                ", musicas=" + musicas +
                '}';
    }
}
