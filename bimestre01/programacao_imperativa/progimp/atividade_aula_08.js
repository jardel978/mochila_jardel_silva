//Aula 08 - 16/06/2021
//preços compra= 280, 330, 1500, 3300
//taxa de lucro = 50%
//rotina para calcular o preço de venda
//lista de valores de custo produtos
//lista preço de venda

let valorCusto = [];
let valorVenda = [];
let margemLucro = 50;//% de lucro visada (será / 100 para ser multiplicada)
function precoFinal(...parametros) {
    valorCusto.push(...parametros);//adicionando cada preço que for passado como parâmetro aos valoresCusto.
//spread é muito útil para "quebrar" um array
    for (let indice = 0; indice < valorCusto.length; indice++) {
        console.log("O preço de compra do item " + indice + " é: " + valorCusto[indice]);//imprimindo valor de cada item (valorCusto)

        let calculoLucro = valorCusto[indice] + (valorCusto[indice] * (margemLucro / 100));//calculando %

        valorVenda.push(calculoLucro);//adicionando cada calculo do preço de venda no valorVenda

        console.log(`Para ter uma margem de lucro de ${margemLucro} % o preço de venda do item ${indice} deve ser: ${valorVenda[indice]}`);
        console.log("\n*****************");
    }
}

precoFinal(280, 330, 1500, 3300);





//outro ex: "quebrando" um array com o spread

function somar(x, y, z){
    return x + y + z;
}
const numeros = [10, 20 ,30];
console.log(`Total...........: ${somar(...numeros)}`); //usando o conteúdo do array números como parâmetros
// o tramanho que for esse array vai ser a quantidade de parâmetros para a função
console.log(`Maior número.........: ${Math.max(...numeros)}`);//método Math para dar número máximo
console.log(`Menor número.........: ${Math.min(...numeros)}`);//método Math para dar número máximo

const nome = ["Jardel", "Aslam"];
console.log(...nome);//varrendo e "quebrando" o arrey de strings também

