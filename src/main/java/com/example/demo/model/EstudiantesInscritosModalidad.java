package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class EstudiantesInscritosModalidad {

    @Id
    private Integer id;
    private String modalidad;
    private float inscritos;

    public EstudiantesInscritosModalidad() {

    }
}
