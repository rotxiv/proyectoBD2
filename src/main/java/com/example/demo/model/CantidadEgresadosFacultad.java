package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class CantidadEgresadosFacultad {

    @Id
    private Integer id;
    private String facultad;
    private float egresados;

    public CantidadEgresadosFacultad() {

    }

    public CantidadEgresadosFacultad(Integer id, String facultad, float egresados) {
        this.id = id;
        this.facultad = facultad;
        this.egresados = egresados;
    }
    
}
