package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
import com.example.demo.service.serviceApi.AcademicoUagrmApi;

@RestController
@CrossOrigin("*")
@RequestMapping("/API")
public class AcademicoUagrmController {

    @Autowired
    private AcademicoUagrmApi academicoUagrm;


    @GetMapping("Academico/GraficaUno/{periodo}")
    public List<EstudiantesInscritosLocalidad> mostrarGraficaUno(@PathVariable String periodo) {
        return academicoUagrm.mostrarEstudiantesInscritosLocalidad(periodo);
    }

    @GetMapping("Academico/GraficaCinco/{periodo}")
    public List<EstudiantesInscritosLocalidad> mostrarGraficaCinco(@PathVariable String periodo) {
        return academicoUagrm.mostrarEstudiantesInscritosLocalidad(periodo);
    }

    @GetMapping("Academico/GraficaSiete/{periodo}")
    public List<EstudiantesInscritosModalidad> mostrarGraficaSiete(@PathVariable String periodo) {
        return academicoUagrm.mostrarInscritosModalidad(periodo);
    }

    @GetMapping("Academico/GraficaNueve/{periodo}")
    public List<CantidadTituladosFacultad> mostrarGraficaNueve(@PathVariable String periodo) {
        return academicoUagrm.mostrarTituladosFacultad(periodo);
    }

    @GetMapping("Academico/GraficaOnce/{periodo}")
    public List<CantidadEgresadosFacultad> mostrarGraficaOnce(@PathVariable String periodo) {
        return academicoUagrm.mostrarEgresadosFacultad(periodo);
    }

    @GetMapping("Academico/GraficaTrece/{periodo}")
    public List<ComparacionIngresosTituladosFacultad> mostrarGraficaTrece(@PathVariable String periodo) {
        return academicoUagrm.mostrarComparacionIngresosTituladosFacultad(periodo);
    }

    @GetMapping("Academico/GraficaQince/{periodo}")
    public List<DesercionFacultad> mostrarGraficaQince(@PathVariable String periodo) {
        return academicoUagrm.mostrarPorcentajeDesercionFacultad(periodo);
    }

    @GetMapping("Academico/GraficaDiecisite/{periodo}")
    public List<RendimientoAcademicoFacultad> mostrarGraficaDiecisiete(@PathVariable String periodo) {
        return academicoUagrm.mostrarRendimientoAcademicoFacultad(periodo);
    }

    @GetMapping("Academico/GraficaDiecinueve/{periodo}")
    public List<PromedioPonderadoSemestralFacultad> mostrarGraficaDiecinueve(@PathVariable String periodo) {
        return academicoUagrm.mostrarPromedioPonderadoSemestralFacultad(periodo);
    }

    @GetMapping("Academico/GraficaVeitiuno/{periodo}")
    public List<PromedioPonderadoSemestralPeriodo> mostrarGraficaVeitiuno(@PathVariable String periodo) {
        return academicoUagrm.mostrarPromedioPonderadoSemestralPeriodo(periodo);
    }

    @GetMapping("Academico/GraficaVeintitres/{periodo}")
    public List<PromedioPonderadoSemestralSinCeroFacultad> mostrarGraficaVeintitres(@PathVariable String periodo) {
        return academicoUagrm.mostrarPromedioPonderadoSemestralSinCeroFacultad(periodo);
    }
}
