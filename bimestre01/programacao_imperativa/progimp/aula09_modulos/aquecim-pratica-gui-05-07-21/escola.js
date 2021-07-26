//importar estudantes, ou seja, o construtor que fizemos no arquivo estudantes.js
const estudantes = require('./estudantes');



//Nosso objeto aluno terá o método calcularMedia que retorna a média de suas notas. Também terá um método chamado faltas, que simplesmente aumenta o número de faltas em 1.

//criando novos estudantes
let novoEstudante = new estudantes("Joao", 1, [9,9,9,9,10]);
let novoEstudante2 = new estudantes("Carlos", 2, [10,10,10,5,8]);

//fiz uma um array com esses novos estudantes e guardei em uma variável.
//isso vai fazer com que o Objeto Curso (do passo 3) fique mais bonito.
let listaEstudantes = [novoEstudante, novoEstudante2];
console.log(listaEstudantes);

//Exercício 2
let media = novoEstudante.media(novoEstudante.notas)
let falta = novoEstudante.aumentarFalta();
console.log(media)
console.log(falta)

//Exportando a lista feita acima 
module.exports = listaEstudantes;

