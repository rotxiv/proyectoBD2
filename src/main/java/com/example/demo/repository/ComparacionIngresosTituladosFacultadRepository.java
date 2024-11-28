package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ComparacionIngresosTituladosFacultad;

import jakarta.transaction.Transactional;

@Repository
public interface ComparacionIngresosTituladosFacultadRepository extends CrudRepository<ComparacionIngresosTituladosFacultad,String> {
    @Transactional
    @Query(value = "select * from ComparacionDeIngresosVsTituladosPorFacultad(:periodo)", nativeQuery = true)
    public List<ComparacionIngresosTituladosFacultad> comparacionIngresosTituladosFacultad(@Param("periodo") String periodo);    

}
