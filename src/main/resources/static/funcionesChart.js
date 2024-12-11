var grafica = document.getElementById('grafica');

let miGrafica;

function chartGraficaUno(id, localidad, inscritos) {
    if (miGrafica) { 
        miGrafica.destroy();
    }
    var ctx = grafica.getContext('2d');
    const data = {
        labels: localidad,
        datasets: [{
            label: 'Inscritos',
            data: inscritos,
            backgroundColor: 'rgba(75, 192, 192, 0.2)',
            borderColor: 'rgba(75, 192, 192, 1)',
            borderWidth: 1,
        }],
    };
    const config = {
        type: 'bar',
        data: data,
        options: { 
            responsive: true,
            maintainAspectRatio: true,
        scales: { y: { beginAtZero: true } } },
    };   
    miGrafica = new Chart(ctx, config);
};

function chartGraficaDos(id, localidad, inscritos) {
    if (miGrafica) { 
        miGrafica.destroy();
    }
    var ctx = grafica.getContext('2d');
    const data = {
        labels: localidad,
        datasets: [{
            label: 'Inscritos',
            data: inscritos,
            backgroundColor: 'rgba(75, 192, 192, 0.2)',
            borderColor: 'rgba(75, 192, 192, 1)',
            borderWidth: 1,
        }],
    };
    const config = {
        type: 'bar',
        data: data,
        options: { 
            responsive: true,
            maintainAspectRatio: true,
        scales: { y: { beginAtZero: true } } },
    };   
    miGrafica = new Chart(ctx, config);
};

function chartGraficaTres(id, carreras, inscritos) {
    if (miGrafica) { 
        miGrafica.destroy();
    }
    var ctx = grafica.getContext('2d');
    const data = {
        labels: carreras,
        datasets: [{
            label: 'Inscritos',
            data: inscritos,
            backgroundColor: 'rgba(75, 192, 192, 0.2)',
            borderColor: 'rgba(75, 192, 192, 1)',
            borderWidth: 1,
        }],
    };
    const config = {
        type: 'bar',
        data: data,
        options: { 
            responsive: true,
            maintainAspectRatio: true,
        scales: { y: { beginAtZero: true } } },
    };
    miGrafica = new Chart(ctx, config);   
};