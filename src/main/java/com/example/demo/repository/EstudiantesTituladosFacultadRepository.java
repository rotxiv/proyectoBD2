package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CantidadTituladosFacultad;

import jakarta.transaction.Transactional;

@Repository
public interface EstudiantesTituladosFacultadRepository extends CrudRepository<CantidadTituladosFacultad, String> {
    @Transactional
    @Query(value = "select * from CantidadDeEstudiantesTituladosPorFacultad(:periodo)", nativeQuery = true)
    public List<CantidadTituladosFacultad> tituladosFacultad(@Param("periodo") String periodo);    

}
