package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ComparacionIngresosTituladosPeriodo;

import jakarta.transaction.Transactional;

@Repository
public interface ComparacionIngresosTituladosPeriodoRepository extends JpaRepository<ComparacionIngresosTituladosPeriodo, Long> {

    @Transactional
    @Query(value = "select * from ComparacionDeIngresosTituladosPorPeriodo(:modalidad, :facultad, :carrera, : localidad)", nativeQuery = true)
    public List<ComparacionIngresosTituladosPeriodo> comparacionIngresosTituladosPeriodo(@Param("modalidad")String modalidad, 
                                                                                         @Param("facultad")String facultad, 
                                                                                         @Param("carrera")String carrera, 
                                                                                         @Param("localidad") String localidad);

}
