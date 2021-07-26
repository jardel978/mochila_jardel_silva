function conta(numeroConta,saldo,nomeTitular){
    this.numeroConta= numeroConta;
    this.saldo= saldo;
    this.nomeTitular= nomeTitular;
    this.deposito= function(dinheiro){//metodo deposito
        if(dinheiro < 0) return console.log("Erro dinheiro negativo")
        novoSaldo = this.saldo + dinheiro;
        this.saldo = novoSaldo;//atualizando o valor do saldo dando ao this.saldo(saldo do obj) o valor do novoSaldo
        console.log(`${this.nomeTitular}: Operação realizada: Depósito. \n Valor: ${dinheiro} dólares. \n Novo saldo em conta: ${novoSaldo} dólares.\n`);
    };
    this.saque= function(dinheiro){//metodo saque
        if(this.saldo >= dinheiro && dinheiro>0){//condicional para realizar a operação no saldo
            novoSaldo = this.saldo - dinheiro;
            this.saldo = novoSaldo;//atualizando o valor do saldo dando ao this.saldo(saldo do obj) o valor do novoSaldo calculado
            console.log(`${this.nomeTitular}:Operação realizada: Saque. \n Valor: -${dinheiro} dólares. \n Novo saldo em conta: ${novoSaldo} dólares.\n`);
        }else{
            console.log(`Saque no valor de ${dinheiro} dólares CANCELADO: Fundos Insuficientes!\n Saldo disponível para saque: ${this.saldo} dólares.\n`);
        }
    }
    this.extrato =  x => console.log(`\n${this.nomeTitular} seu Saldo: ${this.saldo}`)
    this.transferencia = function(valor,conta){
        this.saque(valor);
        conta.deposito(valor);
    }
    
}

const contaJardel= new conta("456321-0",0,"Jardel Silva")
const contaRodrigo= new conta("12323-0",200,"Rodrigo")

console.log("---------------- Nova consulta ----------\n")
contaJardel.deposito(300)

contaJardel.transferencia(100,contaRodrigo)
