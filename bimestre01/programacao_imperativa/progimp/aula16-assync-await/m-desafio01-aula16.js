/*1) Crie uma função, que após 5 segundos, dobre o resultado do número passado como parâmetro.
Essa função deverá retornar uma Promise. Use o setTimeOut como temporizador.*/


// const dobro = (numero) => {
//     return new Promise((resolve, reject) => {
//         console.log("calculando...");
//         if (numero) {
//             setTimeout(() => { resolve(numero * 2); }, 5000);
//         } else {
//             setTimeout(() => { reject("Erro!"); }, 5000);
//         }
//     })
// }
// dobro(3).then((resolve) => console.log(resolve)).catch((reject) => console.log(reject));

//simplificada:
const dobro = (numero) => {
    return new Promise((resolve, reject) => {
        console.log("calculando...");
        setTimeout(() => {
            if (numero) {
                resolve(numero * 2);
            } else {
                reject("Erro!");
            }
        }, 5000)
    })
}
dobro(3).then((resolve) => console.log(resolve)).catch((reject) => console.log(reject));


/*2) Crie uma função assíncrona que irá receber um parâmetro x. Crie três variáveis: a, b e c dentro do corpo da função. 
Cada uma dessas variáveis receberá um await da função do passo anterior. 
Você deve passar como parâmetros dessa função os números 10, 20 e 30, respectivamente.*/

// async function funAsync(x) {
//     try {
//         let a = await dobro(10);
//         let b = await dobro(20);
//         let c = await dobro(30);
//         console.log(a, b, c);
//     }
//     catch (reject) {
//         console.log(reject);
//     };
// }
// funAsync();

/*3) Retorne a soma de todos esses elementos, inclusive o parâmetro da função assíncrona.*/

// async function funAsync(x) {
//     try {
//         let a = await dobro(10);//esse await "pausa" a execução do restate da fun abaixo dele até que o promisse retorne seu resultado
//         let b = await dobro(20);// o await é usado apenas dentro de uma fun asunc
//         let c = await dobro(30);
//         console.log(a + b + c + x);
//     }
//     catch (reject) {
//         console.log(reject);
//     };
// }

// funAsync(30);

//usando arrow:
// const funAsync = async (x) => {
//     try {
//         let a = await dobro(10);//esse await "pausa" a execução do restate da fun abaixo dele até que o promisse retorne seu resultado(como se fosse síncrono)
//         let b = await dobro(20);// o await é usado apenas dentro de uma fun asunc
//         let c = await dobro(30);
//         console.log(a + b + c + x);
//     }
//     catch (reject) {
//         console.log(reject);
//     };
// }

// funAsync(30);
