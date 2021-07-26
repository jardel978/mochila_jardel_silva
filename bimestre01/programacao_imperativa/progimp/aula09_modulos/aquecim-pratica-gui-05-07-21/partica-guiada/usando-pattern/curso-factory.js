let alunosConstrutor = require('./aluno-factory');//importando arquivo com a factory


let cursoConstrutor = (nomeCurso, mediaAprovacao, maxFaltas, ...estudantes) => {//criando outra factory 
    let curso = {};
    curso.nomeCurso = nomeCurso;
    curso.mediaAprovacao = mediaAprovacao;
    curso.maxFaltas = maxFaltas;
    let alunos = [];//array para receber estudantes passados como parâmetros
    alunos.push(...estudantes);
    curso.listaEstudante = alunos;
    //PASSO 4
    curso.novoAluno = (estudante) => {//método de adicionar estudantes que não foram passados como parâmetro para a factory
        return curso.listaEstudante.push(estudante);//adicionando os estudantes no array
    };

    //PASSO 5
    let situacaoAluno = false;
    let statusAprovacaoIndividual = "";
    curso.validaAprovacaoIndividual = (aluno) => {// método para ver a situação de aprovação do aluno que for dado como parâmetro
        let mediaDoAluno = aluno.media();//armazenando numa let a prop./método media() do obj aluno
        let faltasDoAluno = aluno.faltas();//armazenando numa let a prop./método faltas() do obj aluno
        if (mediaDoAluno >= curso.mediaAprovacao && faltasDoAluno < curso.maxFaltas) {//validando aprovação
            situacaoAluno = true;
            statusAprovacaoIndividual =`Aluno(a): ${aluno.nome} - Status de Aprovação: ${situacaoAluno} - Media: ${mediaDoAluno} - Faltas: ${faltasDoAluno}`;
        } else if (faltasDoAluno == curso.maxFaltas && mediaDoAluno >= curso.mediaAprovacao * 1.1) {
            situacaoAluno = true;
            statusAprovacaoIndividual =`Aluno(a): ${aluno.nome} - Status de Aprovação: ${situacaoAluno} - Media: ${mediaDoAluno} - Faltas: ${faltasDoAluno}`;
        } else {
            situacaoAluno = false;
            statusAprovacaoIndividual =`Aluno(a): ${aluno.nome} - Status de Aprovação: ${situacaoAluno} - Media: ${mediaDoAluno} - Faltas: ${faltasDoAluno}`;
        }
        return statusAprovacaoIndividual;//retornado o statusAprovacaoIndividual caso esse método seja chamado
    }

    //PASSO 6
    let listaStatusAprovacaoGeral = [];
    curso.validaAprovacaoGeral = () => {//método para ver a situação de aprovação de todos os alunos (geral)
        for (let i in curso.listaEstudante) {//acessando cada objeto do array -> pegando a propriedade media() e faltas() desse objeto para condicionais
            let mediaDoAluno = curso.listaEstudante[i].media();//armazenando numa let a prop. media() do obj de cada indice do array curso.listaEstudante
            let faltasDoAluno = curso.listaEstudante[i].faltas();//armazenando numa let a prop. faltas() do obj de cada indice do array curso.listaEstuante
            if (mediaDoAluno >= curso.mediaAprovacao && faltasDoAluno < curso.maxFaltas) {//validando aprovação
                situacaoAluno = true;
                listaStatusAprovacaoGeral.push(`Aluno(a): ${curso.listaEstudante[i].nome} - Status de Aprovação: ${situacaoAluno} - Media: ${mediaDoAluno} - Faltas: ${faltasDoAluno}`);
            } else if (faltasDoAluno == curso.maxFaltas && mediaDoAluno >= curso.mediaAprovacao * 1.1) {
                situacaoAluno = true;
                listaStatusAprovacaoGeral.push(`Aluno(a): ${curso.listaEstudante[i].nome} - Status de Aprovação: ${situacaoAluno} - Media: ${mediaDoAluno} - Faltas: ${faltasDoAluno}`);
            } else {
                situacaoAluno = false;
                listaStatusAprovacaoGeral.push(`Aluno(a): ${curso.listaEstudante[i].nome} - Status de Aprovação: ${situacaoAluno} - Media: ${mediaDoAluno} - Faltas: ${faltasDoAluno}`);
            }
        }
        return listaStatusAprovacaoGeral;
    }
    return `\n***************************\n Curso: ${nomeCurso}\n Nota Mínima de Aprovação: ${mediaAprovacao}\n Máximo de faltas permitidas: ${maxFaltas} \n`, curso;
    // return curso;
}

//instanciando estudantes pela Factory(alunosConstrutor) que foi importada/requerida na variável alunosConstrutor
let estudante01 = alunosConstrutor.alunosConstrutor("Camila", 3, 9, 9, 8);//criando estudantes (as notas são passadas por spread)
let estudante02 = alunosConstrutor.alunosConstrutor("Pedro", 0, 10, 10, 8);//criando estudantes (as notas são passadas por spread)
let estudante03 = alunosConstrutor.alunosConstrutor("Marina", 0, 10, 10, 10);//criando estudantes (as notas são passadas por spread)

//cursoConstrutor("CTD", 5, 5, new alunosConstrutor.alunosConstrutor("Pedro", 1, [9, 9, 8]), new alunosConstrutor.alunosConstrutor("Camila", 0, [10, 10, 8]), new alunosConstrutor.alunosConstrutor("Marina", 0, [10, 10, 10]));//chamando a função construtora do curso com o custurtor de alunos já no parâmetro*/
//cursoConstrutor("CTD", 5, 5, estudante01, estudante02, estudante03);//chamando a função construtora do curso


console.log("CURSO SEM ALUNOS------------------------------------------------------------------------------------");

let cursoCtd = cursoConstrutor("CTD", 5, 2); //construindo o obj cursoCtd sem estudante
// cursoCtd.novoAluno(estudante03);//adicionando um estudante pelo método.
console.log(cursoCtd);// curso sem estudantes

console.log("\n CURSO COM ALUNO PASSADO COMO PARÂMETRO--------------------------------------------------------------");

let cursoCtd2 = cursoConstrutor("CTD", 5, 2, estudante01); //construindo o obj cursoCtd com um estudante
console.log(cursoCtd2);
console.log(cursoCtd2.validaAprovacaoIndividual(estudante01));//ver status de aprovação individual 

console.log("\n ADICIONANDO MAIS DOIS ALUNOS COM O MÉTODO------------------------------------------------------------------------------------");

// É possível adicionar alunos tanto por como parâmetro da Factory "construtor" ou também pelo método novoAluno() dessa mesma Factory
cursoCtd2.novoAluno(estudante02);// adicionando um estudante pelo método.
cursoCtd2.novoAluno(estudante03);
console.log(cursoCtd2);

console.log("\n IMPRIMINDO STATUS DE APROVAÇÃO GERAL------------------------------------------------------------------------------------");
console.log(cursoCtd2.validaAprovacaoGeral());//ver status de aprovação geral

//console.log(cursoCtd2.listaEstudante);//imprimindo a lista de estudantes(que é um array de objetos)

console.log("\n IMPRIMINDO STATUS DE APROVAÇÃO INDIVIDUAL------------------------------------------------------------------------------------");
console.log(cursoCtd2.validaAprovacaoIndividual(estudante01));//ver status de aprovação individual 
console.log(cursoCtd.validaAprovacaoIndividual(estudante02));//ver status de aprovação individual
console.log(cursoCtd.validaAprovacaoIndividual(estudante03));//ver status de aprovação individual

// console.log(cursoConstrutor("CTD", 5, 2, estudante03));
// console.log(cursoConstrutor("CTD", 5, 2, estudante03).validaAprovacaoGeral());//instanciando e já chamando o método de validar aprovação geral 