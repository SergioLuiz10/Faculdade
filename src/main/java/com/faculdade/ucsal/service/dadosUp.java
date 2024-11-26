package com.faculdade.ucsal.service;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record dadosUp(

       @NotNull
       Long id,
        @NotBlank
        String nome,
        @NotBlank
                @NotNull
        String email,
         @NotBlank
        String telefone) {
}
