const graficaUno = document.getElementById('graficaUno');
const graficaDos = document.getElementById('graficaDos');
const graficaTres = document.getElementById('graficaTres');
const graficaCuatro = document.getElementById('graficaCuatro');
const graficaCinco = document.getElementById('graficaCinco');
const graficaSeis = document.getElementById('graficaSeis');
const graficaSiete = document.getElementById('graficaSiete');
const graficaOcho = document.getElementById('graficaOcho');
const graficaNueve = document.getElementById('graficaNueve');
const graficaDiez = document.getElementById('graficaDiez');
const graficaOnce = document.getElementById('graficaOnce');
const graficaDoce = document.getElementById('graficaDoce');
const graficaTrece = document.getElementById('graficaTrece');
const graficaCatorce = document.getElementById('graficaCatorce');
const graficaQuince = document.getElementById('graficaQuince');
const graficaDieciseis = document.getElementById('graficaDieciseis');
const graficaDiecisiete = document.getElementById('graficaDiecisiete');
const graficaDieciocho = document.getElementById('graficaDieciocho');
const graficaDiecinueve = document.getElementById('graficaDiecinueve');
const graficaVeinte = document.getElementById('graficaVeinte');
const graficaVeintiuno = document.getElementById('graficaVeintiuno');
const graficaVeintidos = document.getElementById('graficaVeintidos');
const graficaVeintitres = document.getElementById('graficaVeintitres');



/*function functionChart(grafica, localidad, inscritos) {
    const myChart = new Chart(grafica, {
        type: 'bar',
        data: {
            labels: localidad,
            datasets: [{
                label: 'Edad',
                data: inscritos,
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(255, 159, 64, 0.2)',
                    'rgba(255, 205, 86, 0.2)',
                    'rgba(153, 102, 255, 0.2)'
                ],
                borderColor: [
                    'rgb(255, 99, 132)',
                    'rgb(255, 159, 64)',
                    'rgb(255, 205, 86)',
                    'rgb(153, 102, 255)'
                ],
                borderWidth: 1
            }],
        },
        options: {
            responsive: true,
            maintainAspectRatio: true,
            scales: {
                y: {
                    beginAtZero: true
                }
            },
        },
    });
};

const cargarGraficoUno = async() => {
    try {
        const respuesta = await fetch(`${URL_API}/GraficaUno/2020-1`);
        let id = [], localidad = [], inscritos = [];
        if (respuesta.status === 200) {
            const datos = await respuesta.json();
            datos.forEach(element => {
               id.push(element.id);
               localidad.push(element.localidad);
               inscritos.push(element.inscritos);
            });
            functionChart(grafica,localidad,inscritos);
        }

    }catch(error){
		console.log(error);
	}
};*/
 
graficaUno.addEventListener('click', () => {
	cargarGraficoUno();
});

graficaDos.addEventListener('click', () => {
	cargarGraficoDos();
});

graficaTres.addEventListener('click', () => {
	cargarGraficoTres();
});

graficaCuatro.addEventListener('click', () => {
	cargarGraficoCuatro();
});

graficaCinco.addEventListener('click', () => {
	cargarGraficoCinco();
});

graficaSeis.addEventListener('click', () => {
	cargarGraficoSeis();
});

graficaSiete.addEventListener('click', () => {
	cargarGraficoSiete();
});

graficaOcho.addEventListener('click', () => {
	cargarGraficoOcho();
});

graficaNueve.addEventListener('click', () => {
	cargarGraficoNueve();
});

graficaDiez.addEventListener('click', () => {
	cargarGraficoDiez();
});

graficaOnce.addEventListener('click', () => {
	cargarGraficoOnce();
});

graficaDoce.addEventListener('click', () => {
	cargarGraficoDoce();
});

graficaTrece.addEventListener('click', () => {
	cargarGraficoTrece();
});

graficaCatorce.addEventListener('click', () => {
	cargarGraficoCatorce();
});

graficaQuince.addEventListener('click', () => {
	cargarGraficoQuince();
});

graficaDieciseis.addEventListener('click', () => {
	cargarGraficoDieciseis();
});

graficaDiecisiete.addEventListener('click', () => {
	cargarGraficoDiecisiete();
});

graficaDieciocho.addEventListener('click', () => {
	cargarGraficoDieciocho();
});

graficaDiecinueve.addEventListener('click', () => {
	cargarGraficoDiecinueve();
});

graficaVeinte.addEventListener('click', () => {
	cargarGraficoVeinte();
});

graficaVeintiuno.addEventListener('click', () => {
	cargarGraficoVeintiuno();
});

graficaVeintidos.addEventListener('click', () => {
	cargarGraficoVeintidos();
});

graficaVeintitres.addEventListener('click', () => {
	cargarGraficoVeintitres();
});



