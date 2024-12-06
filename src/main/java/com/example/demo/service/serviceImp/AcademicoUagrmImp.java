package com.example.demo.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CantidadEgresadosFacultad;
import com.example.demo.model.CantidadEgresadosPeriodo;
import com.example.demo.model.CantidadTituladosFacultad;
import com.example.demo.model.CantidadTituladosPeriodo;
import com.example.demo.model.ComparacionIngresosTituladosFacultad;
import com.example.demo.model.ComparacionIngresosTituladosPeriodo;
import com.example.demo.model.DesercionFacultad;
import com.example.demo.model.EstudiantesInscritosCarrera;
import com.example.demo.model.EstudiantesInscritosFacultad;
import com.example.demo.model.EstudiantesInscritosLocalidad;
import com.example.demo.model.EstudiantesInscritosModalidad;
import com.example.demo.model.EstudiantesNuevosInscritosCarrera;
import com.example.demo.model.PorcentajeDesercionPeriodo;
import com.example.demo.model.PromedioPonderadoAcumuladoCarreraFacultad;
import com.example.demo.model.PromedioPonderadoAcumuladoCarreraPeriodo;
import com.example.demo.model.PromedioPonderadoAcumuladoSinCeroCarreraPeriodo;
import com.example.demo.model.PromedioPonderadoSemestralFacultad;
import com.example.demo.model.PromedioPonderadoSemestralPeriodo;
import com.example.demo.model.PromedioPonderadoSemestralSinCeroFacultad;
import com.example.demo.model.RendimientoAcademicoFacultad;
import com.example.demo.model.RendimientoAcademicoPeriodo;
import com.example.demo.repository.CantidadEgresadosPeriodoRepository;
import com.example.demo.repository.CantidadTituladosPeriodoRepository;
import com.example.demo.repository.ComparacionIngresosTituladosFacultadRepository;
import com.example.demo.repository.ComparacionIngresosTituladosPeriodoRepository;
import com.example.demo.repository.EstudiantesEgresadosFacultadRepository;
import com.example.demo.repository.EstudiantesTituladosFacultadRepository;
import com.example.demo.repository.InscritosCarreraRepository;
import com.example.demo.repository.InscritosFacultadRepository;
import com.example.demo.repository.InscritosLocalidadRepository;
import com.example.demo.repository.InscritosModalidadRepository;
import com.example.demo.repository.NuevosInscritosCarrera;
import com.example.demo.repository.PorcentajeDesercionFacultadRepository;
import com.example.demo.repository.PorcentajeDesercionPeriodoRepository;
import com.example.demo.repository.PromedioPonderadoAcumuladoCarreraFacultadRepository;
import com.example.demo.repository.PromedioPonderadoAcumuladoCarreraPeriodoRepository;
import com.example.demo.repository.PromedioPonderadoAcumuladoSinCeroCarreraPeriodoRepository;
import com.example.demo.repository.PromedioPonderadoSemestralFacultadRepository;
import com.example.demo.repository.PromedioPonderadoSemestralPeriodoRepository;
import com.example.demo.repository.PromedioPonderadoSemestralSinCeroFacultadRepository;
import com.example.demo.repository.RendimientoAcademicoFacultadRepository;
import com.example.demo.repository.RendimientoAcademicoPeriodoRepository;
import com.example.demo.service.serviceApi.AcademicoUagrmApi;

@Service
public class AcademicoUagrmImp implements AcademicoUagrmApi {

    @Autowired
    InscritosLocalidadRepository repoUno;
    @Autowired
    InscritosCarreraRepository repoDos;
    @Autowired
    NuevosInscritosCarrera repoTres;
    @Autowired
    InscritosFacultadRepository repoCuatro;
    @Autowired
    InscritosModalidadRepository repoSiete;
    @Autowired
    CantidadTituladosPeriodoRepository repoOcho;
    @Autowired
    EstudiantesTituladosFacultadRepository repoNueve;
    @Autowired
    CantidadEgresadosPeriodoRepository repoDiez;
    @Autowired
    EstudiantesEgresadosFacultadRepository repoOnce;
    @Autowired
    ComparacionIngresosTituladosPeriodoRepository repoDoce;
    @Autowired
    ComparacionIngresosTituladosFacultadRepository repoTrece;
    @Autowired
    PorcentajeDesercionPeriodoRepository repoCatorce;
    @Autowired
    PorcentajeDesercionFacultadRepository repoQince;
    @Autowired
    RendimientoAcademicoPeriodoRepository repoDieciseis;
    @Autowired
    RendimientoAcademicoFacultadRepository repoDiecisiete;
    @Autowired
    PromedioPonderadoSemestralPeriodoRepository repoDieciocho;
    @Autowired
    PromedioPonderadoSemestralFacultadRepository repoDiecinueve;
    @Autowired
    PromedioPonderadoAcumuladoCarreraPeriodoRepository repoVeinte;
    @Autowired
    PromedioPonderadoAcumuladoCarreraFacultadRepository repoVeintiUno;
    @Autowired
    PromedioPonderadoAcumuladoSinCeroCarreraPeriodoRepository repoVeintiDos;
    @Autowired
    PromedioPonderadoSemestralSinCeroFacultadRepository repoVeintiTres;

    @Override
    public List<EstudiantesInscritosLocalidad> mostrarEstudiantesInscritosLocalidad(String periodo) {
        return repoUno.estudiantesInscritosLocalidad(periodo);
    }

    @Override
    public List<EstudiantesInscritosCarrera> mostrarEstudiantesInscritosCarrera(String periodo,
                                                                                String localidad,
                                                                                String facultad) {
        return repoDos.inscritosCarrera(periodo, localidad, facultad);
    }

    @Override
    public List<EstudiantesNuevosInscritosCarrera> mostrarEstudiantesNuevosInscritosCarrera(String periodo,
                                                                                            String localidad,
                                                                                            String facultad) {
        return repoTres.nuevosInscritosCarrera(periodo, localidad, facultad);
    }
    
    @Override
    public List<EstudiantesInscritosFacultad> mostrarEstudiantesInscritosFacultad(String periodo) {
        return repoCuatro.estudiantesInscritosFacultad(periodo);
    }

    
    @Override
    public List<EstudiantesInscritosCarrera> mostrarEstudiantesInscritosCarreraModalidad(String modalidad, 
                                                                                String facultad,
                                                                                String periodo, 
                                                                                String localidad) {
        return repoDos.inscritosCarreraModalidad(modalidad, facultad, periodo, localidad);
    }

    @Override
    public List<EstudiantesInscritosModalidad> mostrarInscritosModalidad(String periodo) {
        return repoSiete.inscritosModalidad(periodo);
    }

    @Override
    public List<CantidadTituladosPeriodo> mostrarCantidadEstudiantesTituladosPeriodo() {
        return repoOcho.cantidadTiTuladosPeriodo();
    }

    @Override
    public List<CantidadTituladosFacultad> mostrarTituladosFacultad(String periodo) {
        return repoNueve.tituladosFacultad(periodo);
    }

    @Override
    public List<CantidadEgresadosPeriodo> mostrarCantidadEgresadosPeriodo(String modalidad, 
                                                                          String facultad,
                                                                          String carrera, 
                                                                          String localidad) {
        return repoDiez.cantidadEgresadosPeriodo(modalidad, facultad, carrera, localidad);
    }

    @Override
    public List<CantidadEgresadosFacultad> mostrarEgresadosFacultad(String periodo) {
        return repoOnce.egresadosFacultad(periodo);
    }

    @Override
    public List<ComparacionIngresosTituladosPeriodo> mostrarComparacionIngresosTituladosPeriodo(String modalidad,
                                                                                                String facultad, 
                                                                                                String carrera, 
                                                                                                String localidad) {
        return repoDoce.comparacionIngresosTituladosPeriodo(modalidad, facultad, carrera, localidad);
    }

    @Override
    public List<ComparacionIngresosTituladosFacultad> mostrarComparacionIngresosTituladosFacultad(String periodo) {
        return repoTrece.comparacionIngresosTituladosFacultad(periodo);
    }

    @Override
    public List<PorcentajeDesercionPeriodo> mostrarPorcentajeDesercionPeriodo() {
        return repoCatorce.porcentajeDesercionPeriodo();
    }
    
    @Override
    public List<DesercionFacultad> mostrarPorcentajeDesercionFacultad(String periodo) {
        return repoQince.desercionFacultad(periodo);
    }

    @Override
    public List<RendimientoAcademicoPeriodo> mostrarRendimientoAcademicoPeriodo() {
        return repoDieciseis.rendimientoAcademicoPeriodo();
    }

    @Override
    public List<RendimientoAcademicoFacultad> mostrarRendimientoAcademicoFacultad(String periodo) {
        return repoDiecisiete.rendimientoAcademicoFacultad(periodo);
    }
    
    @Override
    public List<PromedioPonderadoSemestralPeriodo> mostrarPromedioPonderadoSemestralPeriodo() {
        return repoDieciocho.promedioPonderadoSemestralPeriodo();
    }

    @Override
    public List<PromedioPonderadoSemestralFacultad> mostrarPromedioPonderadoSemestralFacultad(String periodo) {
        return repoDiecinueve.promedioPonderadoSemestralFacultad(periodo);
    }

    @Override
    public List<PromedioPonderadoAcumuladoCarreraPeriodo> mostrarPromedioPonderadoAcumuladoCarreraPeriodo() {
        return repoVeinte.promedioPonderadoAcumuladoPeriodo();
    }

    @Override
    public List<PromedioPonderadoAcumuladoCarreraFacultad> mostrarPromedioPonderadoAcumuladoFacultad(String periodo) {
        return repoVeintiUno.promedioPonderadoAcumuladoFacultad(periodo);
    }

    @Override
    public List<PromedioPonderadoAcumuladoSinCeroCarreraPeriodo> mostrarPromedioPonderadoAcumuladoSinCeroCarreraPeriodo() {
        return repoVeintiDos.promedioPonderadoSinCeroCarreaPeriodo();
    }

    @Override
    public List<PromedioPonderadoSemestralSinCeroFacultad> mostrarPromedioPonderadoSemestralSinCeroFacultad(String periodo) {
        return repoVeintiTres.promedioPonderadoSemestralSinCeroFacultad(periodo);
    }

}

