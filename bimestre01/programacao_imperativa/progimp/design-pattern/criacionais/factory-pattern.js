/*Criar umma Factory Function: uma fun que não é um construtor nem um obj mas usada para criar objetos sem muito trabalho*/

// crinado obj pelo método comum
//class:
class Gato {//criando a classe gato
    constructor(nome) {//usando um construtor para cria obj gatos. Meus obj terão as propriedades que eu passar como seus parâmetros
        this.nome = nome;
    }
    usandoNome() {
        return this.nome;
    }
}
const gato01 = new Gato("SNOWBELL");//"construindo o gato01"
console.log(gato01);//imprimindo no console
console.log("--------------------------------------------------------------")

console.log("----------Usando Factory Pattern----------")

//Usando pattern
//com função nomeada:
function fabricaDeGato(nome) {
    let gato = {} //criando o obj gato vazio, pois irá receber os valores que eu quiser quando eu o chamar durante o código para as propriedades dadas a ele na factory
    gato.nome = nome;

    return gato;// retornando o objeto
}

console.log(fabricaDeGato());//imprimindo o obj gato que ainda está vazio
console.log(fabricaDeGato("SNOWBELL02"));//imprimindo o obj gato que recebeu o primeiro nome

let gatoGago = fabricaDeGato("Snow");
let gataGaga = fabricaDeGato("Safira");
let gatoFofo = fabricaDeGato("Simba");
let gatoMagico = fabricaDeGato("Salem");

console.log(gatoGago, gataGaga, gatoFofo, gatoMagico);

console.log("----------Factory Pattern com Arrow----------")

//com arrow fun:

const fazerdorDeGatos = (nome, raca) => {//a Factory fazedorDeGatos recebe um arrow com parâmetros nome e raca
    let gatoFeito = {};//iniciando obj gatoFeito vazio
    gatoFeito.nome = nome;//criando a propriedade nome ao gatoFeito e dizendo que ela receberá o valor do parâmetro nome
    gatoFeito.raca = raca;//criando a propiedade raca e dizendo que ela irá receber o valor do parâmetro passado raca
    gatoFeito.fama = true;//criando a propriedade fama mas já dando um valor padrão a ela aqui dentro. MAS, se 
    //eu acessar essa propriedade pela notação ponto eu consigo alterar o seu valor.
    return gatoFeito;
}
let gatoI = fazerdorDeGatos("Safira", "Persa");
let gatoII = fazerdorDeGatos("Safira", "Persa");
let gatoIII = fazerdorDeGatos("Safira", "Persa");
let gatoVI = fazerdorDeGatos("Safira", "Persa");
gatoVI.fama = false;//alterando o valor dado a propriedade fama do obj que já vem true por padrão

console.log(gatoI, "\n", gatoII, "\n", gatoIII, "\n", gatoVI);

console.log("--------------------------------------------------------------")

//criando obj com mais propriedades e criando métodos para essa factory

const dadosUsuario = (nome, idade, genero, especialidade) => {//crianco a factory em arrow com parâmetros básicos para esse obj
    let usuario = {};//iniciando o obj usuarios vazio
    //criando as propriedades e atribuindo valor dos parâmetros para algumas delas e para outras o valor que eu quiser, inclusive até métodos contidos em variáveis aqui dentro da factory
    usuario.nome = nome;
    usuario.idade = idade;
    usuario.genero = genero;
    usuario.id = Math.random().toFixed(3) * 500;//para gerar números aleatórios
    usuario.especialidade = especialidade;
    usuario.historico = [];//arry vazio para usar quando chamar um método de adicionar um evento que será criado

    let addHistoricoUser = (evento = "Vazio") => {//método para adicionar item na propriedade usuario.historico
        usuario.historico.push(evento);
    };

    const relatorio = () => {//método para ver o relatório de algum usuário
        return `\n Nome: ${usuario.nome}\n Idade: ${usuario.idade}\n Gênero: ${usuario.genero}\n Id: ${usuario.id}\n Especialidade: ${usuario.especialidade} \n Histórico: ${usuario.historico}`;
    };
    //criando as propriedades que receberão os métodos criados para que seus retornos estejam acessíveis/públicos ao obj e possam seu usados
    usuario.addHistoricoUser = addHistoricoUser;
    usuario.relatorio = relatorio;//adicionado assim(sem parenteses) porque ainda são uma variável, porém que recebem uma arrow fun
    return usuario;// no fim: retorna o próprio obj que no inicio foi setado como vazio
}


let claudio = dadosUsuario("Cláudio", 27, "M", "Back End");//criando o obj claudio
// console.log(claudio);
claudio.addHistoricoUser("Admitido na empresa- 2021-07-10");//obj claudio agora tem acesso aos métodos da factory. Chamando o método addHistoricoUser
claudio.addHistoricoUser("Iniciando seu primeiro projeto - 2021-07-12");
// console.log(claudio);

let ester = dadosUsuario("Ester", 43, "F", "UI/UX");//criando o obj ester
ester.addHistoricoUser("Admitida na empresa - 2021-03-12")
ester.addHistoricoUser("Aumento de salário - 2021-07-12")

let marcelo = dadosUsuario("Marcelo", 25, "M", "Fron End");
marcelo.addHistoricoUser("Co-fundador da empresa");

let fernanda = dadosUsuario("Fernanda", 23, "F", "Gerente");
fernanda.addHistoricoUser();//chamando o método addHistoricoUser sem passar o parâmetro. Assim ele vai usar o opcional que dei a ele

console.log(claudio.relatorio());//imprimindo os relatórios gerados após a criação de objetos com a Factory
console.log(ester.relatorio());
console.log(marcelo.relatorio());
console.log(fernanda.relatorio());



