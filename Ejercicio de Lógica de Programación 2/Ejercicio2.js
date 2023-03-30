var readlineSync = require('readline-sync');
var temperatura = parseInt(readlineSync.question('Dame la temperarura en Celcius: '));

//Funcion de Celcius a Farenheit
function changeToFarenheit(temperatura){
    let farenheit = (1.8*temperatura)+32;
    console.log("Grados Fahrenheit:", farenheit)
}

//Funcion de Celcius a Kelvin
function changeToKelvin(temperatura){
    let kelvin = temperatura + 273.15;
    console.log("Grados Kelvin:", kelvin);
}

changeToFarenheit(temperatura);
changeToKelvin(temperatura);

