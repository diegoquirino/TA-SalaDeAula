package br.pro.diegoquirino.calculadora.util;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DescontoUtilsTest {

    private DescontoUtils driver;

    @BeforeEach
    void setUp() {
        this.driver = new DescontoUtils();
    }

    @AfterEach
    void tearDown() {
        this.driver = null;
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente A, menor que 100 unidades")
    @Tag("ClienteA")
    void testCalcularFatorDeDescontoClienteAMenor100() {
        double fator = this.driver.calcularFatorDeDesconto("A",99);
        assertEquals(0.90, fator);
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente B, menor que 100 unidades")
    @Tag("ClienteB")
    void testCalcularFatorDeDescontoClienteBMenor100() {
        double fator = this.driver.calcularFatorDeDesconto("B",99);
        assertEquals(0.85, fator);
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente C, menor que 100 unidades")
    @Tag("ClienteC")
    void testCalcularFatorDeDescontoClienteCMenor100() {
        double fator = this.driver.calcularFatorDeDesconto("C",99);
        assertEquals(0.80, fator);
    }

}