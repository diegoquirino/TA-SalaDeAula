package br.pro.diegoquirino.calculadora.ux.REQ002_AjudaDoSistema;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class REQ002_AjudaDoSistemaGWT {

    @Steps
    REQ002_AjudaDoSistemaSteps steps;

    @Dado("^que estou na página inicial do sistema$")
    public void que_estou_na_página_inicial_do_sistema() {
        steps.acesso_pagina_inicial();
    }

    @Entao("^verifico que estou na página correta$")
    public void verifico_que_estou_na_página_correta(DataTable tabela) throws Exception {
        Map<String, String> dados = tabela.asMap(String.class, String.class);

        steps.verifico_estou_ajuda_do_sistema(
                dados.get("titulo"),
                dados.get("secao")
        );
    }
}
