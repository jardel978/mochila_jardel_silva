//Permite escrever código baseado em promesis como se fosse síncrono(pq o await faz "esperar" retornar a promise para dar seqência no código)
//isso facilita a leitura e compreensão desse código
//não precisa usar métodos .then e .catch encadeados, a fun async já trata de cuidar do retorno da promise
//toda async sempre retorna uma promise(explícita ou implicitamente) que encapsula o valor que a fun está retornando



// async function saudacao() {
//     return "Olá!";
// }
// console.log(saudacao());//o resultado desse console será uma promise
//-------------------------------------------------------------------------------------------------------

//Criando uma fun que retorna uma new Promise, tradicionalmente:

// function calculando(num1, num2) {
//     return new Promise((reject, resolve) => {
//         if(typeof num1 !== "number" || typeof num2 !== "number"){
//             reject("Erro! Certifique-se de que você tenha inserido apenas números.");
//         } 
//         resolve(num1 + num2);
//     })
// }
// calculando(1, "2").then((resolve) => console.log(resolve)).catch((reject) => console.log(reject));


//Exemplo da fun anterior usando o async, que vai simplificar a escrita já que o async tem como retorno uma promise

// async function calculando (num1, num2) {
//     if(typeof num1 !== "number" || typeof num2 !== "number"){
//         return "Erro! Certifique-se de que você tenha inserido apenas números."
//     } //else{ posso usar ou não esse else
//     return num1 + num2;//esse retorno da fun calculando() que será o status/o resolve retornado da promise e a exceção dessa fun(nesse caso o if) será o reject
//   //  }
// }
// // //por ter o async, essa fun calculando já retornará seu resultado em forma de promise. Por isso é possível usar métodos .then e .catch
// // console.log(calculando());//veja oresultado desse console! Drá uma promisse
// calculando(1, 2).then((resolve) => console.log(resolve)).catch((reject) => console.log(reject));

//-------------------------------------------------------------------------------------------------------

//Otimizando ainda mais uma async com o uso do await: 
// Await pode ser usado apenas em fun async e ele pausa a execução da fun até que a promise seja resolvida, ou seja,
//faz com que a promise(que por natureza é assíncrona) passe a ser executada de forma síncrona. Isso é útil
//por exemplo, quando temos uma sequência de requisições onde a segunda depende da primeira e assim sucessivamente...
//(enquanto a anterior não for feita a sucessora não será executada)

//Fun que vair retornar a Promise simplificada devido o async. 
const funSomar = async (a, b) => {
        if (typeof a !== "number" || typeof b !== "number") {
            return "Erro! Insira dois números válidos!";
        }
        return a + b;
}

//Segunda fun que recebe a primeira e a torna síncrona com o uso do await
const calculando = async (num1, num2) => {
    try{//se tudo der certo, executará o que estiver aqui
    let resultado = await funSomar(num1, num2);//armazenando numa let o await para a funSomar que é async e já retona a Promise
    console.log(resultado);
    }
    catch (reject){//em caso de erro, executará o que estiver aqui
//nesse uso do catch pegamos erros mais expecíficos, já usando o meio tradicional Promise.catch: tratamos erros multiplos, mais variedades
        console.log(reject);
    }
}

calculando(1, 2);
