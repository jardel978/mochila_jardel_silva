//Aula 14 - JSON  07/07/21

/*JSON: uma arquitetura de texto simples muito usada na web pois troca dados com mais leveza
entre diferentes sistemas.
Sua sintaxe não aceita quebra de linha(pular um linha/dar enter) - Porém, se selcionar a linguagem JSON lá na barrinha 
azul inferior do VS. (DETALHE: o arquivo tem que conter apenas JSON. ex= aqui não funcionaria pois tem JSON e JS*/

 // ÁSPAS SIMPLES e as chaves entre e os elementos entre áspas dulas, separados por vírguçla. O último não usa vírgula
//desserialização ou parsing
const txt = '{"domingo" : "Folga", "segunda" : "Viagem","terça"   : "Pagamentos","sexta"   : "Carteado"}';
const convertendo = JSON.parse(txt);//usando o método JSON.parse para passar o JSON para JS e armazenando na "const convertendo"
console.log(convertendo);

//serialização: pega o JS  e passa para JSON
let novoDadoJson = JSON.stringify(txt);// convertendo o JS para JSON
console.log(novoDadoJson);

let objetoLiteral = {materia: "Prog. Imp", professor: "William"};
objetoLiteral.professor = objetoLiteral.professor.toUpperCase();// aplicando na propriedade, assim ela será alterada no obj.
console.log(objetoLiteral);

// const importandoObg01 = require('./obj01.txt');

// let lendoJson = importandoObg01.readFileSync('obj01.txt', 'utf-8');

// let txt = JSON.parse(lendoJson);

// console.log(txt);

