package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
import com.example.demo.service.serviceApi.AcademicoUagrmApi;

@RestController
@CrossOrigin("*")
@RequestMapping("/API")
public class AcademicoUagrmController {

    @Autowired
    private AcademicoUagrmApi academicoUagrm;


    @ResponseBody
    @GetMapping("Academico/GraficaUno/{periodo}")
    public List<EstudiantesInscritosLocalidad> mostrarGraficaUno(@PathVariable("periodo") String periodo) {
        return academicoUagrm.mostrarEstudiantesInscritosLocalidad(periodo);
    }

    @GetMapping("Academico/GraficaDos/{periodo}/{localidad}/{facultad}")
    public List<EstudiantesInscritosCarrera> mostarGraficaDos(@PathVariable("periodo") String periodo, 
                                                              @PathVariable("localidad") String localidad, 
                                                              @PathVariable("facultad") String facultad) {
        return academicoUagrm.mostrarEstudiantesInscritosCarrera(periodo, localidad, facultad);
    }

    @ResponseBody
    @GetMapping("Academico/GraficaTres/{periodo}/{localidad}/{facultad}")
    public List<EstudiantesNuevosInscritosCarrera> mostarGraficaTres(@PathVariable Map<String, String> pathVariables) {
        String periodo = pathVariables.get("periodo");
        String localidad = pathVariables.get("localidad");
        String facultad = pathVariables.get("facultad");
        return academicoUagrm.mostrarEstudiantesNuevosInscritosCarrera(periodo, localidad, facultad);
    }

    @GetMapping("Academico/GraficaCuatro/{periodo}")
    public List<EstudiantesInscritosFacultad> mostrarGraficaCuatro(@PathVariable("periodo") String periodo) {
        return academicoUagrm.mostrarEstudiantesInscritosFacultad(periodo);
    }

    @GetMapping("Academico/GraficaCinco/{periodo}")
    public List<EstudiantesInscritosLocalidad> mostrarGraficaCinco(@PathVariable("periodo") String periodo) {
        return academicoUagrm.mostrarEstudiantesInscritosLocalidad(periodo);
    }

    @GetMapping("Academico/GraficaSiete/{periodo}")
    public List<EstudiantesInscritosModalidad> mostrarGraficaSiete(@PathVariable("periodo") String periodo) {
        return academicoUagrm.mostrarInscritosModalidad(periodo);
    }

    @GetMapping("Academico/GraficaSeis/{modalidad}/{facultad}/{periodo}/{localidad}")
    public List<EstudiantesInscritosCarrera> mostrarGraficaSeis(@PathVariable String modalidad, 
                                                                @PathVariable String facultad, 
                                                                @PathVariable String periodo, 
                                                                @PathVariable String localidad) {
        return academicoUagrm.mostrarEstudiantesInscritosCarreraModalidad(modalidad, facultad, periodo, localidad);
    }

    @GetMapping("Academico/GraficaOcho")
    public List<CantidadTituladosPeriodo> mostrarGraficaOcho() {
        return academicoUagrm.mostrarCantidadEstudiantesTituladosPeriodo();
    }

    @GetMapping("Academico/GraficaNueve/{periodo}")
    public List<CantidadTituladosFacultad> mostrarGraficaNueve(@PathVariable("periodo") String periodo) {
        return academicoUagrm.mostrarTituladosFacultad(periodo);
    }

    @GetMapping("Academico/GraficaDiez/{modalidad}/{facultad}/{carrera}/{localidad}")
    public List<CantidadEgresadosPeriodo> mostrarGraficadiez(@PathVariable("modalidad") String modalidad, 
                                                             @PathVariable("facultad") String facultad, 
                                                             @PathVariable("carrera") String carrera, 
                                                             @PathVariable("localidad") String localidad) {
        return academicoUagrm.mostrarCantidadEgresadosPeriodo(modalidad, facultad, carrera, localidad);
    }

    @GetMapping("Academico/GraficaOnce/{periodo}")
    public List<CantidadEgresadosFacultad> mostrarGraficaOnce(@PathVariable("periodo") String periodo) {
        return academicoUagrm.mostrarEgresadosFacultad(periodo);
    }

    @GetMapping("Academico/GraficaDoce/{modalidad}/{facultad}/{carrera}/{localidad}")
    public List<ComparacionIngresosTituladosPeriodo> mostrarGraficaDoce(@PathVariable String modalidad, 
                                                                        @PathVariable String facultad, 
                                                                        @PathVariable String carrera, 
                                                                        @PathVariable String localidad) {
        return academicoUagrm.mostrarComparacionIngresosTituladosPeriodo(modalidad, facultad, carrera, localidad);
    }

    @GetMapping("Academico/GraficaTrece/{periodo}")
    public List<ComparacionIngresosTituladosFacultad> mostrarGraficaTrece(@PathVariable("periodo") String periodo) {
        return academicoUagrm.mostrarComparacionIngresosTituladosFacultad(periodo);
    }

    @GetMapping("Academico/GraficaCatorce")
    public List<PorcentajeDesercionPeriodo> mostrarGraficaCatorce() {
        return academicoUagrm.mostrarPorcentajeDesercionPeriodo();
    }


    @GetMapping("Academico/GraficaQince/{periodo}")
    public List<DesercionFacultad> mostrarGraficaQince(@PathVariable("periodo") String periodo) {
        return academicoUagrm.mostrarPorcentajeDesercionFacultad(periodo);
    }

    @GetMapping("Academico/GraficaDieciseis")
    public List<RendimientoAcademicoPeriodo> mostrarGraficaDieciseis() {
        return academicoUagrm.mostrarRendimientoAcademicoPeriodo();
    }

    @GetMapping("Academico/GraficaDiecisite/{periodo}")
    public List<RendimientoAcademicoFacultad> mostrarGraficaDiecisiete(@PathVariable("periodo") String periodo) {
        return academicoUagrm.mostrarRendimientoAcademicoFacultad(periodo);
    }

    @GetMapping("Academico/GraficaDieciocho")
    public List<PromedioPonderadoSemestralPeriodo> mostrarGraficaDieciocho() {
        return academicoUagrm.mostrarPromedioPonderadoSemestralPeriodo();
    }

    @GetMapping("Academico/GraficaDiecinueve/{periodo}")
    public List<PromedioPonderadoSemestralFacultad> mostrarGraficaDiecinueve(@PathVariable("periodo") String periodo) {
        return academicoUagrm.mostrarPromedioPonderadoSemestralFacultad(periodo);
    }

    @GetMapping("Academico/GraficaVeinte")
    public List<PromedioPonderadoAcumuladoCarreraPeriodo> mostrarGraficaVeinte() {
        return academicoUagrm.mostrarPromedioPonderadoAcumuladoCarreraPeriodo();
    }

    @GetMapping("Academico/GraficaVeintiuno/{periodo}")
    public List<PromedioPonderadoAcumuladoCarreraFacultad> mostrarGraficaVeitiuno(@PathVariable("periodo") String periodo) {
        return academicoUagrm.mostrarPromedioPonderadoAcumuladoFacultad(periodo);
    }

    @GetMapping("Academico/GraficaVeintidos")
    public List <PromedioPonderadoAcumuladoSinCeroCarreraPeriodo> mostrarGraficaveintidos() {
        return academicoUagrm.mostrarPromedioPonderadoAcumuladoSinCeroCarreraPeriodo();
    }

    @GetMapping("Academico/GraficaVeintitres/{periodo}")
    public List<PromedioPonderadoSemestralSinCeroFacultad> mostrarGraficaVeintitres(@PathVariable("periodo") String periodo) {
        return academicoUagrm.mostrarPromedioPonderadoSemestralSinCeroFacultad(periodo);
    }
}
