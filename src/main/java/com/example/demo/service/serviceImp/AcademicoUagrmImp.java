package com.example.demo.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CantidadEgresadosFacultad;
import com.example.demo.model.CantidadTituladosFacultad;
import com.example.demo.model.ComparacionIngresosTituladosFacultad;
import com.example.demo.model.DesercionFacultad;
import com.example.demo.model.EstudiantesInscritosLocalidad;
import com.example.demo.model.EstudiantesInscritosModalidad;
import com.example.demo.model.PromedioPonderadoSemestralFacultad;
import com.example.demo.model.PromedioPonderadoSemestralPeriodo;
import com.example.demo.model.PromedioPonderadoSemestralSinCeroFacultad;
import com.example.demo.model.RendimientoAcademicoFacultad;
import com.example.demo.repository.ComparacionIngresosTituladosFacultadRepository;
import com.example.demo.repository.EstudiantesEgresadosFacultadRepository;
import com.example.demo.repository.EstudiantesTituladosFacultadRepository;
import com.example.demo.repository.InscritosLocalidadRepository;
import com.example.demo.repository.InscritosModalidadRepository;
import com.example.demo.repository.PorcentajeDesercionFacultadRepository;
import com.example.demo.repository.PromedioPonderadoSemestralFacultadRepository;
import com.example.demo.repository.PromedioPonderadoSemestralPeriodoRepository;
import com.example.demo.repository.PromedioPonderadoSemestralSinCeroFacultadRepository;
import com.example.demo.repository.RendimientoAcademicoFacultadRepository;
import com.example.demo.service.serviceApi.AcademicoUagrmApi;

@Service
public class AcademicoUagrmImp implements AcademicoUagrmApi {

    @Autowired
    InscritosLocalidadRepository repoUno;
    @Autowired
    InscritosModalidadRepository repoSiete;
    @Autowired
    EstudiantesTituladosFacultadRepository repoNueve;
    @Autowired
    EstudiantesEgresadosFacultadRepository repoOnce;
    @Autowired
    ComparacionIngresosTituladosFacultadRepository repoTrece;
    @Autowired
    PorcentajeDesercionFacultadRepository repoQince;
    @Autowired
    RendimientoAcademicoFacultadRepository repoDiecisiete;
    @Autowired
    PromedioPonderadoSemestralFacultadRepository repoDiecinueve;
    @Autowired
    PromedioPonderadoSemestralPeriodoRepository repoVeintiUno;
    @Autowired
    PromedioPonderadoSemestralSinCeroFacultadRepository repoVeintiTres;

    @Override
    public List<EstudiantesInscritosLocalidad> mostrarEstudiantesInscritosLocalidad(String periodo) {
        return (List<EstudiantesInscritosLocalidad>) repoUno.estudiantesInscritosLocalidad(periodo);
    }

    @Override
    public List<EstudiantesInscritosModalidad> mostrarInscritosModalidad(String periodo) {
        return (List<EstudiantesInscritosModalidad>) repoSiete.inscritosModalidad(periodo);
    }

    @Override
    public List<CantidadTituladosFacultad> mostrarTituladosFacultad(String periodo) {
        return (List<CantidadTituladosFacultad>) repoNueve.tituladosFacultad(periodo);
    }

    @Override
    public List<CantidadEgresadosFacultad> mostrarEgresadosFacultad(String periodo) {
        return (List<CantidadEgresadosFacultad>) repoOnce.egresadosFacultad(periodo);
    }

    @Override
    public List<ComparacionIngresosTituladosFacultad> mostrarComparacionIngresosTituladosFacultad(String periodo) {
        return (List<ComparacionIngresosTituladosFacultad>) repoTrece.comparacionIngresosTituladosFacultad(periodo);
    }

    @Override
    public List<DesercionFacultad> mostrarPorcentajeDesercionFacultad(String periodo) {
        return (List<DesercionFacultad>) repoQince.desercionFacultad(periodo);
    }
    @Override
    public List<RendimientoAcademicoFacultad> mostrarRendimientoAcademicoFacultad(String periodo) {
        return (List<RendimientoAcademicoFacultad>) repoDiecisiete.rendimientoAcademicoFacultad(periodo);
    }

    @Override
    public List<PromedioPonderadoSemestralFacultad> mostrarPromedioPonderadoSemestralFacultad(String periodo) {
        return (List<PromedioPonderadoSemestralFacultad>) repoDiecinueve.promedioPonderadoSemestralFacultad(periodo);
    }

    @Override
    public List<PromedioPonderadoSemestralPeriodo> mostrarPromedioPonderadoSemestralPeriodo(String periodo) {
        return (List<PromedioPonderadoSemestralPeriodo>) repoVeintiUno.promedioPonderadoSemestralPeriodo(periodo);
    }

    @Override
    public List<PromedioPonderadoSemestralSinCeroFacultad> mostrarPromedioPonderadoSemestralSinCeroFacultad(String periodo) {
        return (List<PromedioPonderadoSemestralSinCeroFacultad>) repoVeintiTres.promedioPonderadoSemestralSinCeroFacultad(periodo);
    }

}

