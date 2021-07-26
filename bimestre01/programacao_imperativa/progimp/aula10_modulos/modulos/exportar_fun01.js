//Aula 10 -  23/06/21
//dentro da pasta módulos
//esse exports.ARROWfuntion é uma maneira simplificada de exportar as funções 
exports.somar = (a, b) => a + b;
exports.subtrair = (a, b) => a - b;
exports.multiplicar = (a, b) => a * b;
exports.dividir = (a, b) => {
    if(b != 0){
        return a / b;
    } else{
        return `Ainda desconhecemos a possibilidade de se dividir um número por zero!`
    }
}

//Função LETRA MAIÚCULA

exports.maiuscula = (texto) => console.log(texto.toUpperCase());

