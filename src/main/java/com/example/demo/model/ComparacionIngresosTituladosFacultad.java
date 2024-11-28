package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ComparacionIngresosTituladosFacultad {

    @Id
    private Integer id;
    private String facultad;
    private Integer nuevos;
    private Integer titulados;

    public ComparacionIngresosTituladosFacultad() {
        
    }

    public ComparacionIngresosTituladosFacultad(Integer id, String facultad, Integer nuevos, Integer titulados) {
        this.id = id;
        this.facultad = facultad;
        this.nuevos = nuevos;
        this.titulados = titulados;
    }

}
