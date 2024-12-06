package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EstudiantesInscritosFacultad;

import jakarta.transaction.Transactional;

@Repository
public interface InscritosFacultadRepository extends CrudRepository<EstudiantesInscritosFacultad, String> {

    @Transactional
    @Query(value = "select * from EstudiantesInscritosPorFacultad(:periodo)", nativeQuery = true)
    public List<EstudiantesInscritosFacultad> estudiantesInscritosFacultad(@Param("periodo") String periodo);
}
