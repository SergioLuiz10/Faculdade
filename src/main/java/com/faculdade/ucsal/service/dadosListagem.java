package com.faculdade.ucsal.service;

import com.faculdade.ucsal.entity.professor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record dadosListagem(@NotBlank
                            String nome,
                            @NotBlank
                            @Email
                            String email,
                            @NotBlank
                            @Pattern(regexp = "\\d{11}")
                            String cpf,
                            @NotBlank
                            String especializacao) {
    public dadosListagem(professor professor) {
        this(professor.getNome(),professor.getEmail(),professor.getCpf(), professor.getEspecializacao());
    }
}
