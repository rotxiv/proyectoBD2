package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class CantidadEgresadosPeriodo {

    @Id
    private Integer id;
    private String periodo;
    private float egresados;

    public CantidadEgresadosPeriodo() {

    }

    public CantidadEgresadosPeriodo(Integer id, String periodo, float egresados) {
        this.id = id;
        this.periodo = periodo;
        this.egresados = egresados;
    }
 
}
