/*Crie um objeto aluno que tenha como atributos: nome (string), quantidade de faltas (number) e notas (array de números). Crie um construtor para ele e importe-o como o módulo aluno.
*/

function Alunos(nome, faltas, notas) {
    this.nome = nome;
    this.faltas = faltas;
    this.notas = notas;
    /*Nosso objeto aluno terá o método calcularMedia que retorna a média de suas notas. Também terá um método chamado faltas, que simplesmente aumenta o número de faltas em 1. */
    this.media = () => {
        let resultado = this.notas.reduce((a, b) => a + b) / this.notas.length;
        return resultado;
    }
    this.adicionarFalta = () => this.faltas += 1;
}


module.exports = Alunos;



// let ruan = new Alunos("Ruan", 1 , [10, 4, 10]);
// console.log(ruan);
// console.log(ruan.adicionarFalta());





// let alunosConstrutor = function Alunos(nome, faltas, notas) {
//     this.notas = notas,
//     this.nome = nome,
//     this.faltas = faltas,
//     this.media = () => {
//          let resultado = this.notas.reduce((a, b) => a + b)/soma / this.notas.length;
//         return resultado;
//         }
//     this.adicionarFalta = () => {
//         return this.faltas++;
//     }
// }
