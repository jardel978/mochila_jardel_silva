// Aula 12 -  30/06/2021
/* O reduce vai reduzindo um array a um único valor, essa redução vai depender da fun passada nele( ex, somar, diminuir...) e será armazenada em um acumulador*/

var salarios = [1050.75, 2000.78, 5000.98, 7500.89];
//                                               Arrow fun
let somaSalarios = salarios.reduce((acumulador, salario) =>  acumulador + salario);
console.log(somaSalarios);