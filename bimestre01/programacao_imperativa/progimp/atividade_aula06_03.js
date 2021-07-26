let animais = [" Gato", " Cachorro", " Boi", " Cavalo"," Avestruz"];
for(let indice = 0; indice < animais.length; indice++){
    console.log(animais[indice]);
}

function salvar(animal){
    let animais2 = [];
    animais2.push(animal);
    console.log(`Itém inserido pela função salvar: ${animais2}`);
    return animais2;
}


animais.push(salvar(" Ovelha"));
animais.push(salvar(" Camelo"));
console.log(animais.join());
animais.unshift("Lhama");
console.log(animais.join());