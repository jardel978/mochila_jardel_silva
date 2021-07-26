var prato = "panquecas";

let pessoa = {
    nome: "Jardel",
    idade: 24,
    saudacao: () => (//método do obj pessoa
        `Olá, ${pessoa.nome}. Idade: ${pessoa.idade}`
    ),//arrow coo () e não {} já dá o retorno direto
    envelhecer(anos) {//forma mais simplificada de escrever um método em um objeto
        return pessoa.idade + anos
    },
    prato // é possível pegar uma variável e dar ela como propriedade diretamente ao objeto apenas colocando ela dentro do obj
}
// console.log(pessoa);//obj pessoa sem a propriedade moradia
// pessoa.moradia = "Itaipé";// dando mais uma nova propriedade para o obj pessoa

// console.log(pessoa);//note que a propriedade moradia já está adicionada
// console.log(pessoa.saudacao());//chamando o método saudacao do obj

// delete pessoa.moradia;//deletando uma propriedade do obj
// console.log(pessoa);//note que a propriedade moradia foi deletada

// console.log(pessoa.envelhecer(5));

// console.log(pessoa);//note que a propriedade prato foi dada ao obj pessoa

//Método que junta, transforma mais de um obj em apenas um - Isso recebe o nome de Merge de obj
let pessoa2 = {
    nome2: "Luccas",
    idade2: 29
};

const novoObjNovo = Object.assign({}, pessoa, pessoa2);// as chaves vazias indicam que é para pegar um obj vazio {} e nele colocar a junção dos depois que passarmos como parâmetros. Se não quiser um obj novo, mas apenas jogar um dentro dom outro, é só nao colocar as {vazias} como primeiro parâmetro, mas colocar no lugar delas o obj que deve receber o/os obj subsequentes
console.log(novoObjNovo);
//outra forma usando spred (...)

const novoObjNovo2 = {//um obj novo que recebe os demias obj que queremos juntar com o spread antes do seu nome
    ...pessoa,
    ...pessoa2
}
console.log(novoObjNovo2);

//Getters and Setters em um obj

let clientes = [//array de obj clientes
    {
        nome: "Rita",
        idade: 35
    },
    {
        nome: "Rute",
        idade: 71
    },
    {
        nome: "Roberta",
        idade: 26
    },
    {
        nome: "Rogério",
        idade: 24
    }
];

var usuario = {
    posicao: 0,
    get atual() {//mtd para pegar o cliente do array clientes na posição atual
        //o uso do GET no inicio de cada mtd faz com que não precisemos chamar ele como uma fun= atual(), automáticamente ele já vai chamar e dar o retorno sem passar o parâmetro. GET retorna um valor
        return clientes[this.posicao];
    },
    set atual(posicao) {
        //o mtd set define uma vaalor
        this.posicao = posicao;
    },
    get proximo() {//mtd que vai adicionar mais um para pegar o próximo obj
        ++this.posicao;
    },
    get anterior() {//mtd que vai subtrair um para da posição atual para pegar o anterior 
        --this.posicao;
    },
}

console.log(usuario.atual);
usuario.proximo;
console.log(usuario.atual);
usuario.proximo;
console.log(usuario.atual);
usuario.proximo;
console.log(usuario.atual);
usuario.anterior;
console.log(usuario.atual);
usuario.proximo;
usuario.atual = 1;//vai atribuir o valor 1 à posição por meio do SET. 
console.log(usuario.atual);


