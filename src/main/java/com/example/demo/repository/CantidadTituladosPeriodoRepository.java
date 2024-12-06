package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CantidadTituladosPeriodo;

import jakarta.transaction.Transactional;

@Repository
public interface CantidadTituladosPeriodoRepository extends CrudRepository<CantidadTituladosPeriodo, String> {

    @Transactional
    @Query(value = "select * from CantidadDeEstudiantesTituladosPorPeriodo", nativeQuery = true)
    public List<CantidadTituladosPeriodo> cantidadTiTuladosPeriodo();    

}
