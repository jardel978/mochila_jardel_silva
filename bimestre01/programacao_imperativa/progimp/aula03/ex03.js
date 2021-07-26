/*Aula 03 - 31/05/2021
  Definindo uma função*/

function minhaFuncao (){
    console.log("Minha Função!");
}

minhaFuncao();

function funcaoParametro(a, b){
return a * b;
}

console.log(funcaoParametro(2, 5));

//Função em variável (Função Expressa)

var aproveitandoFunParametro = funcaoParametro(5, 9);
console.log(aproveitandoFunParametro);

let idade =  24;

function alteraIdade(){
    idade++;
    console.log(idade);
    return idade;
}

alteraIdade();
alteraIdade();
alteraIdade();
alteraIdade();
alteraIdade();

var idade = 2;
console.log(idade^2);