const { cpf } = require('./modulos/node_modules/cpf-cnpj-validator');/* Importando um pacote de modulo externo aqui seguindo o caminho que é expecificado na pg de download do npm.
*/

const novoCpf = cpf.generate();//usando uma das funções do módulo
console.log(novoCpf);

console.log(cpf.isValid(novoCpf));//usando uma das funções do módulo e já dando o console
console.log(cpf.format(novoCpf));//usando uma das funções do módulo e já dando o console
