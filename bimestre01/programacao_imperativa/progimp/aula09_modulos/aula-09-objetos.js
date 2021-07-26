//Aula 09  21/06/21
//Objetos literais 

let carro = {//declarando objeto
    placa: "ADF1234",
    cor:"prata",
    ano: 2021,
    flex: true,
    mostrar: function(){
        return `Características do seu carro novo: \n PLACA: ${this.placa} \n COR: ${this.cor} \n ANO: ${this.ano} \n FLEX: ${this.flex}`;
        //o this especifica que é a propriedade placa desse objeto carro   
    }
}
//imprimindo as propriedades do objeto:
console.log(carro.placa);
console.log(carro.cor);
console.log(carro.ano);
console.log(carro.flex);

//usando o método mostrar do objeto carro:
console.log(carro.mostrar());

