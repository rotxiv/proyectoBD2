package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EstudiantesInscritosCarrera;

import jakarta.transaction.Transactional;

@Repository
public interface InscritosCarreraRepository extends JpaRepository<EstudiantesInscritosCarrera, Long> {

    @Transactional
    @Query(value = "select * from EstudiantesInscritosPorCarrera(:periodo, :localidad, :facultad)", nativeQuery = true)
    public List<EstudiantesInscritosCarrera> inscritosCarrera(@Param("periodo") String periodo,
                                                              @Param("localidad") String localidad,
                                                              @Param("facultad") String facultad);

    @Transactional
    @Query(value = "select * from EstudiantesInscritosPorCarreraModalidad(:modalidad, :facultad, : periodo, :localidad)", nativeQuery = true)
    public List<EstudiantesInscritosCarrera> inscritosCarreraModalidad(@Param("modalidad") String modalidad,
                                                                       @Param("facultad") String facultad,
                                                                       @Param("periodo") String periodo,
                                                                       @Param("localidad") String localidad);
                                                              
}
