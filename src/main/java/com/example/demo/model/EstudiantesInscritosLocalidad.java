package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class EstudiantesInscritosLocalidad {

    @Id
    private Integer id;
    private String localidad;
    private float inscritos;

    public EstudiantesInscritosLocalidad() {

    }
    
    public EstudiantesInscritosLocalidad(Integer id, String localidad, float inscritos) {
        this.id = id;
        this.localidad = localidad;
        this.inscritos = inscritos;
        
    }

}
