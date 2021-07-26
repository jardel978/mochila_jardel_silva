// Aula 12 -  30/06/2021
/* O método filter crianuma array preenchido com todos os elementos do array que passamos em um teste
filtra cada indez de um array por uma fun (condição) e vai retornar outro array com os que passam no filtro*/

const numeros = [0, 1, 2, -3, 4 ,5 ,6, 7, 8, 9];
//                                 parâmetro num => tratando ele
const numerosMaiores = numeros.filter(num => num > 0);//
console.log(numerosMaiores);

