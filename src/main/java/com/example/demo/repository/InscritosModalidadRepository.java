package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EstudiantesInscritosModalidad;

import jakarta.transaction.Transactional;

@Repository
public interface InscritosModalidadRepository extends CrudRepository<EstudiantesInscritosModalidad, String> {
    @Transactional
    @Query(value = "select * from EstudiantesInscritosPorModalidad(:periodo)", nativeQuery = true)
    public List<EstudiantesInscritosModalidad> inscritosModalidad(@Param("periodo") String periodo);

}
