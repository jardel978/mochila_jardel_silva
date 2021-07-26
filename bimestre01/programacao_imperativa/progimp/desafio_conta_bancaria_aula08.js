/*Desafio 01 para aula 08
-Defina um novo objeto ‘conta’ que contenha as seguintes propriedades:
    Número de conta
    Saldo
    Nome do Titular
-Crie um método chamado ‘depósito’ que tem a quantidade de dinheiro como parâmetro de entrada. Ao fazer um depósito, a quantia em dinheiro deve ser adicionada ao saldo existente. O método também deve imprimir na tela o tipo de transação realizada e o novo saldo.
-Crie um novo método chamado saque, como o método de depósito, deve consistir em um parâmetro numérico que será a quantia de dinheiro que queremos sacar. Esta quantia será subtraída do saldo existente. Caso o valor do saque seja superior ao saldo disponível, deve-se imprimir na tela a mensagem “Fundos Insuficientes”, caso contrário deve-se imprimir o tipo de transação realizada e o novo saldo.
-Crie uma função construtora de nosso objeto de conta.
-Instancie os objetos com diferentes valores iniciais e teste os métodos.*/

let conta ={
    numeroConta: "456321-0",
    saldo: 0,
    nomeTitular: "Jardel Silva",
    deposito: function(dinheiro){//metodo deposito
        if(dinheiro < 0){
            console.log("Erro! V")
        }
        novoSaldo = this.saldo + dinheiro;
        this.saldo = novoSaldo;//atualizando o valor do saldo dando ao this.saldo(saldo do obj) o valor do novoSaldo
        console.log(`Operação realizada: Depósito. \n Valor: ${dinheiro} dólares. \n Novo saldo em conta: ${novoSaldo} dólares.\n`);
    },
    saque: function(dinheiro){//metodo saque
        if(this.saldo >= dinheiro && dinheiro > 0){//condicional para realizar a operação no saldo
            novoSaldo = this.saldo - dinheiro;
            this.saldo = novoSaldo;//atualizando o valor do saldo dando ao this.saldo(saldo do obj) o valor do novoSaldo calculado
            console.log(`Operação realizada: Saque. \n Valor: -${dinheiro} dólares. \n Novo saldo em conta: ${novoSaldo} dólares.\n`);
        }else{
            console.log(`Saque no valor de ${dinheiro} dólares CANCELADO: Fundos Insuficientes!\n Saldo disponível para saque: ${this.saldo} dólares.\n`);
        }
    }
}

console.log(`**********YouBank********** \n Nº da conta: ${conta.numeroConta} \n Nome do Titular: ${conta.nomeTitular}\n`);

let operacao1 = conta.saque(100);
let operacao2 = conta.deposito(1000);
let operacao3 = conta.saque(900);
let operacao4 = conta.saque(150);
let operacao5 = conta.saque(100);
let operacao6 = conta.deposito(7000000000);
let operacao7 = conta.saque(1000000);
