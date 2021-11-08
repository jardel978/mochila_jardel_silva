package service;


import dao.IDaoGenerico;
import model.Endereco;

import java.util.List;
import java.util.Optional;

public class EnderecoService {

    private IDaoGenerico<Endereco> enderecoIDao;

    public EnderecoService(IDaoGenerico<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco salvar(Endereco endereco){
        enderecoIDao.salvar(endereco);
        return endereco;
    }
    public Optional<Endereco> buscar(Integer id){
        return enderecoIDao.buscar(id);
    }

    public List<Endereco> buscarTodos(){
        return enderecoIDao.buscarTodos();
    }

    public void excluir(Integer id){
        enderecoIDao.excluir(id);
    }

}
