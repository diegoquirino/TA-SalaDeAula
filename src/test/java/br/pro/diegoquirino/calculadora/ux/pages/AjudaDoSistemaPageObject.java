package br.pro.diegoquirino.calculadora.ux.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AjudaDoSistemaPageObject extends PageObject {

    @FindBy(id = "welcome.button.ajuda")
    private WebElement buttonBody;

    @FindBy(xpath = "/html/body/div[1]/div[2]/h1")
    private  WebElement pageTitle;

    @FindAll(@FindBy(xpath = "//h2"))
    private List<WebElement> sections;

    public void acessarButtonBodyAjuda() {
        this.buttonBody.click();
    }

    public String getAjudaPageTitle() {
        return this.pageTitle.getText();
    }

    public boolean existeSecao(String nomeDaSecao) {
        for(WebElement sec : sections) {
            if(sec.getText().equalsIgnoreCase(nomeDaSecao)){
                return true;
            }
        }
        return false;
    }

}
