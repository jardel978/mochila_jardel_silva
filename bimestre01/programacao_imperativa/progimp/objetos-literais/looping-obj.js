var novoUser = {
    nome: "Jardel",
    idade: 24,
    sexo: "M",
    pais: "Brasil"
}
// //usando for tradicional:
// // var props = Object.keys(novoUser);//armazenando as propriedades do obj - retornará um array
// for (let i = 0; i < props.length; i++){
//     console.log(props[i]);//retonará todos os obj
// }

// //usando for of
// // var props = Object.keys(novoUser);//armazenando as propriedades do obj - retornará um array
// for (let prop of props){
//     console.log("novoUser ", prop);
// }

// //usando for in
// // var prop = Object.keys(novoUser);
for(let prop2 in novoUser){//já retornará diretamente do obj as propriedades, sem ser necessário o mtd Object.keys()
    // console.log(prop2);//(sem valores)
    // console.log(novoUser[prop2]);//(valores das propriedades)
    console.log(prop2, novoUser[prop2])//(chave, valor)    
}

//Existe a possibilidade de um obj criado por mim herdar propriedades de alguma biblioteca quando
//eu estiver fazendo um projeto. Para isso, temos um mtf que verifica se uma propriedade foi realmente criada dentro daquele obj 
//ou se ela foi herdada... .hasOwnProperty(propriedade)

for(let prop3 in novoUser){
    if(novoUser.hasOwnProperty(prop3)){//apenas se a prop3 for realmente criada no obj novoUser e não herdada de outro obj, executa o comnado do if
        console.log(prop3, novoUser[prop3]);
    }
}