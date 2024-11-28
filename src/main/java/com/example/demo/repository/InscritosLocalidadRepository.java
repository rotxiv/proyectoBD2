package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EstudiantesInscritosLocalidad;

import jakarta.transaction.Transactional;

@Repository
public interface InscritosLocalidadRepository extends 
    CrudRepository<EstudiantesInscritosLocalidad, String> {

    @Transactional
    @Query(value = "select * from EstudiantesInscritosPorLocalidad(:periodo)", nativeQuery = true)
    public List<EstudiantesInscritosLocalidad> estudiantesInscritosLocalidad(@Param("periodo") String periodo);

}