package br.pro.diegoquirino.calculadora.ux.REQ003_MensagemDeContato;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class REQ003_MensagemDeContatoGWT {

    @Steps
    REQ003_MensagemDeContatoSteps steps;

    @Quando("^preencho os dados no formulário de contato$")
    public void preencho_os_dados_no_formulário_de_contato(DataTable tabela) {
        Map<String, String> dados = tabela.asMap(String.class, String.class);

        steps.informar_nome(dados.get("nome"));
        steps.informar_email(dados.get("email"));
        steps.informar_tipo_mensagem(dados.get("tipo_msg"));
        steps.informar_idade(dados.get("idade"));
        steps.informar_mensagem(dados.get("texto_msg"));

    }


    @Quando("^submeto o formulário de mensagem de contato$")
    public void submeto_o_formulário_de_mensagem_de_contato() throws Exception {
        steps.enviar_mensagem();
    }

    @Entao("^verifico que a mensagem de sucesso foi exibida$")
    public void verifico_que_a_mensagem_de_sucesso_foi_exibida(DataTable tabela) throws Exception {
        Map<String, String> dados = tabela.asMap(String.class, String.class);

        steps.verificar_msg_sucesso(dados.get("msg"));

    }

}
