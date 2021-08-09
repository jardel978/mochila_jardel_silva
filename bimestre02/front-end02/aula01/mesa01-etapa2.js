/*A secretaria de uma escola contratou a sua empresa para desenvolver sua plataforma de
gestão de alunos, sendo uma dessas partes a criação de um sistema que calcule as notas
obtidas ao longo do semestre, Você e seu grupo fazem parte da equipe responsável por
implementar esta funcionalidade no sistema.
Para isso, crie um script que permita adicionar uma sequência de números (um array de
números) consecutivamente para receber as notas dos 4 bimestres. Após isso, crie uma
estrutura na qual todos os números do array sejam somados sequencialmente: o primeiro
número seja somado ao segundo e o resultado seja impresso no console. Então,
temos que pegar esse resultado e adicionar o terceiro número a ele, e assim por
diante, até terminarmos de percorrer o array. Seguindo a lógica do exemplo a seguir:

Por fim, a soma desses números deve ser dividida pelo total de bimestres (4) para calcular a
média e guardada em uma variável, a qual deve ser exibida no console.
Terminada esta etapa é hora de preparar o código para ficar mais amigável ao usuário final,
com mensagens que informem a nota do aluno e sua condição:
1. Utilizando a função console.log informe a nota que o aluno teve em cada um dos
bimestres e por fim sua nota final. Por exemplo: “Parabéns pela conclusão do primeiro
bimestre. Sua nota foi: 8.”;
2. Após mostrar a nota final, crie uma estrutura de decisão que informe se o aluno foi
aprovado ou não, sendo a média da escola 7.
3. Por fim, comente as etapas do código. */

function Aluno(...notas) {// utilizando Factory
    let aluno = {};
    aluno.notasArray = [];
    aluno.notasArray.push(...notas);
    aluno.media = aluno.notasArray.reduce((acumulador, nota) => {//cálculo de média
        return acumulador + nota;
    }) / aluno.notasArray.length;

    aluno.notaBim = () => {//método para ver notas por bimestre
        console.log("Olá, Aluno! Confira suas notas abaixo:\n")
        for (let i in aluno.notasArray) {
            console.log(`Sua nota no ${parseInt(i) + 1}º Bimestre foi: ${aluno.notasArray[i]}`);
        }
        return `Média: ${aluno.media} \n`
    }

    aluno.status = () => {//método para visualizar aprovação
        if (aluno.media >= 7) {
            return `Aluno aprovado com a média de ${aluno.media}. Parabéns!`
        }
        else {
            return `Média de ${aluno.media} do Aluno insuficiente para a aprovação.`;
        }
    }

    return aluno;
}
let aluno01 = Aluno(10, 8, 8, 5)
console.log(aluno01.notaBim());
console.log(aluno01.status());
// console.log(aluno01.media);// consultando apenas a média do aluno01