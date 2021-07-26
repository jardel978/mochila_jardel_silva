 //Aula 14 - JSON  07/07/21
 // usando o writeFilySync() e o readFileSync()
 //escrevendo aqrquivos (teste.txt)
 //para isso usamos a biblioteca fs = file system

 const fs = require('fs')// chamando a biblioteca fs no require e armazenando ela na const fs
 const frutas = '{"fruta": "banana", "preco": 8.50, "tipo": ["prata", "maçã", "nanica", "da terra"], "origem": "brasil"}'
 console.log(frutas);

 fs.writeFileSync('teste.txt', frutas);//chamando a biblioteca file sistem (fs) ponto writeFileSync que vai apagar tudo que tiver no arquivo e escrever o que for passado. writeFileSync('NOME DO ARQUIVO', CONTEÚDO)
/*Depois é so executar esse aqruivo no terminal que ele vai criar(caso não exista) ou escrever o arquivo dado em writeFileSync na pasta... olhe lá na pasta desse arquivo o teste.txt*/

//ler o arquivo criado

let lerJson = fs.readFileSync('teste.txt', 'utf-8');// o fs foi importado na const fs pelo require e aqui estamos usando o método readFileSync('NOME DO ARQUIVO', 'ECODING'). Esse read vai ler o arquivo passado com observação no utf e depois 
console.log(lerJson);

let convertendoLerJson = JSON.parse(lerJson);// convertendo o lerJson que armazenou a leitura do arquivo JSON para JS
console.log(`Conversão: ${convertendoLerJson.fruta}`);