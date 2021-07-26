//São funções dentro de outras funções. Filhas dentro de pai! Elas deixam o código mais performático pois consomem menos memória (quando a fun pai se encerra as filhas também, já que estão dentro da pai)
//Uma closure tem acesso a todos os parâmetros e variáveis da função Pai sem ter que passá-las como seus parâmetros

function saudacaoPersonalizada(nome){
    let saudacaoGenerica = "Olá, ";
    function saudar(){
        return saudacaoGenerica + " " + nome;
    }
    return saudar();// tem que ter essa chamada da fun filha na fun pai para que o tratamento dela seja retornado
}

console.log(saudacaoPersonalizada("Jardel"));

//-------------------------------------------------------------------------------

function multiplosDefinicao(num1){
    let definicao = "Os múltiplos de um número são todos os resultados possíveis da multiplicação desse número por todos e por cada um dos números naturais. Exemplo de multiplos de 8 entre 0 e " + num1 + ":";
    function operacao(){
        const lista = [];
        for(let i = 0; i <= num1; i++){
            if(i % 8 == 0){
            lista.push(i);   
            }
        }
        return definicao + " " + lista;
    }
    return operacao();
}

console.log(multiplosDefinicao(500));
