package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class PorcentajeDesercionPeriodo {

    @Id
    private Integer id;
    private String periodo;
    private float porcentaje;

    public PorcentajeDesercionPeriodo() {

    }

    public PorcentajeDesercionPeriodo(Integer id, String periodo, float porcentaje) {
        this.id = id;
        this.periodo = periodo;
        this.porcentaje = porcentaje;
    }

    
}
