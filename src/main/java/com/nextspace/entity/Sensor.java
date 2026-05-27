package com.nextspace.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoSensor tipo;

    private String valorCaptado;

    private String descricaoLeitura;

    private Boolean ativo;

    @ManyToOne
    @JoinColumn(name = "satelite_id")
    private Satelite satelite;
}