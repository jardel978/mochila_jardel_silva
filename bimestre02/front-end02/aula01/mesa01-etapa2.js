/* Terminada esta etapa é hora de preparar o código para ficar mais amigável ao usuário final,
com mensagens que informem a nota do aluno e sua condição:
1. Utilizando a função console.log informe a nota que o aluno teve em cada um dos
bimestres e por fim sua nota final. Por exemplo: “Parabéns pela conclusão do primeiro
bimestre. Sua nota foi: 8.”;
2. Após mostrar a nota final, crie uma estrutura de decisão que informe se o aluno foi
aprovado ou não, sendo a média da escola 7.
3. Por fim, comente as etapas do código. */

function Aluno(...notas) {
    let aluno = {};
    aluno.notasArray = [];
    aluno.notasArray.push(...notas);
    let media = aluno.notasArray.reduce((acumulador, nota) => {
        return acumulador + nota;
    }) / aluno.notasArray.length;

    aluno.notaBim = () => {
        console.log("Olá, Aluno! Confira suas notas abaixo:\n")
        for (let i in aluno.notasArray) {
            console.log(`Sua nota no ${parseInt(i) + 1}º Bimestre foi: ${aluno.notasArray[i]}`);
        }
        return `Média: ${media} \n`
    }

    aluno.status = () => {
        if (media >= 7) {
            return `Aluno aprovado com a média de ${media}. Parabéns!`
        }
        else {
            return `Média de ${media} do Aluno insuficiente para a aprovação.`;
        }
    }

    return aluno;
}
let aluno01 = Aluno(10, 8, 8, 5)
console.log(aluno01.notaBim());
console.log(aluno01.status());