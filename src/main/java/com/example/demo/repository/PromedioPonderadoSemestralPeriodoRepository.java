package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PromedioPonderadoSemestralPeriodo;

import jakarta.transaction.Transactional;

@Repository
public interface PromedioPonderadoSemestralPeriodoRepository extends CrudRepository<PromedioPonderadoSemestralPeriodo, String> {
    
    @Transactional
    @Query(value = "select * from PromedioPonderadoSemestralPorPeriodo()", nativeQuery = true)
    public List<PromedioPonderadoSemestralPeriodo> promedioPonderadoSemestralPeriodo();    

}
