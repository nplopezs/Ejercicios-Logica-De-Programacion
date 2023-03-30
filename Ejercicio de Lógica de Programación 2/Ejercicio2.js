var readlineSync = require('readline-sync');
var numero1 = parseInt(readlineSync.question('Dame el numero 1: '));
var numero2 = parseInt(readlineSync.question('Dame el numero 2: '));
var numero3 = parseInt(readlineSync.question('Dame el numero 3: '));

var array = [numero1,numero2,numero3];
console.log(array.sort());
console.log(array.reverse())

