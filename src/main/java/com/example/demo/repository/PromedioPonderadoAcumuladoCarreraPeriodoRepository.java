package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PromedioPonderadoAcumuladoCarreraPeriodo;

import jakarta.transaction.Transactional;

@Repository
public interface PromedioPonderadoAcumuladoCarreraPeriodoRepository extends JpaRepository<PromedioPonderadoAcumuladoCarreraPeriodo, Long> {

    @Transactional
    @Query(value = "select * from PromedioPonderadoAcumuladoDeLaCarreraPorPeriodo()", nativeQuery = true)
    List<PromedioPonderadoAcumuladoCarreraPeriodo> promedioPonderadoAcumuladoPeriodo();

}
