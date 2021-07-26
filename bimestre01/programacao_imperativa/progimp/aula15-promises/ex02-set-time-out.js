//Aula 15  12-07-21
//Set time out: tipo um temporizador que contará uma quantidade de ms


console.log("Requisição em andamento...")
setTimeout(() => {funConectar("Server Conectado - OK") }, 2000);//o setTimeout recebe uma fun que retorna uma msg no ciclo de tempo passado em ms com , apos o fim da fun

function funConectar(value) {//chamando a fun que está em setTimeout passando um parâmetro
    console.log(value);
}


