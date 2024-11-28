package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class RendimientoAcademicoFacultad {

    @Id
    private Integer id;
    private String facultad;
    private float sinnota;
    private float aprobados;
    private float reprobados;
    private float mora;

    public RendimientoAcademicoFacultad() {
        
    }
}
