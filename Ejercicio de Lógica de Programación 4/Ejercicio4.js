var readlineSync = require('readline-sync');
var numero = parseInt(readlineSync.question('Dame un numero para su factorial: '));

function fibonacci(n) {
    let fib = [0, 1]; // Inicializamos la serie con los dos primeros números
    for (let i = 2; i < n; i++) {
      fib[i] = fib[i - 1] + fib[i - 2]; // Calculamos el siguiente número en la serie
    }
    return fib.slice(0, n); // Devolvemos los primeros n números de la serie
}

console.log(fibonacci(numero));