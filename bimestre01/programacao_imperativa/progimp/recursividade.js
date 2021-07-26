//É chamar a função dentro dela mesmo, criando algo parecido com um loop. É importante sempre ter uma condição para encerramento da função para ela não ficar infinitamente rodando.
function decrescente(numero){
    console.log(numero);
    numero--;
    if(numero > 0){//enquanto o numero for maior que 0 ela vai ser "ré-invocada"
        decrescente(numero);//invocando novamente a própria fun até que atinja a condição e pare!
    }
}
decrescente(50);
console.log( `\n*****************************`);
//----------------------------------------------------------------------
//micro desafios aula 07
/*Criar uma função que calcula o fatorial usando loop (for);*/ 
function calcularFatorial(num3){
    let fatorial = num3;
    for(let a = 1; a < num3; a++){
     fatorial = fatorial * a;//fatorial começa com num3 * a (1), o valor dessa operação será * pelo a++(2) e assim sucessivamente
    }
    console.log(fatorial);
}
calcularFatorial(5);

//Recriar esta mesma função usando recursividade (sem o uso de for)

function fatorialRecursividade(num4){
    if(num4 == 0){
        return 1;
    }else{
    return num4 * fatorialRecursividade(num4 - 1);
    }
}
console.log(fatorialRecursividade(5));