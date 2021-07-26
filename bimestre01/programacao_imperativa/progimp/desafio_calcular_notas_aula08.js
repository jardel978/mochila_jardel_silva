/*
-Crie o objeto de aluno, que consistirá nas seguintes propriedades básicas:
    Nome
    Número do arquivo
    Lista de notas
Gostaríamos de calcular a média do aluno e se o aluno foi aprovado com base na nota de aprovação que será dada. Para este exercício, vamos deixar você pensar sobre todos os métodos e propriedades que podem ser necessários para que nosso programa funcione corretamente da maneira solicitada.*/

let alunoObjeto ={//criado o objeto
    nome: "Rafael",
    numAquivo: 1007,
    listaNotas: [],//array vazio para receber as notas adicionadas
    notas: function(...notas){//metodo com spread operator para receber a quantidade de notas que forem digitadas e adicionar ao array 
        this.listaNotas.push(...notas);
        return this.listaNotas;
    },

    alunos: this.listaNotas,//criando atributo aluno que recebe o array gerado com as notas adicionas
    nome: this.nome,
    calculo: function calculoMedia(nome, alunos, notaMinima){//método que recebe nome do aluno, as notas (array), nota media e faz os calculos 
        let soma = 0;//variável para armazenar a soma - inicia vazia
        for(aluno of alunos){//percorrendo alunos e fazendo a soma
        //FOR IN - percorre os indices | FOR OF - percorre os indices de (alunos), pega cada valor e vai "armazenando" em (aluno)
            soma = soma + aluno;
        }
        let calculo = soma / alunoObjeto.listaNotas.length;//calculando média

        console.log(`**********BOLETIM**********\n Aluno(a): ${nome} \n Número do arquivo: ${alunoObjeto.numAquivo} \n `);
        
        if(calculo >= notaMinima){//condicionais 
            console.log(`Notas: ${alunos}\n Nota mínima para aprovação: ${notaMinima}`);
            console.log(`Muito bem, ${nome}! Você está aprovado(a)! Sua média é: ${calculo} \n`);
        } else{
            console.log(`Notas: ${alunos}\n Nota mínima para aprovação: ${notaMinima}`);
            console.log(`${nome}, infelismente você não foi aprovado(a).  Sua média é: ${calculo} \n`);
        }
    }
}

alunoObjeto.calculo("Fabiana" , alunoObjeto.notas(10, 8, 7, 3), 7);

console.log("*******************************************************");


let lucas = alunoObjeto.calculo("Lucas" ,alunoObjeto.notas(10, 5, 5), 5);
console.log(lucas);
console.log("*******************************************************");

/*
let clotilde = alunoObjeto.calculo("Clotilde" ,alunoObjeto.notas(10, 5, 9, 6, 0 ), 6.5);
console.log(clotilde);
console.log("*******************************************************");

let tiao = alunoObjeto.calculo("Tião" ,alunoObjeto.notas(8 ,8 ,8 , 8, 7), 8);
console.log(tiao);*/


