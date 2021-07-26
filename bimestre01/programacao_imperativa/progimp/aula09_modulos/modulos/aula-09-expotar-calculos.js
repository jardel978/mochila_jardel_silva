//Aula 09 -  21/06/21
//Dentro de modulos
//aula-09-exportando-calculos.js

//criando e já exportando uma função para cada operação. usando arrow functions para simplificar o processo
module.exports.soma=(a, b) => a + b;
module.exports.subtracao=(a,b) => a - b;
module.exports.multiplicacao=(a, b) => a * b;
module.exports.divisao=(a, b) => {
    if(b != 0 ){
        return a / b;
    }else {
        return `Ainda não é possível dividir um número por ${b}!`;
    }
}