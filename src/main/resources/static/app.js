const graficaUno = document.getElementById('GraficaUno');
const graficaDos = document.getElementById('GraficaDos');
const graficaTres = document.getElementById('GraficaTres');
const graficaCuatro = document.getElementById('GraficaCuatro');
const graficaCinco = document.getElementById('GraficaCinco');
const graficaSeis = document.getElementById('GraficaSeis');
const graficaSiete = document.getElementById('GraficaSiete');
const graficaOcho = document.getElementById('GraficaOcho');
const graficaNueve = document.getElementById('GraficaNueve');
const graficaDiez = document.getElementById('GraficaDiez');
const graficaOnce = document.getElementById('GraficaOnce');
const graficaDoce = document.getElementById('GraficaDoce');
const graficaTrece = document.getElementById('GraficaTrece');
const graficaCatorce = document.getElementById('GraficaCatorce');
const graficaQuince = document.getElementById('GraficaQuince');
const graficaDieciseis = document.getElementById('GraficaDieciseis');
const graficaDiecisiete = document.getElementById('GraficaDiecisiete');
const graficaDieciocho = document.getElementById('GraficaDieciocho');
const graficaDiecinueve = document.getElementById('GraficaDiecinueve');
const graficaVeinte = document.getElementById('GraficaVeinte');
const graficaVeintiuno = document.getElementById('GraficaVeintiuno');
const graficaVeintidos = document.getElementById('GraficaVeintidos');
const graficaVeintitres = document.getElementById('GraficaVeintitres');

const botones = document.getElementById('botones-graficas');
const paletaOpciones = document.getElementById('paleta-opciones');

const contenido = document.getElementById('contenido');
const retornar = document.getElementById('retornar');
const cargarGrafica = document.getElementById('mostrar-grafica');

const periodo = document.getElementById('periodo');
const localidad = document.getElementById('localidad');
const facultad = document.getElementById('facultad');
const modalidad = document.getElementById('modalidad');

const listaPeriodo = document.getElementById('select-uno');
const listaLocalidad = document.getElementById('select-dos');
const listaFacultad = document.getElementById('select-tres');
const listaModalidad = document.getElementById('select-cuatro');

const selects = [listaPeriodo, listaLocalidad, listaFacultad, listaModalidad];
const divSelects = [periodo, localidad, facultad, modalidad];
var opcionActual;


function ocultarOpciones() {
    contenido.style.display = 'none';
    paletaOpciones.style.display = 'none';
    botones.style.display = 'table-row-group';
    selects.forEach(select => {
        select.selectedIndex = 0;       // Valores de los select reseteados
    });
    divSelects.forEach(select => {
        select.style.display = "none"; // Ocultar todos los div de los selects
    });
}

retornar.addEventListener('click', () => {
	ocultarOpciones(opcionActual);
});

cargarGrafica.addEventListener('click', () => {
	let params = [];
    selects.forEach(select => {
        if (select.selectedIndex != 0) {
            params.push(select.value);
        }
    });
	generarGrafico(opcionActual, params);
});

graficaUno.addEventListener( 'click', () => {
    opcionActual = graficaUno;
	mostrarOpciones(opcionActual);
});

graficaDos.addEventListener( 'click', () => {
    opcionActual = graficaDos;
	mostrarOpciones(opcionActual);
});

graficaTres.addEventListener( 'click', () => {
    opcionActual = graficaTres;
	mostrarOpciones(opcionActual);
});

graficaCuatro.addEventListener( 'click', () => {
    opcionActual = graficaCuatro;
	mostrarOpciones(opcionActual);
});

graficaCinco.addEventListener('click', () => {
	opcionActual = graficaCinco;
	mostrarOpciones(opcionActual);
});

graficaSeis.addEventListener('click', () => {
	opcionActual = graficaSeis;
	mostrarOpciones(opcionActual);
});

graficaSiete.addEventListener('click', () => {
	opcionActual = graficaSiete;
	mostrarOpciones(opcionActual);
});

graficaOcho.addEventListener('click', () => {
	opcionActual = graficaOcho;
	mostrarOpciones(opcionActual);
});

graficaNueve.addEventListener('click', () => {
	opcionActual = graficaNueve;
	mostrarOpciones(opcionActual);
});

graficaDiez.addEventListener('click', () => {
	opcionActual = graficaDiez;
	mostrarOpciones(opcionActual);
});

graficaOnce.addEventListener('click', () => {
	opcionActual = graficaOnce;
	mostrarOpciones(opcionActual);
});

graficaDoce.addEventListener('click', () => {
	opcionActual = graficaDoce;
	mostrarOpciones(opcionActual);
});

graficaTrece.addEventListener('click', () => {
	opcionActual = graficaTrece;
	mostrarOpciones(opcionActual);
});

graficaCatorce.addEventListener('click', () => {
	opcionActual = graficaCatorce;
	mostrarOpciones(opcionActual);
});

graficaQuince.addEventListener('click', () => {
	opcionActual = graficaQuince;
	mostrarOpciones(opcionActual);
});

graficaDieciseis.addEventListener('click', () => {
	opcionActual = graficaDieciseis;
	mostrarOpciones(opcionActual);
});

graficaDiecisiete.addEventListener('click', () => {
	opcionActual = graficaDiecisiete;
	mostrarOpciones(opcionActual);
});

graficaDieciocho.addEventListener('click', () => {
	opcionActual = graficaDieciocho;
	mostrarOpciones(opcionActual);
});

graficaDiecinueve.addEventListener('click', () => {
	opcionActual = graficaDiecinueve;
	mostrarOpciones(opcionActual);
});

graficaVeinte.addEventListener('click', () => {
	opcionActual = graficaVeinte;
	mostrarOpciones(opcionActual);
});

graficaVeintiuno.addEventListener('click', () => {
	opcionActual = graficaVeintiuno;
	mostrarOpciones(opcionActual);
});

graficaVeintidos.addEventListener('click', () => {
	opcionActual = graficaVeintidos;
	mostrarOpciones(opcionActual);
});

graficaVeintitres.addEventListener('click', () => {
	opcionActual = graficaVeintitres;
	mostrarOpciones(opcionActual);
});

function mostrarOpciones(opcion) {
    botones.style.display = 'none';
	paletaOpciones.style.display = 'table-row-group';
    contenido.style.display = 'grid';

    // Mostrar los div de los selects según la combinación
    switch(opcion) {
        case graficaUno:
            periodo.style.display = 'inline';
            break;
        case graficaDos:
            periodo.style.display = 'inline';
            localidad.style.display = 'inline';
            facultad.style.display = 'inline';
            break;
        case graficaTres:
            periodo.style.display = 'inline';
            localidad.style.display = 'inline';
            facultad.style.display = 'inline';
            break;
        case graficaCuatro:
            periodo.style.display = 'inline';
            break;
        case graficaCinco:
            periodo.style.display = 'inline';
            break;
        case graficaSeis:
            modalidad.style.display = 'inline';
            periodo.style.display = 'inline';
            localidad.style.display = 'inline';
            facultad.style.display = 'inline';
            break;
        case graficaSiete:
            periodo.style.display = 'inline';
            break;
        case graficaOcho:
            break;
        case graficaNueve:
            periodo.style.display = 'inline';
            break;
        case graficaDiez:			
            break;
        case graficaOnce:
            periodo.style.display = 'inline';
            break;
        case graficaDoce:
            facultad.style.display = 'inline';
            localidad.style.display = 'inline';
            break;
        case graficaTrece:
            periodo.style.display = 'inline';
            break;
        case graficaCatorce:

            break;
        case graficaQuince:

            break;
        case graficaDieciseis:

            break;
        case graficaDiecisiete:
            periodo.style.display = 'inline';
            break;
        case graficaDieciocho:

            break;
        case graficaDiecinueve:
            periodo.style.display = 'inline';
            break;
        case graficaVeinte:

            break;
        case graficaVeintiuno:
            periodo.style.display = 'inline';
            break;
        case graficaVeintidos:

            break;
        case graficaVeintitres:
            periodo.style.display = 'inline';
            break;
        default:
            console.log('Combinación no válida');
            break;
    }
}


