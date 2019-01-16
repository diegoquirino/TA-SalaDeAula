package br.pro.diegoquirino.calculadora.ux.pages;

import static com.codeborne.selenide.Selenide.*;

import net.serenitybdd.core.annotations.findby.By;
import static com.codeborne.selenide.Condition.*;

public class CompartilhadosPageObject {

    public static void acessarLinkMenuAjuda() {
        $(By.id("index.navlink.ajuda")).shouldHave(text("Ajuda")).click();
    }

    public static void acessarLinkMenuContato() {
        $(By.id("index.navlink.contato")).shouldHave(text("Contato")).click();
    }

}
