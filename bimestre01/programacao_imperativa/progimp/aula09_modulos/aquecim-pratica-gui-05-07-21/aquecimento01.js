/* 
1. Crie uma variável produtos, que contenha um array de objetos, com no mínimo 3 itens. Dentro da variável, liste produtos disponíveis, informando os seguintes detalhes: Nome do Produto, Valor do Produto, Qualidade do Produto e Status.
A informação Qualidade do Produto deve ser um número que irá de 0 a 10.
A informação Status deve ser um Booleano, indicando se o produto está disponível em estoque.

2. Em seguida, um usuário deseja filtrar os produtos, com base em alguns critérios. Selecione todos os produtos que tenham:

Valor entre 482 e 1600;
Qualidade superior a 6;
Status como disponível.
O resultado do filtro deve ser armazenado na variável carrinho.

3. Por fim, é necessário exibir todos os itens presentes no carrinho, com seus
nomes e preços correspondentes, e no final um valor total, resultante da
somatória de todos os produtos.*/


let produtos = [/* criando array com objetos dentro */

    {
        nome: "Placa Mãe Asus TUF B360M-PLUS",
        valor: 629.00,
        qualidade: 8,
        status: true,
    },
    {
        nome: "Processador INTEL CORE I5-9400F",
        valor: 1049.00,
        qualidade: 9,
        status: true,
    },
    {
        nome: "SSD XPG Gammix S11 PRO",
        valor: 447.90,
        qualidade: 8,
        status: true,
    },
    {
        nome: "Placa de vídeo GTX 960",
        valor: 999.00,
        qualidade: 9,
        status: false,
    }
];

let carrinho = produtos.filter((produto) => {
    if (produto.valor >= 482 && produto.valor <= 1600 && produto.qualidade >= 6 && produto.status === true) {
        return produto;
    }
}
);

let precoTotal = carrinho.reduce((precoProduto, proximoPreco)=> {
    precoProduto.valor + proximoPreco.valor;
});

console.log(carrinho);
console.log(precoTotal);