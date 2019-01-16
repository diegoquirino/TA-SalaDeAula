package br.pro.diegoquirino.calculadora.ux.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class AjudaDoSistemaPageObject {

    public static void acessarButtonBodyAjuda() {
        $(By.id("welcome.button.ajuda")).click();
    }

    public static String getAjudaPageTitle() {
        return $(By.xpath("/html/body/div[1]/div[2]/h1")).getText();
    }

    public static boolean existeSecao(String nomeDaSecao) {
        for(WebElement sec : $$(By.xpath("//h2"))) {
            if(sec.getText().equalsIgnoreCase(nomeDaSecao)){
                return true;
            }
        }
        return false;
    }

}
