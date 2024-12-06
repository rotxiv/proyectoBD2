package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.RendimientoAcademicoPeriodo;

import jakarta.transaction.Transactional;

@Repository
public interface RendimientoAcademicoPeriodoRepository extends JpaRepository<RendimientoAcademicoPeriodo, Long> {

    @Transactional
    @Query(value = "select * from RendimientoAcademicoPorPeriodo()", nativeQuery = true)
    List<RendimientoAcademicoPeriodo> rendimientoAcademicoPeriodo();

}
