//SOMA:
var somaVarFun = function(a, b){
    let soma = a + b;
    return `A soma entre ${a} e ${b} é: ${soma}`;
}
//SUBTRAÇÃO:
var subtracaoVarFun = function(c, d){
    let subtracao = c - d;
    return `A subtração entre ${c} e ${d} é: ${subtracao}`;
}
//DIVISÃO
var divisaoVarFun = function(e, f){
    let divisao = e / f;
    return `A divisão entre ${e} e ${f} é: ${divisao}`;
}
//MULTIPLICAÇÃO:
var multiplicacaoVarFun = function(g, h){
    let multiplicacao = g * h;
    return `A multiplicação entre ${g} e ${h} é: ${multiplicacao}`;
}

console.log(somaVarFun(5, 2));
console.log(subtracaoVarFun(21, 14));
console.log(divisaoVarFun(21, 3));
console.log(multiplicacaoVarFun(3.5, 2));
