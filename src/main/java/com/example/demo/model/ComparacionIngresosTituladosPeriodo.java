package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ComparacionIngresosTituladosPeriodo {

    @Id
    private Integer id;
    private String periodo;
    private float nuevos;
    private float titulados;

    public ComparacionIngresosTituladosPeriodo() {

    }
    
    public ComparacionIngresosTituladosPeriodo(Integer id, String periodo, float nuevos, float titulados) {
        this.id = id;
        this.periodo = periodo;
        this.nuevos = nuevos;
        this.titulados = titulados;
    }
    
}
