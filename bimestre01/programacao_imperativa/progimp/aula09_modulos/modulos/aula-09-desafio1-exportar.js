function climaHoje(clima){

    switch(clima){
        case "verao":
           console.log("Que calor hein?!");
            break;
        case "inverno":
           console.log("Frio dms!");
            break;
        case "outono":
           console.log("É a estação em que as folhas caem!");
            break;
        case "primavera":
           console.log("O momento em que as flores crescem!");
            break;
            default:
            console.log("Ops, estação inválida!");
    }
}
module.exports = climaHoje;//NÃO PRECISA DE PARENTESES AQUI!!!!