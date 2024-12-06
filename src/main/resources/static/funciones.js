const URL_API = "http://localhost:8080/API/Academico";
const grafica = document.getElementById('grafica');

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
};