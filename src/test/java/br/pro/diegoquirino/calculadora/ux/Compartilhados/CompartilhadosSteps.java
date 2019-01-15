package br.pro.diegoquirino.calculadora.ux.Compartilhados;

import br.pro.diegoquirino.calculadora.ux.EyesSingleton;
import br.pro.diegoquirino.calculadora.ux.pages.CompartilhadosPageObject;
import br.pro.diegoquirino.calculadora.ux.pages.PaginaInicialPageObject;
import com.applitools.eyes.RectangleSize;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.webdriver.WebDriverFacade;

public class CompartilhadosSteps extends ScenarioSteps {

    PaginaInicialPageObject initialPage;

    CompartilhadosPageObject page;

    @Step
    public void acesso_pagina_inicial() {
        this.initialPage.acessarPaginaInicial();
        EyesSingleton.simpleCheck((WebDriverFacade) this.getDriver(),
                "Acesso à página inicial",
                "pagina.inicial");
    }

    @Step
    public void acesso_a_funcionalidade_do_sistema(String linkText) {
        switch (linkText){
            case "Ajuda" :
                page.acessarLinkMenuAjuda();
                EyesSingleton.simpleCheck((WebDriverFacade) this.getDriver(),
                        "Acesso à funcionalidade de AJUDA",
                        "pagina.ajuda");
                break;
            case "Contato" :
                page.acessarLinkMenuContato();
                EyesSingleton.simpleCheck((WebDriverFacade) this.getDriver(),
                        "Acesso à funcionalidade de CONTATO",
                        "pagina.contato");
                break;
        }
    }

}
