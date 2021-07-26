function carro(modelo, velocidade){
    this.modelo = modelo;
    this.velocidade = velocidade
    this.alterarVelocidade = function(callback){
        console.log(callback(velocidade))
    }
}

function acelerar(velocidade){
    return velocidade+10;
}
function reduzir(velocidade){
    return velocidade-10;
}

function parar(velocidade){
    return velocidade*0;
}

let gol = new carro("gol", 80);
let ferrari = new carro ("ferrari", 220)
console.log(gol.modelo)
gol.alterarVelocidade(acelerar)
console.log(ferrari.modelo);