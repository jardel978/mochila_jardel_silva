package br.com.dh.odontologia.test.service;

import br.com.dh.odontologia.dao.impl.EnderecoDaoH2;
import br.com.dh.odontologia.dao.impl.PacienteDaoH2;
import br.com.dh.odontologia.model.Endereco;
import br.com.dh.odontologia.model.Paciente;
import br.com.dh.odontologia.service.EnderecoService;
import br.com.dh.odontologia.service.PacienteService;
import org.junit.Assert;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PacienteServiceTest {

    PacienteService pacienteService = new PacienteService(new PacienteDaoH2(new EnderecoDaoH2()));
    EnderecoService enderecoService = new EnderecoService(new EnderecoDaoH2());

    @org.junit.jupiter.api.Test
    void salvar() {
        Endereco enderecoSabrina = new Endereco("Alameda dos Papagaios", "47A", "Jardim de Minas", "Jaboticatubas",
                "MG");
        Endereco enderecoRenato = new Endereco("Rua Oito", "789", "Cidade Nova", "Jaboticatubas", "MG");

        Paciente paciente1 = pacienteService.salvar(new Paciente("Sabrina", "Campos", "MG18756942", new Date(),
                enderecoSabrina));
//
        Paciente paciente2 = pacienteService.salvar(new Paciente("Renato", "Oliveira", "MG20845679", new Date(),
                enderecoRenato));
        System.out.println(paciente1);

    }

    @org.junit.jupiter.api.Test
    void buscar() {
        Endereco endereco = new Endereco("Av. São João", "123", "Canoas", "Prado", "BA");
        Paciente p = new Paciente("Marcio", "Oliveira", "12345678", new Date(), endereco);
        pacienteService.salvar(p);
        System.out.println(p);
        Assert.assertNotNull(pacienteService.buscar(1));
    }

    @org.junit.jupiter.api.Test
    void buscarTodos() {
    }

    @org.junit.jupiter.api.Test
    void excluir() {
    }
}