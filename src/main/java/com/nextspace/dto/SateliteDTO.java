package com.nextspace.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record SateliteDTO(

        @NotBlank(message = "O nome é obrigatório")
        String nome,

        @NotBlank(message = "O fabricante é obrigatório")
        String fabricante,

        @NotNull(message = "A data de lançamento é obrigatória")
        LocalDate dataLancamento,

        @NotBlank(message = "A órbita é obrigatória")
        String orbita,

        @NotBlank(message = "A versão do software é obrigatória")
        String versaoSoftware,

        @NotNull(message = "O status ativo é obrigatório")
        Boolean ativo

) {
}