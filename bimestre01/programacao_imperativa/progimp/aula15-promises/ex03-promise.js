// Aula 15  12-07-21

let dadosConexaoJson = '{"server":"192.168.0.1", "login":"admin", "senha":123}';

//convertendo dadosConexaoJson para Js
let dadosConexaoJs = JSON.parse(dadosConexaoJson);
// console.log(dadosConexaoJs);

//"dados inseridos pelo usuário" 
let vserver = "192.168.0.1";
let vlogin = "admin";
let vsenha = 123;

// configuração padrão
let conexao = false;

//verificando se os dados do server batem com os dados dados pelo usuário
if (dadosConexaoJs.server == vserver && dadosConexaoJs.login == vlogin && dadosConexaoJs.senha == vsenha) {
    conexao = true;
} else {
    conexao = false;
}

//criando Promise
const promessa = new Promise((Resolve, Reject) => {
    console.log("Requisição em andamento...")
    //criando um delay de 3s retornando o resultado da Promise
    setTimeout(() => {//dando um time para retorno da Promise
        //verificando se a Promise dará erro ou não
        if (!conexao) {//se conexao == false
            Reject("ACESSO NEGADO - SERVER NÃO CONECTADO");
        } else {
            Resolve(JSON.stringify(dadosConexaoJs));//convertendo isso aqui para json novamente.
        }
    }, 3000)
})

promessa.then((Resolve) => {//consumo de código/utilização do retorno da Promise
    const dados = JSON.parse(Resolve);//reconvertendo para Js o que o resolve nos dará
    console.log(dados);
}).catch((Reject) => console.log(Reject));

