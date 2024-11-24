package com.faculdade.ucsal.service;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record dadosProf(
        @NotBlank
        String nome,
        @NotBlank
                @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        String especializacao,
        @NotBlank
        @Pattern(regexp = "\\d{11}")
                String cpf,
        @NotBlank
        String salario) {


}
