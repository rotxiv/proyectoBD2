const URL_API = "http://localhost:8080/API/Academico";
const grafica = document.getElementById('grafica');
const periodo = document.getElementById('periodos');
const localidad = document.getElementById('localidades');
const facultad = document.getElementById('facultades');
const modalidad = document.getElementById('modalidades');


function functionChart(grafica, localidad, inscritos) {
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


function opcionesUno() {
    alert("¡Hola..., Soy un mensaje de alerta...!");
    localidad.style.display = "none";
    modalidad.style.display = "none";
    facultad.style.display = "none";
    periodo.style.display = "inline";
};
const cargarGraficoUno = async() => {
    try {
        const respuesta = await fetch(`${URL_API}/GraficaUno/2019-1`);
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
};

const cargarGraficoDos = async() => {
    try {
        const respuesta = await fetch(`${URL_API}/Graficados/param`);
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
};

const cargarGraficoTres = async () => {
    
}

const cargarGraficoCuatro = async () => {
    
}

const cargarGraficoCinco = async () => {
    
}

const cargarGraficoSeis = async () => {
    
}

const cargarGraficoSiete = async () => {
    
}

const cargarGraficoOcho = async () => {
    
}

const cargarGraficoNueve = async () => {
    
}

const cargarGraficoDiez = async () => {
    
}

const cargarGraficoOnce = async () => {
    
}

const cargarGraficoDoce = async () => {
    
}

const cargarGraficoTrece = async () => {
    
}

const cargarGraficoCatorce = async () => {
    
}

const cargarGraficoQuince = async () => {
    
}

const cargarGraficoDieciseis = async () => {
    
}

const cargarGraficoDiecisiete = async () => {
    
}

const cargarGraficoDieciocho = async () => {
    
}

const cargarGraficoDiecinueve = async () => {
    
}

const cargarGraficoVeinte = async () => {
    
}

const cargarGraficoVeintiuno = async () => {
    
}

const cargarGraficoVeintidos = async () => {
    
}

const cargarGraficoVeintitres = async () => {
    
}