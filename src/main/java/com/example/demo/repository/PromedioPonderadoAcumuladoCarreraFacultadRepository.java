package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PromedioPonderadoAcumuladoCarreraFacultad;

import jakarta.transaction.Transactional;

@Repository
public interface PromedioPonderadoAcumuladoCarreraFacultadRepository extends JpaRepository<PromedioPonderadoAcumuladoCarreraFacultad, Long> {

    @Transactional
    @Query(value = "select * from PromedioPonderadoAcumuladoCarreraPorFacultad(:periodo)", nativeQuery = true)
    List<PromedioPonderadoAcumuladoCarreraFacultad> promedioPonderadoAcumuladoFacultad(@Param("periodo") String periodo);

}
