package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class RendimientoAcademicoPeriodo {

    @Id
    private Integer id;
    private String periodo;
    private Integer sinnota;
    private Integer aprobados;

    public RendimientoAcademicoPeriodo() {

    }

    public RendimientoAcademicoPeriodo(Integer id, String periodo, Integer sinnota, Integer aprobados) {
        this.id = id;
        this.periodo = periodo;
        this.sinnota = sinnota;
        this.aprobados = aprobados;
    }

    
    
    
}
