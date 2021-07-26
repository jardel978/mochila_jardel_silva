const Alunos = require('./construtorAluno');

let estudante01 = new Alunos("Pedro", 1, [9, 9, 8]);//criando estudantes
let estudante02 = new Alunos("Camila", 0, [10, 10, 8]);//criando estudantes

exports.estudante01 = estudante01;
exports.estudante02 = estudante02;
