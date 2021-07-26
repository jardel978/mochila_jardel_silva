 //Aula 14 - JSON  07/07/21
 const obj =  '{"Domingo" : "Folga", "Segunda" : "Viagem", "Terça"  : "Pagamentos", "Quarta"  : "Piscina",  "Quinta"  : "Churrasco", "Sexta"   : "Carteado", "Sábado"  : "Festa" }';
 // podemos colocar array dentro de um obj JSON
 const frutas = '{"fruta": "banana", "preco": 8.50, "tipo": ["prata", "maçã", "nanica", "da terra"], "origem": "brasil"}'
 console.log(frutas);// imrpimindo JSON
 
 let frutasConvertidasJs = JSON.parse(frutas);
 console.log(frutasConvertidasJs);// imprimindo JSON que foi convertido para JS
//  console.log(frutasConvertidasJs.origem);
