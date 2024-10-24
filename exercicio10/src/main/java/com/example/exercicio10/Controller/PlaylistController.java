package com.example.exercicio10.controller;

import com.example.exercicio10.model.Artista;
import com.example.exercicio10.model.Playlist;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    private Map<Integer, Playlist> playlists = new HashMap<>();
    private Map<Integer, Artista> artistas = new HashMap<>();
    private int currentId = 1;

    @GetMapping("/{id}")
    public ResponseEntity<Playlist> getPlaylist(@PathVariable int id) {
        Playlist playlist = playlists.get(id);
        if (playlist == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(playlist);
    }
    @GetMapping
    public ResponseEntity<Map<Integer, Playlist>> getAllPlaylists() {
        return ResponseEntity.ok(playlists);
    }
    @PostMapping
    public ResponseEntity<Playlist> criarPlaylist(@RequestBody Playlist novaPlaylist) {
        if (novaPlaylist.getNome() == null || novaPlaylist.getNome().isEmpty()) {
            return ResponseEntity.badRequest().body(null);
        }
        adicionarArtistasPorGenero(novaPlaylist);

        novaPlaylist.setId(currentId++);
        playlists.put(novaPlaylist.getId(), novaPlaylist);
        return ResponseEntity.status(201).body(novaPlaylist);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Playlist> atualizarPlaylist(@PathVariable int id, @RequestBody Playlist playlistAtualizada) {
        Playlist playlistExistente = playlists.get(id);
        if (playlistExistente == null) {
            return ResponseEntity.notFound().build();
        }
        adicionarArtistasPorGenero(playlistAtualizada);
        playlistAtualizada.setId(id);
        playlists.put(id, playlistAtualizada);
        return ResponseEntity.ok(playlistAtualizada);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPlaylist(@PathVariable int id) {
        if (!playlists.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        playlists.remove(id);
        return ResponseEntity.ok().build();
    }
    @PostMapping("/{id}/musicas")
    public ResponseEntity<Playlist> adicionarMusicaAPlaylist(@PathVariable int id, @RequestBody String novaMusica) {
        System.out.println("Recebendo requisição para adicionar música: " + novaMusica);

        Playlist playlist = playlists.get(id);
        if (playlist == null) {
            System.out.println("Playlist não encontrada com ID: " + id);
            return ResponseEntity.notFound().build();
        }
        String musicaParaAdicionar = novaMusica.replace("\"", "").trim();

        if (playlist.getMusicas() == null) {
            playlist.setMusicas(new ArrayList<>());
        }
        playlist.getMusicas().add(musicaParaAdicionar);
        return ResponseEntity.ok(playlist);
    }
    private void adicionarArtistasPorGenero(Playlist playlist) {
        List<Artista> artistasCorrespondentes = artistas.values().stream()
                .filter(artista -> artista.getGeneros() != null && !playlist.getGeneros().isEmpty() &&
                        artista.getGeneros().stream().anyMatch(playlist.getGeneros()::contains))
                .collect(Collectors.toList());

        playlist.setArtistas(artistasCorrespondentes);
    }
}
