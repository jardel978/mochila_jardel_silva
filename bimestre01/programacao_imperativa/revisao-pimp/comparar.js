let arrayTaxa = [];
let taxa = 1.10;
let  precos = [12.0, 34.0, 56.0, 34.0, 5.0, 8.0, 76.0, 4.0, 1.0, 90.0];

function calcularTaxa(precos){
    for(let i = 0; i < precos.length; i++){
        let calculo = precos[i] * taxa;
        arrayTaxa.push(calculo);
    }    
    console.log(arrayTaxa);
}

calcularTaxa(precos);