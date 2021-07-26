/* Aula 15  12-07-21
// Promises é um objeto Js que vinvula:
//1 - a produção de código
//2 - o consumo de código (já que "consome" e retorna algo)
//Propriedades: 
//Pendente: em processamento
//Realizada: resolve
//Rejeitada: reject*/
//Usado pro exemplo para validação de login com o BD... ver se o que o pessoa digitou está realmente correto: email e senha

function meuVerificador(resposta) {
    console.log(resposta);
}

const minhaPromessa = new Promise((Resolve, Reject) => {
    let x = 10;//esse valor sera comparado e dependendo do resultado da comparação teremos o resolve ou o reject
    if (x == 0) {
        Resolve("Tudo OK");
    } else {
        Reject("Deu erro");
    }
})

minhaPromessa.then((Resolve) => console.log(Resolve)).catch((Reject) => console.log(Reject));
meuVerificador("Rodou primeiro que a promisse porque é síncrono");