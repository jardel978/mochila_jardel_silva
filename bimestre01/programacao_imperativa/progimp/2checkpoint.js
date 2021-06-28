/*2º Checkpoint - 28/06/2021 - Jardel Silva Oliveira
 Olá, você foi contratado para executar este projeto. É importante que você analise, entenda o pedido do cliente e desenvolva conforme solicitado. Veja abaixo os requisitos do projeto:

- Precisamos desenvolver um menu para um microondas super veloz, onde teremos 5 opções de comida com seus respectivos tempos pré-definidos. 

      1 - Pipoca – 10 segundos (padrão);
      2 - Macarrão – 8 segundos (padrão);
      3 - Carne – 15 segundos (padrão);
      4 - Feijão – 12 segundos (padrão);
      5 - Brigadeiro – 8 segundos (padrão); 

- O usuário poderá alterar o tempo padrão, aumentando ou diminuindo de acordo com sua vontade. Se o tempo informado for maior que 2x o necessário, exibir mensagem que a comida queimou.
- Se o tempo for menor que o padrão, exibir a mensagem: "tempo insuficiente"; 
- Opções não listadas no menu, devem exibir uma mensagem de erro: "Prato inexistente";
- Se o tempo for 3x maior que o necessário para o prato, o microondas deve exibir a mensagem: “kabumm”;
- No final de cada tarefa, o microondas deverá exibir a mensagem: "Prato pronto, bom apetite!!!". */

console.log("Selecione uma opção: \n \n Pipoca = 1 \n Macarrao = 2 \n Carne = 3 \n Feijao = 4 \n Brigadeiro = 5 \n \n");

function ligarMicroondas(opcao, tempoAlterado) {
    //definindo as opções e os valores que receberão cada variável
    if (opcao == 1) {
        tempoDoPrato = 10;
        identidadeDoPrato = "Pipoca"
    } else if (opcao == 2) {
        tempoDoPrato = 8;
        identidadeDoPrato = "Macarrão"
    } else if (opcao == 3) {
        tempoDoPrato = 15;
        identidadeDoPrato = "Carne"
    } else if (opcao == 4) {
        tempoDoPrato = 12;
        identidadeDoPrato = "Feijao"
    } else if (opcao == 5) {
        tempoDoPrato = 8;
        identidadeDoPrato = "Brigadeiro"
    } else {
        return "Erro: selecione um prato válido!"
    }
    prato = identidadeDoPrato;

    function validarTempo() {

        if (tempoAlterado >= tempoDoPrato && tempoAlterado < tempoDoPrato * 2) {
            return `Prato selecionado: ${prato} \n O prato ${prato} está pronto. Bom apetite!!! :)`
        } else if (tempoAlterado >= tempoDoPrato * 2 && tempoAlterado < tempoDoPrato * 3) {
            return `Prato selecionado: ${prato} \n Seu prato: ${prato} Queimou! :(`;
        } else if (tempoAlterado >= tempoDoPrato * 3) {
            return "Prato selecionado: ${prato} \n kabumm!!! x_x Eeeee, Morreu!";
        } else if (tempoAlterado < tempoDoPrato) {
            return `Prato selecionado: ${prato} \n Tempo insuficiente para a preparação do(a): ${prato}`;
        }
    }
    return validarTempo();
}
console.log(ligarMicroondas(1, 19));
console.log("-------------------------------------")
console.log(ligarMicroondas(2, 17));
console.log("-------------------------------------")
console.log(ligarMicroondas(3, 15));
console.log("-------------------------------------")
console.log(ligarMicroondas(4, -2));
console.log("-------------------------------------")
console.log(ligarMicroondas(5, 15));
console.log("-------------------------------------")
console.log(ligarMicroondas(1, 20));
console.log("-------------------------------------")
console.log(ligarMicroondas(2, 7));




