package com.example.exercicio12.controllers;

import com.example.exercicio12.dtos.TransacaoRequestDTO;
import com.example.exercicio12.dtos.TransacaoResponseDTO;
import com.example.exercicio12.mappers.ContaMapper;
import com.example.exercicio12.models.Conta;
import com.example.exercicio12.models.Transacao;
import com.example.exercicio12.services.TransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacoesService transacoesService;

    @Autowired
    private ContaMapper contaMapper;

    @PostMapping
    public TransacaoResponseDTO gerarTransacao(@RequestBody TransacaoRequestDTO requestDTO) {
        Conta origem = transacoesService.buscarContaPorCodigo(requestDTO.getOrigem());
        Conta destino = transacoesService.buscarContaPorCodigo(requestDTO.getDestino());

        if (origem == null || destino == null) {
            throw new RuntimeException("Conta de origem ou destino não encontrada.");
        }

        Transacao transacao = new Transacao(origem, destino, requestDTO.getValor());

        return new TransacaoResponseDTO(
                contaMapper.toDTO(transacao.getOrigem()),
                contaMapper.toDTO(transacao.getDestino()),
                transacao.getValor()
        );
    }
}

