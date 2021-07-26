// Aula 05 - 07/06/2021
// Array "variável composta"

let pessoa = ["Jardel", 24, 1.7, true];
console.log(pessoa[1]);
console.log(pessoa.join());
console.log(pessoa.length);
console.log(pessoa.push("Aslam"));

let cores = ["Azul", "Branco", "Vermelho", "Verde"];
 console.log(cores);
cores.push("Violeta", "Amarelo");//adiciona elementos no final de um array
console.log(cores);
console.log(cores.pop());//retira e armazena elementos do final de um array, posso usar esse elemento dentro de uma variável por exemplo
let ultimoElemento = cores.pop();
console.log(ultimoElemento);
console.log(cores);
