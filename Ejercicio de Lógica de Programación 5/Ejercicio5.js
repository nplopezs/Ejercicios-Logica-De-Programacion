var readlineSync = require('readline-sync');
var entrada = parseInt(readlineSync.question('Adivina el numero entre el 1 y el 100:'));

let intentos = [entrada]; 
let numSecreto = Math.floor(Math.random()*100);
//console.log(numSecreto);
while(entrada != numSecreto){
    console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
    entrada = parseInt(readlineSync.question('Adivina el numero entre el 1 y el 100:'));
    intentos.push(entrada);
}
console.log("Felicidades, adivinaste el número secreto.",`intentos realizados ${intentos}`);


