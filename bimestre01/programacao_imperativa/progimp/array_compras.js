let listaCompras = [" Feijão", " Arroz", " Batatas", " Iogurte", " Mel", " Sabão", " Leite", " Ovos"];
//console.log(listaCompras);
console.log("*****************************");

console.log("Alterações:")
console.log("O método JOIN puxa os elementos de uma array e retorna em forma de lista de strings");
console.log(listaCompras.join());
console.log("*****************************");
console.log("O método POP remove e aramazena o último elemeto de um array podendo usar ele numa variável também.");
console.log(listaCompras.pop());
console.log("*****************************");
console.log("O método PUSH adiciona um ou mais elementos no final de um array e depois retorna o tamanho dele atualizado.");
console.log(listaCompras.push(" Melancia"));//esse tamanho em quantidade de indices
console.log("*****************************");
console.log("O método SHIFT remove o primeiro elemento de um array e retorna esse elemento removido.");
console.log(listaCompras.shift());
console.log("*****************************");
console.log("O método UNSIFT adiciona um ou mais elementos no inicio de um array e retorna o tamanho dele atualizado.");
console.log(listaCompras.unshift(" Macarrão"));//esse tamanho em quantidade de indices
console.log(listaCompras.join());
console.log("*****************************");
//Outras funcionalidades:
console.log(listaCompras[1]);
console.log(listaCompras.length);