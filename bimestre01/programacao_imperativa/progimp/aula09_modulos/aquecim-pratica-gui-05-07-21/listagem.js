//Importando as duas páginas que fizemos, pois 
//1. Precisamos criar um novo estudante no passo 4 e é preciso do construtor
//2. A lista feita no escola.js é um atributo do nosso novo Objeto Curso

const estudantes = require('./estudantes')
const lista = require('./escola')


//Em um arquivo diferente, crie o objeto literal curso que tem como atributos: nome do curso (string), nota de aprovação (number), faltas máximas (number) e uma lista de estudantes (um array composto pelos alunos criados no passo 1).
let Curso = {
    nome: 'Curso DH',
    nota: 10,
    faltasMaximas: 3,
    listaDeEstudante: [...lista],

    //Método pedido abaixo, do passo 4. Como qualquer novo estudante é um objeto, o parametro
    //será um (obj). Precisei colocar o this.listaDeEstudante em uma nova variável
    // para o programa saber que é no nosso objeto que precisamos adicionar.

    adicionarEstudante: function(obj){
        let newLista = this.listaDeEstudante;
        newLista.push(obj)
        return newLista;
    }
}

//Crie o método que permite adicionar alunos à lista do curso, ou seja, quando chamamos nosso método em nosso objeto curso, deverá adicionar um aluno a mais na propriedade lista de estudantes do objeto curso.

//Criando um novo estudante para testar o método acima
let novoEstudante3 = new estudantes("Miguel", 2, [10,10,10,5,8]);

//Chamando a função
Curso.adicionarEstudante(novoEstudante3);

console.log(Curso.listaDeEstudante)