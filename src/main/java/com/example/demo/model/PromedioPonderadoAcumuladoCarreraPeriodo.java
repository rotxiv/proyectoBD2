package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class PromedioPonderadoAcumuladoCarreraPeriodo {

    @Id
    private Integer id;
    private String periodo;
    private float promedio;

    public PromedioPonderadoAcumuladoCarreraPeriodo() {
        
    }

    public PromedioPonderadoAcumuladoCarreraPeriodo(Integer id, String periodo, float promedio) {
        this.id = id;
        this.periodo = periodo;
        this.promedio = promedio;
    }

}
