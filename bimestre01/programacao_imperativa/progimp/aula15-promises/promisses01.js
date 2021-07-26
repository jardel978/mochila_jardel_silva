/*  Promisses se resume em uma fun Construtora(que é um tipo de obj) que recebe DUAS FUN como parâmetros:
Resolve(que será usada em caso de sucesso) e Reject(que será usada caso erro).
    No determinado local do código que queremos usar os metrodós que essa fun nos dá devemos chamar ela
e usar a notaçõa ponto para chamar a propriedade .then ou .catch
.THEN -> irá receber o retorno do RESOLVE e tratar numa fun que terá um parâmetro e esse parâmetro que vai estar recebendo o Resolve
.CATCH -> irá receber o retorno de REJECT e tratar numa fun que terá um parâmetro e esse parâmetro que vai estar recebendo o Reject
cabe ressaltar que caso algum .THEN retornar algum erro em seus tratamentos, o .CATCH irá receber esse erro como se fosse o Reject
    As Promisses possibilitam executar blocos de código de maneira assíncrona, já que na estrutura padrão do JS tudo é executado de maneira síncrona*/

//Exemplificando:

const promises = new Promise((Resolve, Reject)=> {//criando a Promisse diretamente numa variável com o construtor
    let nome = "JaRdeL";
    // let nome = "JaRdel";
    setTimeout(()=> {//esse setTimeout dita o tempo para retorno da Promise
    if(nome === "JaRdeL"){// se a let nome  for === a "JaRdeL" vai retornar o Resolve e ele sera recebido pelo .than e tratado
    Resolve(`Usuário ${nome.toUpperCase ()}`);//vai retornar para ser usado no .then o que colocarmos aqui
    }else{// se não, vai retornar o que eu colocar em Reject(o parâmetro dado a ele é que vai receber esse retorno) e esse retorno será tratado pelo .catch
    Reject(`Usuário ${nome.toLowerCase()} inválido`);
    }
}, 2000);
});

// promises.then((recebeResolve)=> console.log(recebeResolve + ", tudo bem!"));

promises
.then((recebeResolve)=> console.log(recebeResolve + ", bem vindo!!!"))//definindo o tratamento do retorno do Resolve com o método .than
.catch((recebeReject)=> console.log(`Intruso! ${recebeReject}`));//definindo o tratamento do retorno de Reject(caso ele ocorra) com o método .catch

console.log("Insira seus dados e você terá acesso ao sistema se for um usuário autorizado.\n");
/*Para exemplificar: perceba que o console.log está apos a chamada do obj promises e seus métodos.
    O padrão seria que o JS executasse primeiro os métodos chamados do obj, mas como Prosmisses funcionam assíncronamente o console.log é 
"rodado" primeiro e a Promisse fica sendo resolvida e após concluída que ela retorna o que seu resultado. Ou seja, o código contunua sendo executado
e sem ter que ficar esperando a Promisse ser concluída...*/

