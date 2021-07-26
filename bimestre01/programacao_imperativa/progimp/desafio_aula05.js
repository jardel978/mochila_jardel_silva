/*Crie um algoritmo utilizando switch que receba uma string e tenha 5 situações:

Situação 1 – Caso na string esteja escrito “Verão”, deve exibir no console a mensagem: “Que calor hein?!”.

Situação 2 – Caso na string esteja escrito “Inverno”, deve exibir no console a mensagem: “Frio dms!”.

Situação 3 – Caso na string esteja escrito “Outono”, deve exibir no console a mensagem: "É a estação em que as folhas caem".

Situação 4 – Caso na string esteja escrito “Primavera”, deve exibir no console a mensagem: “O momento em que as flores crescem”.

Situação 5 – Caso não se aplique nenhuma das opções acima, deve exibir no console a mensagem: “Ops, estação inválida”. */

function climaFun(climaHoje){

    switch(climaHoje){
        case "verao":
            console.log("Que calor hein?!");
            break;
        case "inverno":
            console.log("Frio dms!");
            break;
        case "outono":
            console.log("É a estação em que as folhas caem!");
            break;
        case "primavera":
            console.log("O momento em que as flores crescem!");
            break;
            default:
            console.log("Ops, estação inválida!");
}
}
console.log("Switch rodando (verao):");
climaFun("verao");
console.log("-----------------------")

console.log("Switch rodando (inverno):");
climaFun("inverno");
console.log("-----------------------");

console.log("Switch rodando (outono):");
climaFun("outono");
console.log("-----------------------");

console.log("Switch rodando (primavera):");
climaFun("primavera");
console.log("-----------------------");

console.log("Switch rodando (nada):");
climaFun("nada");
console.log("-----------------------");

console.log("Switch rodando (zzzz):");
climaFun("zzzz");