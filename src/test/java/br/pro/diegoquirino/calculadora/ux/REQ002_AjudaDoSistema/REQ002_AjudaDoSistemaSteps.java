package br.pro.diegoquirino.calculadora.ux.REQ002_AjudaDoSistema;

import br.pro.diegoquirino.calculadora.ux.pages.AjudaDoSistemaPageObject;
import br.pro.diegoquirino.calculadora.ux.pages.PaginaInicialPageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class REQ002_AjudaDoSistemaSteps extends ScenarioSteps {

    PaginaInicialPageObject initialPage;

    AjudaDoSistemaPageObject page;

    @Step
    public void acesso_pagina_inicial() {
        this.initialPage.acessarPaginaInicial();
    }

}
