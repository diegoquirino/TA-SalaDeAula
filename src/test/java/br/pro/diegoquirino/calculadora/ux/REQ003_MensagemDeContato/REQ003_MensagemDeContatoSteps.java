package br.pro.diegoquirino.calculadora.ux.REQ003_MensagemDeContato;

import br.pro.diegoquirino.calculadora.ux.pages.MensagemDeContatoPageObject;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertTrue;

public class REQ003_MensagemDeContatoSteps extends ScenarioSteps {

    MensagemDeContatoPageObject page;

    public void informar_nome(String nome) {
        page.preencherNome(nome);
    }

    public void informar_email(String email) {
        page.preencherEmail(email);
    }

    public void informar_tipo_mensagem(String tipo_msg) {
        page.escolherTipoDeMensagem(tipo_msg);
    }

    public void informar_idade(String idade) {
        page.escolherIdade(idade);
    }

    public void informar_mensagem(String texto_msg) {
        page.preencherMensagem(texto_msg);
    }

    public void enviar_mensagem() {
        page.enviar();
    }

    public void verificar_msg_sucesso(String msg) {

        assertTrue(
                page.getConteudo().contains(msg)
        );

    }
}
