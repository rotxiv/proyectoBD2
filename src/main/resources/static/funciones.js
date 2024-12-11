const URL_API = "http://localhost:8080/API/Academico";



function construirUrl(opcion, params) {
    var url = URL_API + "/" + opcion.id; 
    params.forEach(elem => {
        url = url + "/" + elem;
    });
    return url;
};

async function obtenerConsulta(url) {  
    try {
        var res = await fetch(url);
        if (res.status === 200) {
            const datos = await res.json();
            return datos;
        }
    } catch (error) {
        console.log(error);
        return [];
    } 
};

function generarGrafico(opcion, params) {
    const url = construirUrl(opcion,params);
    if (opcion.id === "GraficaUno") {
        cargarGraficoUno(url);
    }
    else if (opcion.id === "GraficaDos") {
        cargarGraficoDos(url);
    }
    else if (opcion.id === "GraficaTres") {
        cargarGraficoTres(url);
    }
    else if (opcion.id === "GraficaCuatro") {
        cargarGraficoCuatro(url);
    }
    else if (opcion.id === "GraficaCinco") {
        cargarGraficoCinco(url);
    }
    else if (opcion.id === "GraficaSies") {
        cargarGraficoSeis(url);
    }
    else if (opcion.id === "GraficaSiete") {
        cargarGraficoSiete(url);
    }
    else if (opcion.id === "GraficaOcho") {
        cargarGraficoOcho(url);
    }
    else if (opcion.id === "GraficaNueve") {
        cargarGraficoNueve(url);
    }
    else if (opcion.id === "GraficaDiez") {
        cargarGraficoDiez(url);
    }
    else if (opcion.id === "GraficaOnce") {
        cargarGraficoOnce(url);
    }
    else if (opcion.id === "GraficaDoce") {
        cargarGraficoDoce(url);
    }
    else if (opcion.id === "GraficaTrece") {
        cargarGraficoTrece(url);
    }
    else if (opcion.id === "GraficaCatorce") {
        cargarGraficoCatorce(url);
    }
    else if (opcion.id === "GraficaQince") {
        cargarGraficoQuince(url);
    }
    else if (opcion.id === "GraficaDieciseis") {
        cargarGraficoDieciseis(url);
    }
    else if (opcion.id === "GraficaDiecisiete") {
        cargarGraficoDiecisiete(url);
    }
    else if (opcion.id === "GraficaDieciocho") {
        cargarGraficoDieciocho(url);
    }
    else if (opcion.id === "GraficaDiecinueve") {
        cargarGraficoDiecinueve(url);
    }
    else if (opcion.id === "GraficaVeinte") {
        cargarGraficoVeinte(url);
    }
    else if (opcion.id === "GraficaVeintiuno") {
        cargarGraficoVeintiuno(url);
    }
    else if (opcion.id === "GraficaVeintidos") {
        cargarGraficoVeintidos(url);
    }
    else if (opcion.id === "GraficaVeintitres") {
        cargarGraficoVeintitres(url);
    }   
};

function cargarGraficoUno(url) {
    let id = [], localidad = [], inscritos = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            localidad.push(element.localidad);
            inscritos.push(element.inscritos);
        });
    });
    chartGraficaUno(id, localidad, inscritos);
};

function cargarGraficoDos(url) {
    let id = [], carreras = [], inscritos = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            carreras.push(element.localidad);
            inscritos.push(element.inscritos);
        });
    });
    functionChart(id, carreras, inscritos);
};

function cargarGraficoTres(url) {
    let id = [], carreras = [], inscritos = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            carreras.push(element.carrera);
            inscritos.push(element.inscritos);
        });
        console.log(datos);
    });
    chartGraficaTres(id, carreras, inscritos);
};

function cargarGraficoCuatro(url) {
    let id = [], facultad = [], inscritos = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            facultad.push(element.facultad);
            inscritos.push(element.inscritos);
        });
    });
    chartGraficaCuatro(id, carrera, inscritos);
};

function cargarGraficoCinco(url) {
    let id = [], localidad = [], inscritos = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            localidad.push(element.localidad);
            inscritos.push(element.inscritos);
        });
    });
    chartGraficaUno(id, localidad, inscritos);
};

function cargarGraficoSeis(url) {
    let id = [], carrera = [], inscritos = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            carrera.push(element.carrera);
            inscritos.push(element.inscritos);
        });
    });
    chartGraficaSeis(grafica, id, carrera, inscritos);
};

function cargarGraficoSiete(url) {
    let id = [], modalidad = [], inscritos = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            modalidad.push(element.modalidad);
            inscritos.push(element.inscritos);
        });
    });
    chartGraficaSiete(id, modalidad, inscritos);
};

function cargarGraficoOcho(url) {
    let id = [], periodo = [], titulados = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            periodo.push(element.periodo);
            titulados.push(element.titulados);
        });
    });
    chartGraficaOcho(id, periodo, titulados);
};

function cargarGraficoNueve(url) {
    let id = [], facultad = [], titulados = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            facultad.push(element.facultad);
            titulados.push(element.titulados);
        });
    });
    chartGraficaNueve(grafica, id, facultad, titulados);
};

function cargarGraficoDiez(url) {
    let id = [], periodo = [], egresados = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            periodo.push(element.periodo);
            egresados.push(element.egresados);
        });
    });
    chartGraficaDiez(grafica, id, periodo, egresados);
};
//--------------------------------------------------------------
function cargarGraficoOnce(url) {
    let id = [], facultad = [], egresados = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            facultad.push(element.localidad);
            egresados.push(element.inscritos);
        });
    });
    functionChart(graficaFun, id, facultad, egresados);
};

function cargarGraficoDoce(url) {
    let id = [], periodo = [], nuevos = [], titulados = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            periodo.push(element.localidad);
            nuevos.push(element.inscritos);
            titulados.push(element.titulados);
        });
    });
    functionChart(ctx, id, periodo, nuevos, titulados);
};

function cargarGraficoTrece(url) {
    let id = [], facultad = [], nuevos = [], titulados = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            facultad.push(element.localidad);
            nuevos.push(element.inscritos);
            titulados.push(element.titulados);
        });
    });
    functionChart(grafica, id, facultad, nuevos, titulados);
};

function cargarGraficoCatorce(url) {
    let id = [], periodo = [], porcentaje = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            periodo.push(element.inscritos);
            porcentaje.push(element.carrera);
        });
    });
    functionChart(grafica, id, periodo, porcentaje);
};

function cargarGraficoQuince(url) {
    let id = [], facultad = [], periodoUno = [], periodoDos = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            facultad.push(element.localidad);
            periodoUno.push(element.inscritos);
            periodoDos.push(element.periododos);
        });
    });
    functionChart(grafica, id, facultad, periodoUno, periodoDos);
};
//-------------------------------------------------------------------
function cargarGraficoDieciseis(url) {
    let id = [], carrera = [], inscritos = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            carrera.push(element.localidad);
            inscritos.push(element.inscritos);
        });
    });
    functionChart(grafica, id, carrera, inscritos);
};

function cargarGraficoDiecisiete(url) {
    let id = [], modalidad = [], inscritos = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            modalidad.push(element.localidad);
            inscritos.push(element.inscritos);
        });
    });
    functionChart(grafica, id, modalidad, inscritos);
};

function cargarGraficoDieciocho(url) {
    let id = [], periodo = [], titulados = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            periodo.push(element.localidad);
            titulados.push(element.inscritos);
        });
    });
    functionChart(grafica, id, periodo, titulados);
};

function cargarGraficoDiecinueve(url) {
    let id = [], facultad = [], titulados = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            facultad.push(element.localidad);
            titulados.push(element.inscritos);
        });
    });
    functionChart(grafica, id, facultad, titulados);
};

function cargarGraficoVeinte(url) {
    let id = [], periodo = [], titulados = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            periodo.push(element.localidad);
            titulados.push(element.inscritos);
        });
    });
    functionChart(grafica, id, periodo, titulados);
};

function cargarGraficoVeintiuno(url) {
    let id = [], periodo = [], titulados = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            periodo.push(element.localidad);
            titulados.push(element.inscritos);
        });
    });
    functionChart(grafica, id, periodo, titulados);
};

function cargarGraficoVeintidos(url) {
    let id = [], facultad = [], titulados = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            facultad.push(element.localidad);
            titulados.push(element.inscritos);
        });
    });
    functionChart(grafica, id, facultad, titulados);
};

function cargarGraficoVeintitres(url) {
    let id = [], periodo = [], titulados = [];
    obtenerConsulta(url).then(datos => {
        datos.forEach(element => {
            id.push(element.id);
            periodo.push(element.localidad);
            titulados.push(element.inscritos);
        });
    });
    functionChart(grafica, id, periodo, titulados);
};