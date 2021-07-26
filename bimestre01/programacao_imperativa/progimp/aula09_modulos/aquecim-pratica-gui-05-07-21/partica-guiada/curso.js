let alunosConstrutor = require('./modulos/aluno');
// let estudanteObj = new alunosConstrutor.alunosConstrutor();

function cursoConstrutor(nomeCurso, mediaAprovacao, maxFaltas, ...listaEstudante) {
    this.nomeCurso = nomeCurso;
    this.mediaAprovacao = mediaAprovacao;
    this.maxFaltas = maxFaltas;
    this.listaEstudante = [];//array para receber estudantes passados como parâmetros
    this.novoAluno = function () {//método de adicionar estudantes diretamente como parâmetro do cursoConstrutor (ou seja, não precisa chamá-lo para adicionar aluno, só passar como parâmetro)
        return this.listaEstudante.push(...listaEstudante);//adicionando os estudantes no array
    };
    console.log(`\n***************************\n Curso: ${nomeCurso}\n Nota de Aprovação: ${mediaAprovacao}\n Máximo de faltas permitidas: ${maxFaltas} \n`)
    console.log(listaEstudante);//imprimido os estudantes - retirar para não imprimir os alunos
    for (let i in listaEstudante) {//acessando cada objeto e para o i=> e pegando a propriedade media() desse objeto para  condicionais
        console.log(listaEstudante[i].media());
        console.log(listaEstudante[i].faltas());
    }
    //até aqui estou retornando todos os dados
}

let estudante01 = new alunosConstrutor.alunosConstrutor("Pedro", 1, [9, 9, 8]);//criando estudantes
let estudante02 = new alunosConstrutor.alunosConstrutor("Camila", 0, [10, 10, 8]);//criando estudantes
let estudante03 = new alunosConstrutor.alunosConstrutor("Marina", 0, [10, 10, 10]);//criando estudantes

//cursoConstrutor("CTD", 5, 5, new alunosConstrutor.alunosConstrutor("Pedro", 1, [9, 9, 8]), new alunosConstrutor.alunosConstrutor("Camila", 0, [10, 10, 8]), new alunosConstrutor.alunosConstrutor("Marina", 0, [10, 10, 10]));//chamando a função construtora do curso com o custurtor de alunos já no parâmetro*/
//cursoConstrutor("CTD", 5, 5, estudante01, estudante02, estudante03);//chamando a função construtora do curso


let curso = cursoConstrutor("CTD", 5, 5, estudante01, estudante02, estudante03);//chamando a função construtora do curso

