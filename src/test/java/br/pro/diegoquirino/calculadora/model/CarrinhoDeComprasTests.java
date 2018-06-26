package br.pro.diegoquirino.calculadora.model;

import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(EasyMockExtension.class)
public class CarrinhoDeComprasTests extends EasyMockSupport{

	// 1. Criar os Mocks
	@Mock
	private Produto produto;
	@Mock
	private Cliente cliente;
	
	@TestSubject // 2. Escolher a classe que sera testada (alvo do teste)
	private final CarrinhoDeCompras driver = new CarrinhoDeCompras();
	
	@Test
	@DisplayName("Calcular o VALOR DO PRODUTO após aplicado o fator de desconto para o Cliente A, menor que 100 unidades")
	@Tag("ClienteA")
	public void testCalcularValorComDescontoDoProduto_QuandoClienteAMenor100() {
		// 3. Configurar o estado inicial dos objetos
		EasyMock.expect(this.cliente.getTipoCliente()).andReturn("A");
		EasyMock.expect(this.produto.getValor()).andReturn(1000.00);
		// 4. Gravar os estados atuais dos objetos
		replayAll(); 
		
		// 5. Testar
		this.driver.setCliente(this.cliente);
		this.driver.addProduto(this.produto, 99);
		double valorComDesconto = this.driver.calcularValorComDesconto(this.produto);
		assertEquals(900.00, valorComDesconto);
		// 6. Verificar que tudo o que era necess�rio para testar foi chamado		
		verifyAll();
	}

}