package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class PromedioPonderadoAcumuladoCarreraFacultad {

    @Id
    private Integer id;
    private String facultad;
    private float promedio;

    public PromedioPonderadoAcumuladoCarreraFacultad() {
        
    }

    public PromedioPonderadoAcumuladoCarreraFacultad(Integer id, String facultad, float promedio) {
        this.id = id;
        this.facultad = facultad;
        this.promedio = promedio;
    }

}
