//Aula 09 -  21/06/21
//Dentro de modulos
//aula-09-importando-calculos.js

const calculo = require("./modulos/aula-09-expotar-calculos");

function calcular(a, b, operação){
    let resultado;

    if(operação == "+"){
        resultado = calculo.soma(a,b);
    }

    else if(operação == "-"){
        resultado = calculo.subtracao(a,b);
    }

    else if(operação == "*"){
        resultado = calculo.multiplicacao(a,b);
    }

    else if(operação == "/"){
        resultado = calculo.divisao(a, b);
    }else{
        resultado = "Por favor, informe uma operação!"
    }
console.log(resultado);
}

calcular(6, 3, "+");
calcular(6, 3, "-");
calcular(6, 3, "*");
calcular(6, 3, "/");
calcular(6, 0, "/");