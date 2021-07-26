// Aula 12 -  30/06/2021
/* O map() é um método para tratar cada index de um array e retorna um outro array modificado pela fun dentro desse map. Também, método que cria uma nova matriz com os resultados de uma fun, para cada elemento da matriz*/

let letrasMinusculas = ["a", "b", "c", "d", "e"];
console.log(letrasMinusculas);//impressão normal com já estamos acostumados 
//------------------------------------------------------------------------------------------------------

//usando o map
let letrasMaiusculas = letrasMinusculas.map(function maiuscula(letra) {
    return letra.toUpperCase();
}
);//o map está pegando cada elemento do array e aplicando a fun maiuscula neles
console.log(letrasMaiusculas);

//usando arrow function dentro do map em vez de escrever function...
//a let letrasMaiusculas2 recebe letrasMinusculas.map(arrowfun maiuscula com parâmetro = elemento => (o que a fun faz) elemento.toUpperCase()       (                Arrow function               )
let letrasMaiusculas2 = letrasMinusculas.map(maiscula = elemento => elemento.toUpperCase())
console.log(letrasMaiusculas2);
//--------------------------------------------------------------------------------------------------------

//EXEMPLO 02 de map():

var salarios = [1050.75, 2000.78, 5000.98, 7500.89];
let salariosAtualizados = salarios.map(reajuste);
//fun fora do map
function reajuste(salario){
    return salario * 1.4;//aumentando em 40%
}

//com arrow fun (dentro do map)
let salariosAtualizados2 = salarios.map(reajuste = salario => salario * 1.4);
console.log(salariosAtualizados2);

//com arrow (fora do map)
let reajuste2 = salario => salario * 1.4;//arrow fun
let salariosAtualizados3 = salarios.map(reajuste2);//chamando a arrow fun dentro do método map
console.log(salariosAtualizados3);