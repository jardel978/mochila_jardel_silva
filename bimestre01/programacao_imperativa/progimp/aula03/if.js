// if simples:
var status = true;
if(status){
    console.log("Verdadeiro");
} else{
    console.log("Falso");
}
console.log("--------------------");

var linguagem = "javascript";
//var linguagem = "html";
//var linguagem = "ingles";

if(linguagem == "javascript"){
    console.log("Estou aprendendo!");
} else if (linguagem == "html"){
    console.log("Estou aprendendo html também!");
} else if (linguagem == "ingles"){
    console.log("Preciso estudar mais!");
} else{
    console.log("Aprenderei mais tarde!");
}

/* if ternário */

let verdade = true;
console.log(verdade == true ? "Verdade" : "Falso");
/* Também são possíveis múltiplas avaliaçãoes ternárias (nota: o operador condicional é associativo a direita):
*/
var firstCheck = false,
    secondCheck = false,
    access = firstCheck ? "Access denied" : secondCheck ? "Access denied" : "Access granted";

console.log( access ); // logs "Access granted"*/