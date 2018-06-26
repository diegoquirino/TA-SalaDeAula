package br.pro.diegoquirino.calculadora.util;

import br.pro.diegoquirino.calculadora.model.Cliente;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DescontoUtilsTests {

    private DescontoUtils driver;
    private Cliente cli;

    @BeforeEach
    void setUp() {
        this.driver = new DescontoUtils();
        this.cli = new ClienteAStub();
    }

    @AfterEach
    void tearDown() {
        this.driver = null;
        this.cli = null;
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente A, menor que 100 unidades")
    @Tag("ClienteA")
    void testCalcularFatorDeDescontoClienteAMenor100() {
        double fator = this.driver.calcularFatorDeDesconto(this.cli.getTipoCliente(),99);
        assertEquals(0.90, fator);
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente A, maior ou igual a 100 e menor que 1000 unidades")
    @Tag("ClienteA")
    void testCalcularFatorDeDescontoClienteAEntre100e1000() {
        double fator = this.driver.calcularFatorDeDesconto(this.cli.getTipoCliente(),100);
        assertEquals(0.95, fator);
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente A, maior ou igual 1000 unidades")
    @Tag("ClienteA")
    void testCalcularFatorDeDescontoClienteAMaior1000() {
        double fator = this.driver.calcularFatorDeDesconto(this.cli.getTipoCliente(),1000);
        assertEquals(1.00, fator);
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente B, menor que 100 unidades")
    @Tag("ClienteB")
    void testCalcularFatorDeDescontoClienteBMenor100() {
        double fator = this.driver.calcularFatorDeDesconto("B",99);
        assertEquals(0.85, fator);
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente B, maior ou igual a 100 e menor que 1000 unidades")
    @Tag("ClienteB")
    void testCalcularFatorDeDescontoClienteBEntre100e1000() {
        double fator = this.driver.calcularFatorDeDesconto("B",100);
        assertEquals(0.90, fator);
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente B, maior ou igual 1000 unidades")
    @Tag("ClienteB")
    void testCalcularFatorDeDescontoClienteBMaior1000() {
        double fator = this.driver.calcularFatorDeDesconto("B",1000);
        assertEquals(0.95, fator);
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente C, menor que 100 unidades")
    @Tag("ClienteC")
    void testCalcularFatorDeDescontoClienteCMenor100() {
        double fator = this.driver.calcularFatorDeDesconto("C",99);
        assertEquals(0.80, fator);
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente C, maior ou igual a 100 e menor que 1000 unidades")
    @Tag("ClienteC")
    void testCalcularFatorDeDescontoClienteCEntre100e1000() {
        double fator = this.driver.calcularFatorDeDesconto("C",100);
        assertEquals(0.85, fator);
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente C, maior ou igual 1000 unidades")
    @Tag("ClienteC")
    void testCalcularFatorDeDescontoClienteCMaior1000() {
        double fator = this.driver.calcularFatorDeDesconto("C",1000);
        assertEquals(0.90, fator);
    }

}