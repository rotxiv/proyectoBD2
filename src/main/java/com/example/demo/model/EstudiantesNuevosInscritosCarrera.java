package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class EstudiantesNuevosInscritosCarrera {

    @Id
    private Integer id;
    private String carrera;
    private float inscritos;

    public EstudiantesNuevosInscritosCarrera() {

    }

    public EstudiantesNuevosInscritosCarrera(Integer id, String carrera, float inscritos) {
        this.id = id;
        this.carrera = carrera;
        this.inscritos = inscritos;
    }

}
