const { cpf, cnpj } = require('./modulos/node_modules/cpf-cnpj-validator');

const gerandoCpf = cpf.generate();
const cpfFormatado = cpf.format(gerandoCpf);
console.log(cpfFormatado);

const meuCnpj = cnpj.generate();
console.log(meuCnpj);