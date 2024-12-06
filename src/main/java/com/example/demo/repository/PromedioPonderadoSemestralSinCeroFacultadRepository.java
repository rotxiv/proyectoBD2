package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PromedioPonderadoSemestralSinCeroFacultad;

import jakarta.transaction.Transactional;

@Repository
public interface PromedioPonderadoSemestralSinCeroFacultadRepository extends CrudRepository<PromedioPonderadoSemestralSinCeroFacultad, String> {
    
    @Transactional
    @Query(value = "select * from PromedioPonderadoSemestralSinCeroPorFacultad(:periodo)", nativeQuery = true)
    public List<PromedioPonderadoSemestralSinCeroFacultad> promedioPonderadoSemestralSinCeroFacultad(@Param("periodo") String periodo);    

}
