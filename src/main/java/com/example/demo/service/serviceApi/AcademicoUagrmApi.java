package com.example.demo.service.serviceApi;

import java.util.List;

import com.example.demo.model.CantidadEgresadosFacultad;
import com.example.demo.model.CantidadEgresadosPeriodo;
import com.example.demo.model.CantidadTituladosPeriodo;
import com.example.demo.model.CantidadTituladosFacultad;
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

public interface AcademicoUagrmApi {
    
    /**
     * función grafica uno y cinco
     * @param periodo
     * @return
     */
    public List<EstudiantesInscritosLocalidad> mostrarEstudiantesInscritosLocalidad(String periodo);
    
    /**
     * función grafica dos
     * @param periodo
     * @param localidad
     * @param facultad
     * @return
     */
    public List<EstudiantesInscritosCarrera> mostrarEstudiantesInscritosCarrera(String periodo, String localidad, String facultad);
    
    /**
     * funcion grafica tres
     * @param periodo
     * @param localidad
     * @param facultad
     * @return
     */
    public List<EstudiantesNuevosInscritosCarrera> mostrarEstudiantesNuevosInscritosCarrera(String periodo, String localidad, String facultad);
    
    /**
     * funcion grafica cuatro
     * @param periodo
     * @return
     */
    public List<EstudiantesInscritosFacultad> mostrarEstudiantesInscritosFacultad(String periodo);

    /**
     * funcion grafica seis
     * @param modalidad
     * @param facultad
     * @param periodo
     * @param localidad
     * @return
     */
    public List<EstudiantesInscritosCarrera> mostrarEstudiantesInscritosCarreraModalidad(String modalidad, String facultad, String periodo, String localidad);
    
    /**
     * funcion grafica siete
     * @param periodo
     * @return
     */
    public List<EstudiantesInscritosModalidad> mostrarInscritosModalidad(String periodo);
    
    /**
     * función grafica ocho
     * @return
     */
    public List<CantidadTituladosPeriodo> mostrarCantidadEstudiantesTituladosPeriodo();

    /**
     * función grafica nueve
     * @param periodo
     * @return
     */
    public List<CantidadTituladosFacultad> mostrarTituladosFacultad(String periodo);

    /**
     * función grafica diez
     * @param modalidad
     * @param facultad
     * @param carrera
     * @param localidad
     * @return
     */
    public List<CantidadEgresadosPeriodo> mostrarCantidadEgresadosPeriodo(String modalidad, String facultad, String carrera, String localidad);

    /**
     * función grafica once
     * @param periodo
     * @return
     */
    public List<CantidadEgresadosFacultad> mostrarEgresadosFacultad(String periodo);

    /**
     * funcion grafica doce
     * @param modalidad
     * @param facultad
     * @param carrera
     * @param localidad
     * @return
     */
    public List<ComparacionIngresosTituladosPeriodo> mostrarComparacionIngresosTituladosPeriodo(String modalidad, String facultad, String carrera, String localidad);

    /**
     * funcion grafica trece
     * @param periodo
     * @return
     */
    public List<ComparacionIngresosTituladosFacultad> mostrarComparacionIngresosTituladosFacultad(String periodo);

    /**
     * funcion grafica catorce
     * @return
     */
    public List<PorcentajeDesercionPeriodo> mostrarPorcentajeDesercionPeriodo();

    /**
     * funcion grafica quince
     * @param periodo
     * @return
     */
    public List<DesercionFacultad> mostrarPorcentajeDesercionFacultad(String periodo);

    /**
     * funcion grafica diesiseis
     * @return
     */
    public List<RendimientoAcademicoPeriodo> mostrarRendimientoAcademicoPeriodo();

    /**
     * funcion grafica diesiciete
     * @param periodo
     * @return
     */
    public List<RendimientoAcademicoFacultad> mostrarRendimientoAcademicoFacultad(String periodo);

    /**
     * funcion grafica dieciocho
     * @return
     */
    public List<PromedioPonderadoSemestralPeriodo> mostrarPromedioPonderadoSemestralPeriodo();

    /**
     * funcion grafica diesinueve
     * @param periodo
     * @return
     */
    public List<PromedioPonderadoSemestralFacultad> mostrarPromedioPonderadoSemestralFacultad(String periodo);

    /**
     * funcion grafica veinte
     * @return
     */
    public List<PromedioPonderadoAcumuladoCarreraPeriodo> mostrarPromedioPonderadoAcumuladoCarreraPeriodo();
    
    /**
     * funcion grafica veintiuno
     * @param periodo
     * @return
     */
    public List<PromedioPonderadoAcumuladoCarreraFacultad> mostrarPromedioPonderadoAcumuladoFacultad(String periodo);

    /**
     *  funcion grafica veintidos
     * @return
     */
    public List<PromedioPonderadoAcumuladoSinCeroCarreraPeriodo> mostrarPromedioPonderadoAcumuladoSinCeroCarreraPeriodo();
    
    /**
     * funcion grafica vientitres
     * @param periodo
     * @return
     */
    public List<PromedioPonderadoSemestralSinCeroFacultad> mostrarPromedioPonderadoSemestralSinCeroFacultad(String periodo);
    
}
