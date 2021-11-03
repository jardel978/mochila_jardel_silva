import ClassComponent from '../components/ClassComponent';
import FunctionComponent from '../components/FunctionComponent';
import Aluno from '../aluno';

import '../styles/App.css';

function App() {



  return (
    <div className="App">
     
    {
      Aluno.getAlunosList.map((aluno, index) => {
        return (
          <div className="aluno__item">
              <h3>Convidado:</h3>
              <ClassComponent key={index} nome={aluno.firstName} estaNaLista={aluno.naLista} />
              <h3>Tarefa:</h3>
              <FunctionComponent key={index} nome={aluno.firstName} tarefa={aluno.tarefa} naLista={aluno.naLista}/>
              <br/>
          </div>
        )})
    }

   </div>
    );
}

export default App;
