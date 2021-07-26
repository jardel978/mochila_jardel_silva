//Aula 04 - 02/06/2021
//Condicionaç IF / SE

let cumpriuTarefas = false;
if(cumpriuTarefas){
    console.log("Muito Bem!!");
} else{
    console.log("Volte e complete as tarefas!");
}
console.log("*******************");


//switch:

var mes = "janeiro";
switch(mes){
    case "janeiro":
        console.log("Meu mês!");
        break;
    case "fevereiro":
    case "março":
    case "abril":
    case "maio":
    case "junho":
    case "julho":
    case "agosto":
    case "setembro":
    case "outubro":
    case "novembro":
    case "dezembro":
        console.log("Não é o meu mês!");
        break;
        default: 
            console.log("Informe um mês válido!");
}

var luz = true;
var botao = true;
console.log(luz && botao);