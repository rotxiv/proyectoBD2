package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PromedioPonderadoAcumuladoSinCeroCarreraPeriodo;

import jakarta.transaction.Transactional;

@Repository
public interface PromedioPonderadoAcumuladoSinCeroCarreraPeriodoRepository extends JpaRepository<PromedioPonderadoAcumuladoSinCeroCarreraPeriodo, Long> {

    @Transactional
    @Query(value = "select * from PromedioPonderadoAcumuladoSinCeroCarreraPorPeriodo()", nativeQuery = true)
    List<PromedioPonderadoAcumuladoSinCeroCarreraPeriodo> promedioPonderadoSinCeroCarreaPeriodo();

}
