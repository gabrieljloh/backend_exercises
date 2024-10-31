package com.example.exercicio12.services;

import com.example.exercicio12.models.Conta;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransacoesService {
    private List<Conta> contas = new ArrayList<>();

    public TransacoesService() {
        contas.add(new Conta("500-1", "Fulano"));
        contas.add(new Conta("320-2", "Ciclano"));
    }

    public Conta buscarContaPorCodigo(String codigo) {
        return contas.stream()
                .filter(conta -> conta.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }
}

