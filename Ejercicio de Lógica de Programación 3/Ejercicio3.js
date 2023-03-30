var readlineSync = require('readline-sync');
var numero = parseInt(readlineSync.question('Dame un numero para su factorial: '));

function factorial(numero) {
    let cont = 1;
    for(let i = 1; i <= numero; i++){
        cont = cont * i;
    }
    return cont;
}

console.log(factorial(numero));
