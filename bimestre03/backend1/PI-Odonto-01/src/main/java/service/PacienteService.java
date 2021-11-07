package service;

import dao.IDaoGenerico;
import model.Paciente;

import java.util.List;
import java.util.Optional;

public class PacienteService {

    private IDaoGenerico<Paciente> pacienteIDao;

    public PacienteService(IDaoGenerico<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente salvar(Paciente paciente){
        pacienteIDao.salvar(paciente);
        return paciente;
    }

    public Optional<Paciente> buscar(Integer id){
        return pacienteIDao.buscar(id);
    }

    public List<Paciente> buscarTodos(){
        return pacienteIDao.buscarTodos();
    }

    public void excluir(Integer id){
        pacienteIDao.excluir(id);
    }
}
