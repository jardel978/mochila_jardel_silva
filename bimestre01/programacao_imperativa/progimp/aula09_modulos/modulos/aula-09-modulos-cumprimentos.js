//Aula 09 -  21/06/21
//Dentro de modulos
//aula-09-modulos-cumprimentos.js

let cumprimento = "bom dia!".toUpperCase();
//console.log(cumprimento); 

//declarando que estamos exportando essa variável:
//onde eu for inmportar eu crio uma variável com o msm nome do modulo e dou o valo: required(./caminho do arq/"nome do arquivo.js")
module.exports = cumprimento;
