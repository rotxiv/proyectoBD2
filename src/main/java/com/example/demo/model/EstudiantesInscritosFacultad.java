package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class EstudiantesInscritosFacultad {

    @Id
    private Integer id;
    private String facultad;
    private float inscritos;

    public EstudiantesInscritosFacultad() {

    }
    
    public EstudiantesInscritosFacultad(Integer id, String facultad, float inscritos) {
        this.id = id;
        this.facultad = facultad;
        this.inscritos = inscritos;
    }
    
}
