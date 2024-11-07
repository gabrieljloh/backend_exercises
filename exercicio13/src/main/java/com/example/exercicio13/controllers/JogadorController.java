package com.example.exercicio13.controllers;

import com.example.exercicio13.dtos.JogadorDTO;
import com.example.exercicio13.services.JogadorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    private final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @PostMapping
    public ResponseEntity<JogadorDTO> criarJogador(@RequestBody @Valid JogadorDTO jogadorDTO) {
        JogadorDTO jogadorSalvo = jogadorService.salvar(jogadorDTO);
        return ResponseEntity.ok(jogadorSalvo);
    }

    @GetMapping
    public ResponseEntity<List<JogadorDTO>> listarJogadores() {
        return ResponseEntity.ok(jogadorService.listarTodos());
    }
}
