// 2º Checkpoint - 28/06/2021

function menuMicroondas(opcao1, tempoAlterado) {
    this.opcao1 = opcao1;
    this.tempoAlterado = tempoAlterado;
    if (opcao1 == 1) {
        tempoDoPrato = 10;
        identidadeDoPrato = "Pipoca"
    } else if (opcao1 == 2) {
        tempoDoPrato = 8;
        identidadeDoPrato = "Macarrão"
    } else if (opcao1 == 3) {
        tempoDoPrato = 15;
        identidadeDoPrato = "Carne"
    } else if (opcao1 == 4) {
        tempoDoPrato = 12;
        identidadeDoPrato = "Feijao"
    } else if (opcao1 == 5) {
        tempoDoPrato = 8;
        identidadeDoPrato = "Brigadeiro"
    } else {
        return "Erro: selecione um prato válido!"
    }
    prato = identidadeDoPrato;

    this.pipoca = function (tempoDoPrato = 10){
        this.validarTempo(tempoDoPrato);
        return pipoca();}
    
    this.macarrao = function (tempoDoPrato = 8){
       this.validarTempo(tempoDoPrato);
        return macarrao();}
    
    this.carne = function (tempoDoPrato = 15){
         this.validarTempo(tempoDoPrato);
        return carne();}
    
    this.feijao = function (tempoDoPrato = 12){
         this.validarTempo(tempoDoPrato);
        return feijao();}
    
    this.brigadeiro = function (tempoDoPrato = 8){
         this.validarTempo(tempoDoPrato);
        return brigadeiro();}
    
    this.validarTempo = function validarTempo(tempoDoPrato) {

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

let fazerPipoca = new menuMicroondas
console.log(new menuMicroondas(1,))


// console.log(new menuMicroondas(1, pipoca()));
// console.log("-------------------------------------")
// console.log(ligarMicroondas(2, 17));
// console.log("-------------------------------------")
// console.log(ligarMicroondas(3, 15));
// console.log("-------------------------------------")
// console.log(ligarMicroondas(4, -2));
