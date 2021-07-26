const calculadora = require("./modulos/exportar_fun01");

function calcular(a, b, operacao){
    if (operacao == "somar"){
        return calculadora.somar(a, b);
    } else if (operacao == "subtrair"){
        return calculadora.subtrair(a, b);
    }else if (operacao == "multiplicar"){
        return calculadora.multiplicar(a, b);
    } else if(operacao == "dividir"){
        return calculadora.dividir(a, b);
    } else{
        return "Escola uma operção válida: somar, subtrair, multiplicar, dividir";
    }
}

console.log(calcular(2, 5, "somar"));
console.log(calcular(8, 1, "subtrair"));
console.log(calcular(3.5, 2, "multiplicar"));
console.log(calcular(21, 3, "dividir"));
console.log(calcular(4, 3, "operacao"));

calculadora.maiuscula("Jardel");//importando a função maiscula do outro arquivo