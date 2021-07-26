
let arrayTaxa = [];
let taxa = 1.10;
let precos = [12.0, 34.0, 56.0, 34.0, 5.0, 8.0, 76.0, 4.0, 1.0, 90.0];

function calcularTaxa (array){
    for(let i = 0; i < array.length; i++){
        let calculo = array[i] * taxa;
        arrayTaxa.push(calculo);
    }
    return arrayTaxa;
}

console.log(calcularTaxa(precos));


