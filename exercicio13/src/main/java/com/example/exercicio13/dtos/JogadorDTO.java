package com.example.exercicio13.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class JogadorDTO {
    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @Min(value = 18, message = "Idade mínima é 18")
    private int idade;
}
