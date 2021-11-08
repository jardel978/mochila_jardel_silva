package service;

import dao.imple.DentistaDaoH2Imple;
import junit.framework.TestCase;
import model.Dentista;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnit4.class)
public class newDentistaServiceTest extends TestCase {

        private static DentistaService dentistaService = new DentistaService(new DentistaDaoH2Imple());

        @BeforeClass
        public static void carregarDataSet() {
            Dentista dentista01 = new Dentista("1845675", "Rogério", "Campos");
            Dentista dentista02 = new Dentista("7452135", "Ana", "Oliveira");
            dentistaService.salvar(dentista01);
            dentistaService.salvar(dentista02);
        }

        @Test
        public void cadastrarEBuscarPacienteTest() {
            Dentista dentista = new Dentista("7452135", "Camila", "Ferreira");
            dentistaService.salvar(dentista);
            Assert.assertNotNull(dentistaService.buscar(dentista.getId()));

        }

        @Test
        public void excluirPacienteTest() {
            dentistaService.excluir(1);
            Assert.assertTrue(dentistaService.buscar(1).isEmpty());

        }

        @Test
        public void trazerTodos() {
            List<Dentista> dentistasList = dentistaService.buscarTodos();
            Assert.assertTrue(!dentistasList.isEmpty());
            System.out.println(dentistasList);
        }
}
