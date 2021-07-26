/*3- Crie um array de números e utilize a função .reduce() para devolver uma string com os números formatados.
  [1,5,9,3,7] => “1 – 5 – 9 – 3 – 7”, alguém conseguiu ? */

let numeros = [1,5,9,3,7];
let numerosFormatados = numeros.reduce((acumulador, numero)=> acumulador.toString() + " - " + numero.toString());
console.log(numerosFormatados);