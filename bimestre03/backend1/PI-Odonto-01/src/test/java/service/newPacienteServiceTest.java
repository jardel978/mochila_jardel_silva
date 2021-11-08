package service;

import dao.imple.EnderecoDaoH2Imple;
import dao.imple.PacienteDaoH2Imple;
import model.Endereco;
import model.Paciente;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

import java.util.Date;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnit4.class)
public class newPacienteServiceTest {

    private static PacienteService pacienteService = new PacienteService(new PacienteDaoH2Imple(new EnderecoDaoH2Imple()));
    private EnderecoService enderecoService = new EnderecoService(new EnderecoDaoH2Imple());

    @BeforeClass
    public static void carregarDataSet() {
        Endereco endereco = new Endereco("Av. Avenida Eudorado", "444", "Centro", "São Paulo", "SP");
        Paciente p = pacienteService.salvar(new Paciente("Carlos", "Alberto", "88888888", new Date(), endereco));
         Endereco endereco1 = new Endereco("Av. Avenida do Forte", "333", "Santana", "Porto Alegre", "MS");
        Paciente p1 = pacienteService.salvar(new Paciente("Marcela", "Moura", "99999999", new Date(), endereco1));
    }

    @Test
    public void cadastrarEBuscarPacienteTest() {
        Endereco endereco = new Endereco("Av. São João", "123", "Copacabana", "Rio de Janeiro", "RJ");
        Paciente p = pacienteService.salvar(new Paciente("Marcio", "Oliveira", "12345678", new Date(), endereco));
        Assert.assertNotNull(pacienteService.buscar(p.getId()));
    }

    @Test
    public void excluirPacienteTest() {
        pacienteService.excluir(3);
        Assert.assertTrue(pacienteService.buscar(3).isEmpty());

    }

    @Test
    public void trazerTodos() {
        List<Paciente> pacientes = pacienteService.buscarTodos();
        Assert.assertTrue(!pacientes.isEmpty());
//        Assert.assertTrue(pacientes.size() == 2);
        System.out.println(pacientes);
    }


}
