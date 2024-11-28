package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class DesercionFacultad {
    
    @Id
    private Integer id;
    private String facultad;
    private Integer periodouno;
    private Integer periododos;

    public DesercionFacultad() {
        
    }  
}
