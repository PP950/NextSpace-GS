package com.nextspace.dto;

import com.nextspace.entity.TipoSensor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SensorDTO(

        @NotNull(message = "O tipo do sensor é obrigatório")
        TipoSensor tipo,

        @NotBlank(message = "O valor captado é obrigatório")
        String valorCaptado,

        @NotBlank(message = "A descrição da leitura é obrigatória")
        String descricaoLeitura,

        @NotNull(message = "O status ativo é obrigatório")
        Boolean ativo,

        @NotNull(message = "O ID do satélite é obrigatório")
        Long sateliteId

) {
}