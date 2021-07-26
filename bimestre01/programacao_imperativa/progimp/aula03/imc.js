function calcularIndiceDeMassaCorporal(nome, idade, altura, massa){
    let alturaCovert = altura/100;
    var calculo = (massa / (alturaCovert * alturaCovert));
    return `${nome} tem ${idade} anos de idade e o seu IMC é: ${calculo}`;
}

console.log(calcularIndiceDeMassaCorporal("Jardel", 24, 170, 66));
console.log(calcularIndiceDeMassaCorporal("Luana", 36, 190, 83));
console.log(calcularIndiceDeMassaCorporal("Camila", 27, 160, 60));
console.log(calcularIndiceDeMassaCorporal("Mayco", 22, 165, 55));








/*var composto = 10;
console.log(composto);
function executando(){
composto++;
var ano = 2;
composto = (composto + ((composto * 0.1)*ano));
console.log(composto);
}

executando();
executando();
executando();*/