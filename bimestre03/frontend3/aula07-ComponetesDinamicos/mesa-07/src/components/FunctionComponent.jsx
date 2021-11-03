import React from 'react'

const FunctionComponent = ({nome, tarefa, naLista}) => {
  if(naLista){
    return (<li>{nome} trará {tarefa}</li>)
  }
  else {
    return (<li style={{backgroundColor: "#f015"}}>{nome} não trará {tarefa} pois não foi convidado</li>)
  }
}

export default FunctionComponent