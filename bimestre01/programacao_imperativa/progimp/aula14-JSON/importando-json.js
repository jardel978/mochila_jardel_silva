const fs = require('fs');//importando a file sistem na const fs para poder usar seus métodos

let trazendoJson = fs.readFileSync('teste.txt', 'utf-8');// usando o método readFileSync('CAMINHO/ARQUIVO', 'ECODING') para traze/ler o JSON

let convertendo = JSON.parse(trazendoJson);//convertendo o JSON para JS
console.log(convertendo);//imprimindo o JSON que foi passado para JS

