console.log('Hola, Mundo!');

// Función para determinar la estación del año
function determinarEstacion(mes) {
    if (mes >= 1 && mes <= 3) {
        return "Invierno";
    } else if (mes >= 4 && mes <= 6) {
        return "Otoño";
    } else if (mes >= 7 && mes <= 9) {
        return "Primavera";
    } else if (mes >= 10 && mes <= 12) {
        return "Verano";
    } else {
        return "Mes inválido. Por favor, ingrese un número del 1 al 12.";
    }
}

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question('Ingrese una hora del día (0-23): ', (numero) => {
    const hora = parseInt(numero);

    switch (true) {
        case hora >= 6 && hora < 12:
            console.log(`La hora ${hora} es por la mañana.`);
            break;
        case hora >= 12 && hora < 19:
            console.log(`La hora ${hora} es por la tarde.`);
            break;
        case hora >= 19 && hora <= 23:
        case hora >= 0 && hora < 6:
            console.log(`La hora ${hora} es por la noche.`);
            break;
        default:
            console.log(`Hora inválida. Por favor, ingrese un número entre 0 y 23.`);
            break;
    }

    readline.close();
});
