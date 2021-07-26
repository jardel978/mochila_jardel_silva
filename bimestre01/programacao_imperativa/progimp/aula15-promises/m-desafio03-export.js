const fs = require('fs');

exports.promessa = () => {//pomessa recebe uma arrow para que recebe toda a Promise. Isso para que seja possível usar esse tipo de exports.
//no arquio de importação devo chamar essa arrow como um método da variável(OBJETO) que a receber com o require
    return new Promise((resolve, reject) => {
        console.log("lendo arquivo...");
        fs.readFile('file.json', (err, data) => {
            if (err) {
                reject(err);
            } else {
                setTimeout(()=> {resolve(JSON.parse(data))}, 3000);
            }
        });
    });
}
