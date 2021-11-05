package br.com.dh.odontologia.service;

import br.com.dh.odontologia.dao.IDao;
import br.com.dh.odontologia.model.Endereco;

import java.util.List;
import java.util.Optional;

public class EnderecoService {

    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco salvar(Endereco endereco) {
        return enderecoIDao.salvar(endereco);
    }

    public Optional<Endereco> buscar(Integer id) {
        return enderecoIDao.buscar(id);
    }

    public List<Endereco> buscarTodos() {
        return enderecoIDao.buscarTodos();
    }

    public void excluir(Integer id) {
        enderecoIDao.excluir(id);
    }

}
