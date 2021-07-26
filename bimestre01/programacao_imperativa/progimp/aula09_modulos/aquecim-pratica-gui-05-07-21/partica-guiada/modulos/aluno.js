
exports.alunosConstrutor = function alunosConstrutor(nome, qtd_faltas, notas){
    this.nome = nome,
    this.faltas = () => {return qtd_faltas + 1;};
    this.notas = notas,
    this.media = ()=> {
        let soma = 0;
        for(let i in notas){
           soma += notas[i];
        }
        let media = soma / this.notas.length;
        return media.toFixed(2);
    }
    // return `\n Aluno: ${nome} \n Notas: ${notas} \n Faltas: ${this.faltas()} \n Média: ${this.media()}`;
    
}

// let aluno = new alunosConstrutor("Pedro", 5, [10, 10, 8]);

// console.log(aluno.media());

