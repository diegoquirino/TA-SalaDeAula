package br.pro.diegoquirino.calculadora.ux.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;

public class PaginaInicialPageObject extends PageObject {

    public void acessarPaginaInicial(){
        // Passando o driver de execução para o Selenide
        WebDriverRunner.setWebDriver(((WebDriverFacade)this.getDriver()).getProxiedDriver());
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Selenide.open("http://diegoquirino.pro.br/calculadora");
    }

}
