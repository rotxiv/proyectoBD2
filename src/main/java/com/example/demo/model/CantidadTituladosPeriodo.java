package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class CantidadTituladosPeriodo {

    @Id
    private Integer id;
    private String periodo;
    private float titulados;

    public CantidadTituladosPeriodo() {

    }

    public CantidadTituladosPeriodo(Integer id, String periodo, float titulados) {
        this.id = id;
        this.periodo = periodo;
        this.titulados = titulados;
    }

}
