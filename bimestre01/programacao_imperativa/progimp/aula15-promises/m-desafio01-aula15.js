// Micro desafio 01

const fs = require('fs');

// // forma convencional: passar isso para uma Pormise
//     fs.readFile('file.json', (err, data) => {
//         if (err) {
//             console.log(err)
//         } else {
//             console.log(JSON.parse(data));
//         }
//     });

const promiseRead = new Promise((resolve, reject) => {
        fs.readFile('file.json', (err, data) => {
            if (err) {
                reject(err);
            } else {
                resolve(JSON.parse(data));
            }
        });
    });

promiseRead.then((data)=> console.log(data)).catch((err) => console.log(err));
 