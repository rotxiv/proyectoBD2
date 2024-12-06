package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PromedioPonderadoSemestralFacultad;

import jakarta.transaction.Transactional;

@Repository
public interface PromedioPonderadoSemestralFacultadRepository extends CrudRepository<PromedioPonderadoSemestralFacultad, String> {
    
    @Transactional
    @Query(value = "select * from PromedioPonderadoSemestralPorFacultad(:periodo)", nativeQuery = true)
    public List<PromedioPonderadoSemestralFacultad> promedioPonderadoSemestralFacultad(@Param("periodo") String periodo);    

}
