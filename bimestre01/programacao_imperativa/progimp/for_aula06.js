/*Repetir como um papagaio:
Crie um loop utilizando for que se repita 5 vezes. Dentro de cada repetição se deve mostrar no console a mensagem “Olá mundo”.

Contando números ímpares:
Crie um loop for de 1 a 10, em que exiba no console apenas o valor das repetições de números ímpares. Dica: 
A ideia é que nas repetições ímpares de 0 ao 10 (1,3,5,7,9) sejam mostrados os números das repetições no console.

Criando a tabuada:
Crie uma tabuada utilizando o for. Dica: Para essa tarefa você irá precisar utilizar dois loops (for).*/

for(let i = 0; i <= 5; i++){
    console.log("Olá mundo");
}
//-------------------------------------------------
var impares = [];
for(let i = 1; i <= 10; i++){
    if(i % 2 != 0){
        impares.push(i);
    }
}
console.log(impares.join());
//-------------------------------------------------

var i = 3;      
console.log(`TABUADA DO ${i}:`);
    for(let e = 0; e <= 10; e++){                
        console.log(`${i} vezes ${e} = ${i * e}`);              
    } 
//-------------------------------------------------
for(var i = 1; i <= 10; i++){
    console.log(`TABUADA DO ${i}:`);
        for(let e = 0; e <= 10; e++){
            console.log(`${i} vezes ${e} = ${i * e}`);
        } 
}

//-------------------------------------------------

exibirTipo(10);

function exibirTipo(limite){
    for(let i = 0; i < limite; i++){
        if(i % 2 != 0){
        console.log(`${i} ÍMPAR`);
        }
    }
}
