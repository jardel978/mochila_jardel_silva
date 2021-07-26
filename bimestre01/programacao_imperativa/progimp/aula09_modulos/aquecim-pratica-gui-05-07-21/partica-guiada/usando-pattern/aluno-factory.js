
exports.alunosConstrutor = (nome, qtd_faltas, ...notas) => {//criando uma factory para alunos
    aluno = {};
    aluno.nome = nome;
    aluno.faltas = () => qtd_faltas + 1;
    let listaNotas = [];
    listaNotas.push(...notas);
    aluno.notas = listaNotas;

    aluno.media = ()=> {//método para calcular médias
        let soma = 0;
        for(let i in listaNotas){
           soma += notas[i];
        }
        let media = soma / aluno.notas.length;
        return media.toFixed(2);
    }
    return aluno;
}

// let rute = alunosConstrutor("Rute", 3, 10, 10, 10);
// console.log(rute);
// console.log(rute.faltas());
// console.log(rute.media());