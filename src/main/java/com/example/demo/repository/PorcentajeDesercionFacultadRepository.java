package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DesercionFacultad;

import jakarta.transaction.Transactional;

@Repository
public interface PorcentajeDesercionFacultadRepository extends CrudRepository<DesercionFacultad, String> {
    @Transactional
    @Query(value = "select * from PorcentajeDeDesercionPorFacultad(:periodo)", nativeQuery = true)
    public List<DesercionFacultad> desercionFacultad(@Param("periodo") String periodo);

}
