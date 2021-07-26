const Alunos = require('./construtorAluno');
// let estudanteObj = new alunosConstrutor.alunosConstrutor();

/*Em um arquivo diferente, crie o objeto literal curso que tem como atributos: nome do curso (string), nota de aprovação (number), faltas máximas (number) e uma lista de estudantes (um array composto pelos alunos criados no passo 1).
 */
function Curso(nomeCurso, notaAprovacao, faltasMaxima, listaEstudantes) {
    this.nomeCurso = nomeCurso;
    this.notaAprovacao = notaAprovacao;
    this.faltasMaxima = faltasMaxima;
    this.listaEstudantes = listaEstudantes;
/*Crie o método que permite adicionar alunos à lista do curso, ou seja, quando chamamos nosso método em nosso objeto curso, deverá adicionar um aluno a mais na propriedade lista de estudantes do objeto curso.*/
    this.adicionarAlunos = (aluno) => this.listaEstudantes.push(aluno);

/*Crie um método para o objeto curso que receba um aluno (como parâmetro) e retorne true se ele aprovou no curso ou false em caso de reprovação. Para ser aprovado, o aluno tem que ter uma média igual ou acima da nota de aprovação  e ter menos faltas que faltas máximas. Se tiver a mesma quantidade, tem que estar 10% acima da nota de aprovação.*/
    this.verificarAprovacao = (aluno) => {
        if(this.notaAprovacao <= aluno.media() && this.faltasMaxima > aluno.adicionarFalta()){
            return `Aluno ${aluno.nome} aprovado: ${true}`;
        }else if (this.notaAprovacao <= aluno.media() * 1.1 && this.faltasMaxima == aluno.adicionarFalta()){
            return `Aluno ${aluno.nome} aprovado: ${true}`;
        } else {
            return `Aluno ${aluno.nome} aprovado: ${false}`;
        }
    }

/*Crie um método para o objeto curso que percorra a lista de estudantes e retorne um array de booleanos com os resultados se os alunos aprovaram ou não. */
    this.resultadoEstudantes = [];
    this.verificarAprovacaoGeral = () => {
        for(let i in this.listaEstudantes){
            if(this.notaAprovacao <= listaEstudantes[i].media() && this.faltasMaxima == listaEstudantes[i].adicionarFalta()){
                this.resultadoEstudantes.push(`Aluno ${this.listaEstudantes[i].nome} aprovado: ${true}`);
            } else if (this.notaAprovacao <= listaEstudantes[i].media() * 1.1 && this.faltasMaxima == listaEstudantes[i].adicionarFalta()){
                this.resultadoEstudantes.push(`Aluno ${this.listaEstudantes[i].nome} aprovado: ${true}`);
            } else {
                this.resultadoEstudantes.push(`Aluno ${this.listaEstudantes[i].nome} aprovado: ${false}`);
            }
        }
        return this.resultadoEstudantes;
    }

}

let estudante01 = new Alunos("Pedro", 1, [9, 9, 8]);//criando estudantes
let estudante02 = new Alunos("Camila", 0, [10, 10, 8]);//criando estudantes
let estudante03 = new Alunos("Marina", 0, [10, 10, 10]);//criando estudantes

//cursoConstrutor("CTD", 5, 5, new alunosConstrutor.alunosConstrutor("Pedro", 1, [9, 9, 8]), new alunosConstrutor.alunosConstrutor("Camila", 0, [10, 10, 8]), new alunosConstrutor.alunosConstrutor("Marina", 0, [10, 10, 10]));//chamando a função construtora do curso com o custurtor de alunos já no parâmetro*/
//cursoConstrutor("CTD", 5, 5, estudante01, estudante02, estudante03);//chamando a função construtora do curso


let cursoCtd = new Curso("CTD", 5, 2, [estudante01, estudante02]);//chamando a função construtora do curso
cursoCtd.adicionarAlunos(estudante03);
console.log(cursoCtd.verificarAprovacao(estudante02));
console.log(cursoCtd.verificarAprovacaoGeral());

