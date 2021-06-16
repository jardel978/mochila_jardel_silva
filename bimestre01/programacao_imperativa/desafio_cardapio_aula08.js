/*Crie uma função construtora chamada Restaurante, que receba como parâmetros o nome do restaurante e o cardápio (que será um array de strings).

Após isso chame a função entrada() dentro do objeto, que irá trazer uma mensagem de boas-vindas, informando o nome do restaurante, e o cardápio.*/
function Restaurante(nome, cardapio){
    this.nome = nome;
    this.cardapio = cardapio;
    this.entrada = function entrada() {//criando e atribuindo à propriedade "entrada" uma fun que é responsável por imprimir a msg com o cardápio 
        return`Seja bem-vindo ao Restaurante "${this.nome}"! Esse é o nosso cardápio de hoje: ${this.cardapio}`;
    }       
}

let cardapioLoja001 = [" Feijão Tropeiro", " Leitão a Pururuca", " Canjiquinha", " Arroz Branco", " Salada."];
let restaurante1 = new Restaurante("O Mineiro - Loja 001", cardapioLoja001);//Instanciando o objeto restaurante1 usando o "MOLDE" "Restaurante". Passando o nome e o array "cardapioLoja001" como valor dos parâmetros.

//------------------------------------------------------------------------------------------------------------------------------------------

let cardapioLoja002 = [" Feijão", " Vaca Atolada", " Macarrão", " Arroz Branco", " Salada."];
let restaurante2 = new Restaurante("O Mineiro - Loja 002", cardapioLoja002);//Instanciando o objeto restaurante2 usando o "MOLDE" "Restaurante". Passando o nome e o array "cardapioLoja003" como valor dos parâmetros.

//------------------------------------------------------------------------------------------------------------------------------------------

let cardapioLoja003 = [" Tutu de Feijão", " Frango c/ Quiabo", " Polenta", " Arroz Branco", " Salada."];
let restaurante3 = new Restaurante("O Mineiro - Loja 003", cardapioLoja003);//Instanciando o objeto restaurante3 usando o "MOLDE" "Restaurante". Passando o nome e o array "cardapioLoja003" como valor dos parâmetros.

//------------------------------------------------------------------------------------------------------------------------------------------
//USANDO O "MOLDE" (OBJETO) PARA INSTANCIAR (CRIAR) NOVOS RESTAURANTES:
console.log(restaurante1.entrada());//chamada da propriedade em que está armazenada a função entrada
console.log("\n");
console.log(restaurante2.entrada());//chamada da propriedade em que está armazenada a função entrada
console.log("\n");
console.log(restaurante3.entrada());//chamada da propriedade em que está armazenada a função entrada

    