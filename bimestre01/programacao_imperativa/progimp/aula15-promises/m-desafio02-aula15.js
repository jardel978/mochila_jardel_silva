
const fs = require('fs');

//Mircro desafio 02

const promisesFile = new Promise((resolve, reject) => {
    fs.readFile('file.json', (err, data) => {
        if (err) {
            reject(err);
        } else {
            resolve(JSON.parse(data));
        }
    });
});

const promisesFile2 = new Promise((resolve, reject) => {
    fs.readFile('file2.json', (err, data) => {
        if (err) {
            reject(err);
        } else {
            resolve(JSON.parse(data));
        }
    });
});

const promisesFile3 = new Promise((resolve, reject) => {
    fs.readFile('file3.json', (err, data) => {
        if (err) {
            reject(err);
        } else {
            resolve(JSON.parse(data));
        }
    });
});

/*Promise.all() é um método iterável, ou seja: é um método que recebe um array de promises e caso todas sejam cumpridas (retornem um resolve) ele vai executar o .then(), caso contrário .catch() */

//substituir o uso dessa fun por uma Promiseall()
// function leitorDeArquivosMultiplos(){ 
//     return fs.readFile('file.json', (err, data1) => {
//                 fs.readFile('file2.json', (err, data2) => {
//                     fs.readFile('file3.json', (err, data3) => {
//                         console.log(JSON.parse(data1));
//                         console.log(JSON.parse(data2));
//                         console.log(JSON.parse(data3));
//                     });
//                 });
//             });
// }

Promise.all([promisesFile, promisesFile2, promisesFile3]).then(values => console.log(values)).catch((errors) => console.log(errors));
//nos permite dizer ao Js que enquanto as promises passadas no arry em Promises.all() sejam TODAS resolvidas
//o resto do código vai esperar.
// console.log("depois do Promise.all()");
