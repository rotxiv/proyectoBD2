package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class PromedioPonderadoSemestralPeriodo {

    @Id
    private Integer id;
    private String facultad;
    private float promedio;

    public PromedioPonderadoSemestralPeriodo() {
        
    }
}
