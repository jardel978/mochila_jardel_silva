//Uma função que tem como um de seus parâmetros outra função(anônima). Resumidamente é um parâmetro que quando for passado seu valor você coloca a função anônima que quiser como valor dele
const somar = (num1, num2) => num1 + num2;
const multiplicar = (num1, num2) => num1 * num2;

const calculadora = (num1, num2, operacao) => operacao(num1, num2);
console.log(calculadora(10, 20, somar));
console.log(calculadora(10, 20, multiplicar));

//--------------------------------------------------------------------------------

const saudado = (nome, horario) => {//função anônima armazenada em variável
    return `Oiiii, ${nome}! ${horario}! Sumida!`
};
const saudar = (nome, horario, saudacao) => saudacao(nome, horario);// fução anônima armazenada em variável que recebe os mesmos parâmetros da primeira e mais um que será o callback
//e retorna o terceiro parâmetro com uma função com os dois primeiros e mesmos parâmetros da primeira fun anônima.

console.log(saudar("Raimunda", "Boa Noite", saudado));//invocando a função que recebeu os mesmos parâmetros da primeira + a função clalback (parâmetro saudacao que foi passado para fun ao ser colocado após => e receber os mesmo parâmetros da primeira)

console.log(saudado("Rita", "Bom Dia"));//invocando apenas a primeira fum (apenas por opção mesmo)
//--------------------------------------------------------------------------------

function myDisplayer(some) {
    console.log(some);
    }
    function myCalculator(num1, num2) {
    let sum = num1 + num2;
    return sum;
    }
    let result = myCalculator(5, 5);
    myDisplayer(result);