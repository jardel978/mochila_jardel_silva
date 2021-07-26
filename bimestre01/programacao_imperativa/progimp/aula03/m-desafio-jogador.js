var nomeJogador = "Neymar Jr";
var golsJogador = 389;
var precoEmDolares = 95000000;


function fazerGol(){
    console.log(golsJogador ++);
    console.log("GOL!!!!!!!!!");
    console.log(precoEmDolares += 10000);
}

fazerGol();
console.log("------------------");
fazerGol();
console.log("------------------");
fazerGol();
console.log("------------------");
fazerGol();
console.log("------------------");

function hatTrick(){
    fazerGol();
    console.log("*****************");
    fazerGol();
    console.log("*****************");
    fazerGol();
    console.log("*****************");
let aumento = (precoEmDolares + (precoEmDolares * 0.1));
console.log(`Novo salário com aumento de 10%: ${aumento}`);
}

hatTrick();