let filmes = ["star wars", "clube da luta",  "o poderoso chefão", "top gun",  "interestelar"];
console.log(filmes[1]);//imprimindo o segundo elemento do array filmes

let cartoons = ["toy story", "Procurando Nemo", "kung-fu panda", "wally", "fortnite"];

function adicionandoCartoons(cartoons, filmes){
    for(indice = 0; indice < cartoons.length; indice++){//usando o laço FOR e array cartoons como contador
        filmes.push(cartoons[indice]);//adicionando cada indice ao array filmes
    }
    return filmes;
}

let filmesAtualizados = adicionandoCartoons(cartoons, filmes);//armazenando função na variável filmesAtualizados para tratar ela.
filmesAtualizados.pop();//removendo o último elemento de cartoons
console.log(filmesAtualizados.join());

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9];

function comparaNotas(asiaScores, euroScores){
    if(asiaScores.length == euroScores.length){//condição para garantir que os dois arrays têm a mesma quantidade de elementos para prosseguir
        for(indice = 0; indice < asiaScores.length; indice++){//gerando indices
            var asia = asiaScores[indice];//criando variáveis para armazenar os indices de cada array
            var euro = euroScores[indice];

            if(asia == euro){//condição de igualdade para imprimir true ou false
                console.log(`As notas ${asia} e ${euro} são iguais.`);
            }else{
                console.log(`As notas ${asia} e ${euro} são diferentes.`);
            }
        }
    } 
}
comparaNotas(asiaScores, euroScores);//invocando função
