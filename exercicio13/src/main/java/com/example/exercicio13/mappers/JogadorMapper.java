package com.example.exercicio13.mappers;

import com.example.exercicio13.dtos.JogadorDTO;
import com.example.exercicio13.models.Jogador;
import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {

    public Jogador toEntity(JogadorDTO dto) {
        Jogador jogador = new Jogador();
        jogador.setNome(dto.getNome());
        jogador.setIdade(dto.getIdade());
        return jogador;
    }

    public JogadorDTO toDTO(Jogador jogador) {
        JogadorDTO dto = new JogadorDTO();
        dto.setNome(jogador.getNome());
        dto.setIdade(jogador.getIdade());
        return dto;
    }
}
