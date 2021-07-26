function podeSubir(altura,estaAcompanhada){
    if(altura > 1.40 && altura < 2.0){
        return true;
    }else if(altura < 1.40 && altura > 1.20 && estaAcompanhada == true){
        return true;                  
    }else{
        return false;
    }
}

/*console.log(podeSubir(1.5, true));
console.log(podeSubir(1.39, true));
console.log(podeSubir(1.39, false));
console.log(podeSubir(1.19, true));
console.log(podeSubir(2.0, true));*/

var subir = podeSubir(1.5, true);
console.log(`Pode subir no brinquedo: ${subir}`);
var subir = podeSubir(1.39, true);
console.log(`Pode subir no brinquedo: ${subir}`);
var subir = podeSubir(1.39, false);
console.log(`Pode subir no brinquedo: ${subir}`);
var subir = podeSubir(1.19, true);
console.log(`Pode subir no brinquedo: ${subir}`);
var subir = podeSubir(2.0, true);
console.log(`Pode subir no brinquedo: ${subir}`);