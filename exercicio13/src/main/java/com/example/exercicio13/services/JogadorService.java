package com.example.exercicio13.services;

import com.example.exercicio13.dtos.JogadorDTO;
import com.example.exercicio13.mappers.JogadorMapper;
import com.example.exercicio13.models.Jogador;
import com.example.exercicio13.repositories.JogadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogadorService {
    private final JogadorRepository jogadorRepository;
    private final JogadorMapper jogadorMapper;

    public JogadorService(JogadorRepository jogadorRepository, JogadorMapper jogadorMapper) {
        this.jogadorRepository = jogadorRepository;
        this.jogadorMapper = jogadorMapper;
    }

    public JogadorDTO salvar(JogadorDTO jogadorDTO) {
        Jogador jogador = jogadorMapper.toEntity(jogadorDTO);
        return jogadorMapper.toDTO(jogadorRepository.save(jogador));
    }

    public List<JogadorDTO> listarTodos() {
        return jogadorRepository.findAll().stream()
                .map(jogadorMapper::toDTO)
                .collect(Collectors.toList());
    }
}
