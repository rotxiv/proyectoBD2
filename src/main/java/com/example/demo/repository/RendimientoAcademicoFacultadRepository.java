package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.RendimientoAcademicoFacultad;

import jakarta.transaction.Transactional;

@Repository
public interface RendimientoAcademicoFacultadRepository extends CrudRepository<RendimientoAcademicoFacultad,String> {
    @Transactional
    @Query(value = "select * from RendimientoAcademicoPorFacultad(:periodo)", nativeQuery = true)
    public List<RendimientoAcademicoFacultad> rendimientoAcademicoFacultad(@Param("periodo") String periodo);    

}
