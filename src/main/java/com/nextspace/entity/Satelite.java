package com.nextspace.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Satelite extends EquipamentoEspacial {

    private String orbita;

    private String versaoSoftware;

    private Boolean ativo;

    @Override
    public String gerarStatus() {
        return "Satélite operando na órbita " + orbita;
    }

    @OneToMany(mappedBy = "satelite")
    @JsonIgnore
    private List<Sensor> sensores;
}