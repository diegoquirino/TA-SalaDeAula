package br.pro.diegoquirino.calculadora.ux.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompartilhadosPageObject extends PageObject {

    @FindBy(id = "index.navlink.ajuda")
    private WebElement linkMenuAjuda;

    @FindBy(id = "index.navlink.contato")
    private WebElement linkMenuContato;


    public void acessarLinkMenuAjuda() {
        this.linkMenuAjuda.click();
    }

    public void acessarLinkMenuContato() {
        this.linkMenuContato.click();
    }

}
