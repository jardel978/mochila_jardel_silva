//Uma arrow function é uma função anônima que recebe ou não parâmetros. Para identificá-las com nome é nessário armazenar elas numa variável e o nome da variável passará a ser o nome da function
let soma1 = (num1, num2) => {
    console.log("A soma de " + num1 + " + " + num2 + " é: " + (num1 + num2));
};

soma1(2, 5);
//-----------------------------------------------------------------------
let horaAtual = () => {
    let data = new Date();
    return data.getHours() + ":" + data.getMinutes();
};

console.log(horaAtual());
//-----------------------------------------------------------------------
 let print = mensagem => console.log(mensagem);
 print("Olá, bom dia");

 let soma = (n1, n2) => n1 + n2;
console.log(soma(10, 10));
//------------------------------------------------------------------------
//micro desafio 01 - aula 07
function fizzBuzz(n1, n2){
    
    let numeros = [];
    for(let i = 1; i <= 100; i++){
        numeros.push(i);
    }
    for(let indice = 0; indice < numeros.length; indice++){
        
        if (numeros[indice] % n1 == 0 && numeros[indice] % n2 != 0){
            console.log("Fizz");
        }else if (numeros[indice] % n2 == 0 && numeros[indice] % n1 != 0){
            console.log("Buzz");
        }
        else if (numeros[indice] % n1 == 0 && numeros[indice] % n2 == 0){
            console.log("FizzBuzz");
        }
        else{
            console.log(numeros[indice] + " não é multiplo nem de " + n1 + " nem de " + n2);
        }
    }
}   
fizzBuzz(2, 8);
