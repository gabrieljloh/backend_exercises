package com.example.exercicio10.controller;
import com.example.exercicio10.model.Artista;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    private Map<Integer, Artista> artistas = new HashMap<>();
    private int currentId = 1;

    @GetMapping("/{id}")
    public ResponseEntity<Artista> getArtista(@PathVariable int id) {
        Artista artista = artistas.get(id);
        if (artista == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(artista);
    }
    @PostMapping
    public ResponseEntity<Artista> criarArtista(@RequestBody Artista novoArtista) {
        novoArtista.setId(currentId++);
        artistas.put(novoArtista.getId(), novoArtista);
        return ResponseEntity.status(201).body(novoArtista);
    }
    @PostMapping("/{id}/musicas")
    public ResponseEntity<Artista> adicionarMusicaAArtista(@PathVariable int id, @RequestBody String novaMusica) {
        Artista artista = artistas.get(id);
        if (artista == null) {
            return ResponseEntity.notFound().build();
        }
        artista.adicionarMusica(novaMusica);
        return ResponseEntity.ok(artista);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Artista> atualizarArtista(@PathVariable int id, @RequestBody Artista artistaAtualizado) {
        Artista artistaExistente = artistas.get(id);
        if (artistaExistente == null) {
            return ResponseEntity.notFound().build();
        }
        artistaAtualizado.setId(id);
        artistas.put(id, artistaAtualizado);
        return ResponseEntity.ok(artistaAtualizado);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarArtista(@PathVariable int id) {
        if (!artistas.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        artistas.remove(id);
        return ResponseEntity.ok().build();
    }
}
