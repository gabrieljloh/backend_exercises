package com.example.exercicio12.mappers;

import com.example.exercicio12.dtos.ContaDTO;
import com.example.exercicio12.models.Conta;
import org.springframework.stereotype.Component;

@Component
public class ContaMapper {

    public ContaDTO toDTO(Conta conta) {
        ContaDTO dto = new ContaDTO();
        dto.setCodigo(conta.getCodigo());
        dto.setCliente(conta.getCliente());
        return dto;
    }
}

