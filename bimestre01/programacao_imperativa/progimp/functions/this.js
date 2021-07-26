//this = dependendo de onde é usado ele terá um valor

function Usuario() {
    this.nome = "Jardel",
        this.idade = 24,
        this.saudacao = () => (
            this.nome + this.idade
        )
}

var novoUser = new Usuario();// o new é o construtor
console.log(novoUser);
console.log(novoUser.saudacao());

function Personagem(p1, p2, p3) {
    console.log(this);
    console.log(p1, p2, p3);
}
//no mtd call, o primeiro parâmetro será o valor que o this daquela fun a qual ele está sendo invocad vai receber
//do segundo parâmetro em diante, os valores usadaos serão passados para os parâmetros da fun que está invovando o método
var personagemThis = {
    nome: "Rita",
    idade: 15
}
//           será o this  da fun,  serão os valores para os parâmetros da fun...          
Personagem.call(personagemThis, "param1", 18556, [5, 3 ,0]);

//Método apply - mesma característica do call() porém, em vez de passar os parâmetros para a fun separados por (,). 
//eles são passados num array.

Personagem.apply(personagemThis, ["param1", 1784556, [8, 4, 7 ,0]]);

//Método bind - mesma coisa do call() porém, ele não retorna o resultado na hora, apenas faz as "alterações" e deixa lá para quando eu invocar novamente a fun que o recebeu
//MAIS EXPECIFICAMENTE: o bind não invoca a fun, ele retorna uma nova fun da fun em que o usamos
const novoPersonagem = Personagem.bind(personagemThis, "Olá", ", ");
novoPersonagem();//passou a ser uma novo fun. (vai retornar um undefined porque está faltando o terceiro parâmetro que deixei para ex chamando nas prox. linhas do código)
novoPersonagem("Mundo");//passando o 3º parâmetro que não foi passado na chamada do mtd bind (sim, isso é permitido)



