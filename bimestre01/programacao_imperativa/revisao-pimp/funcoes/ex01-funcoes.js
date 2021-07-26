// Aula 07/07/21

// FUNÇÃO NORMAL
function calculadora(n1, n2){
    let resultado = n1 + n2;
    return resultado
};
console.log(calculadora(1,2));

//ARROW FUNCTION
let calculadoraArrow = (n1, n2)=>  n1 + n2;//nesse caso aqui o return está implícito

console.log(calculadoraArrow(1,2));