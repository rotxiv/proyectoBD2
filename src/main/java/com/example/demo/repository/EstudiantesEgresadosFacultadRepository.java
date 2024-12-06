package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CantidadEgresadosFacultad;

import jakarta.transaction.Transactional;

@Repository
public interface EstudiantesEgresadosFacultadRepository extends CrudRepository<CantidadEgresadosFacultad, String> {
    @Transactional
    @Query(value = "select * from CantidadDeEstudiantesEgresadosPorFacultad(:periodo)", nativeQuery = true)
    public List<CantidadEgresadosFacultad> egresadosFacultad(@Param("periodo") String periodo);    

}
