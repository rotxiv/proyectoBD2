package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class CantidadTituladosFacultad {

    @Id
    private Integer id;
    private String localidad;
    private float inscritos;

    public CantidadTituladosFacultad() {

    }
}
