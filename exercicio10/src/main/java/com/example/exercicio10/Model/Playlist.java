package com.example.exercicio10.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private int id;
    private String nome;
    private List<String> generos;
    private List<Artista> artistas;
    private List<String> musicas;

    public Playlist() {
        this.generos = new ArrayList<>();
        this.artistas = new ArrayList<>();
        this.musicas = new ArrayList<>();
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
    public List<Artista> getArtistas() {
        return artistas;
    }
    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    public List<String> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<String> musicas) {
        this.musicas = musicas;
    }
}
