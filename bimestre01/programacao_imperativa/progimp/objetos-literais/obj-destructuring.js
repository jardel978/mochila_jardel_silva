var novoUser = {
    nome: "Jardel",
    idade: 24,
    pais: "Brasil"
};
//chamando propriedades pela nortação ponto (tradicional)
console.log(novoUser.nome);
console.log(novoUser.idade);
console.log(novoUser.pais);
console.log("\n--------------------------------------------------------");

// usando destructuring

var {nome, idade, pais} = novoUser;
//pegando as propriedades nome, idade e pais do obj (=) novoUser
console.log(nome, idade, pais);
//caso queira mudar armazenar a propriedade numa variável de nome diferente, coloque a propriedade a ser pega dois pontos e o novo nome que será dado a variável que a receberá
var {nome: primeiroNome, idade: anos, pais: moradia} = novoUser;
console.log(primeiroNome, anos, moradia);
// com o destructuring é óssível extrair até propriedades de obj que estão dentro de vários outros obj

var novoUser2 = {
    nome: {
        nome2: "Aslam",
        sobrenome: "Lobo"
    }
}
//extraindo a prop. nome2 do obj nome que está dentro do obj novoUser2
var {nome: {nome2}} = novoUser2;
console.log(nome2);
//é possível dar valores por default(tipo parâmnetros opcionais) para a extração de um prop.
//ou seja, se a prop não existir ou não der seu valor, o opcional dado será usado

var {nome: {raca = "Husky Siberian"}} = novoUser2;
console.log(raca);// raca não existe no novoUser2,  mas como foi passado como opcional, vai ser atribuido à ela esse valor
//esse valor default pode ser um obj, array, string, num ... Se houver uma prop no obj, vai pegar o valor dela
console.log("\n");

//Destructurig pode ser usado também como parâmetro de uma fun
//podemos ter uma fun que vai receber um obj como parâmetro e usarmos o destructuring na chamada da fun
//no parâmetro para, digamos, usar certa propriedade desse obj como o parâmetro

function imprimirUser(usuario) {
    console.log(usuario.nome);
    console.log(usuario.idade);
    console.log(usuario.sexo);
    
}
var usuarioFun = { 
    nome: "Eliane",
    idade: 42,
    sexo: "F"
}

imprimirUser(usuarioFun);//jogando o obj como parâmetro da fun

console.log("\n Com destructuring no parâmetro:");

function imprimirUser({nome, idade, sexo}) {//em vez de colocar o obj usuario eu já coloco suas propriedades dentro do destructurig como parâmetro
//quando chamar a fun com o obj como parâmetro, vai pegar justamente as prop. que estâo no destructuring. Podemos dar valores padrões/default/opcionais nesse destructuring
//bem como adicionar novas prop. ex: {..., pais = "Brasil"}. Se o obj tiver essa prop. pegará o valor dela, se não, vai usar o default
    console.log(nome);
    console.log(idade);
    console.log(sexo);  
}

imprimirUser(usuarioFun);//jogando o obj como parâmetro da fun
console.log("\nMais métodos de obj:");

//Mais métodos de obj:
//Object.Keys(obj desejado): esse mtd retorna um array com todas as chaves(nomes das prop) do obj dado como parâmetro
console.log(Object.keys(usuarioFun));
//Object.values(): retornará um array com os valores das propriedades desse obj
console.log(Object.values(usuarioFun));
//tem mais 



