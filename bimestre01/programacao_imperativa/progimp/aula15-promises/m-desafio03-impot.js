let promessaObj = require('./m-desafio03-export');

promessaObj.promessa().then((resolve)=> console.log(resolve)).catch((err)=> console.log(err));