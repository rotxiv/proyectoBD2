package com.example.demo.service.serviceApi;

import java.util.List;

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

public interface AcademicoUagrmApi {
    
    public List<EstudiantesInscritosLocalidad> mostrarEstudiantesInscritosLocalidad(String periodo);
    public List<EstudiantesInscritosModalidad> mostrarInscritosModalidad(String periodo);
    public List<CantidadTituladosFacultad> mostrarTituladosFacultad(String periodo);
    public List<CantidadEgresadosFacultad> mostrarEgresadosFacultad(String periodo);
    public List<ComparacionIngresosTituladosFacultad> mostrarComparacionIngresosTituladosFacultad(String periodo);
    public List<DesercionFacultad> mostrarPorcentajeDesercionFacultad(String periodo);
    public List<RendimientoAcademicoFacultad> mostrarRendimientoAcademicoFacultad(String periodo);
    public List<PromedioPonderadoSemestralFacultad> mostrarPromedioPonderadoSemestralFacultad(String periodo);
    public List<PromedioPonderadoSemestralPeriodo> mostrarPromedioPonderadoSemestralPeriodo(String periodo);
    public List<PromedioPonderadoSemestralSinCeroFacultad> mostrarPromedioPonderadoSemestralSinCeroFacultad(String periodo);
    
}
