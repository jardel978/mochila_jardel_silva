/*1) Escrever um programa que imprime 25 termos da série 11 - 22 - 33 - 44, etc. 
2) Mostrar os múltiplos de 8 até o valor 500. A tela deve mostrar 8 -16 -24;
3) Usando FOR, desenvolver um programa que mostre a tabuada de 5.*/

//EX 01 com multiplicação:
for(let i = 1; i <= 25; i++){
    let resultado = i * 11;
    console.log(resultado);
}
//EX 01 com soma:
var inicial = [11];
for(let indice = 0; indice < 24; indice++){
    let soma = 11 + inicial[indice];
    inicial.push(soma);
} 
console.log(inicial.join());

//-----------------------------------------------------------------------------------------------------------------

//EX 02:

for(let num1 = 0; num1 <= 500; num1++){
    if(num1 % 8 == 0){
        console.log(num1);   
    }
}

//EX 03:

var i = 5;      
console.log(`TABUADA DO ${i}:`);
    for(let e = 0; e <= 10; e++){                
        console.log(`${i} vezes ${e} = ${i * e}`);              
    } 