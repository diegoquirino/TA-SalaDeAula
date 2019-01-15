package br.pro.diegoquirino.calculadora.ux.Compartilhados;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class CompartilhadosGWT {

    @Steps
    CompartilhadosSteps steps;

    @Dado("^que estou na página inicial do sistema$")
    public void que_estou_na_página_inicial_do_sistema() {
        steps.acesso_pagina_inicial();
    }

    @Quando("^clico no menu de acesso à funcionalidade atual$")
    public void clico_no_menu_de_acesso_à_funcionalidade_atual(DataTable tabela) throws Exception {
        Map<String, String> dados = tabela.asMap(String.class, String.class);

        steps.acesso_a_funcionalidade_do_sistema(dados.get("menu"));
    }

}
