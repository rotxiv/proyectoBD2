package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CantidadEgresadosPeriodo;

import jakarta.transaction.Transactional;

@Repository
public interface CantidadEgresadosPeriodoRepository extends JpaRepository<CantidadEgresadosPeriodo, Long> {

    @Transactional
    @Query(value = "select * from CantidadDeEstudiantesEgresadosPorPeriodo(:modalidad, :facultad, :carrera, :localidad)", nativeQuery = true)
    List<CantidadEgresadosPeriodo> cantidadEgresadosPeriodo(@Param("modalidad") String modalidad, 
                                                            @Param("facultad") String facultad, 
                                                            @Param("carrera") String carrera,
                                                            @Param("localidad") String localidad);

}
