package br.pro.diegoquirino.calculadora.ux.pages;

import org.openqa.selenium.By;

import java.text.Normalizer;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MensagemDeContatoPageObject {

    public static void preencherNome(String nome){
        $(By.id("nome")).setValue(nome);
    }
    public static void preencherEmail(String email){
        $(By.id("email")).setValue(email);
    }
    public static void preencherMensagem(String msg){
        $(By.id("mensagem")).setValue(msg);
    }

    public static void escolherTipoDeMensagem(String tipo){
        $(By.name("tipoMsg")).selectRadio(removerAcentos(tipo.toLowerCase()));
    }

    public static void escolherIdade(String idade) {
        $(By.id("idade")).selectOptionContainingText(idade);
    }

    public static void enviar(){
        $(By.id("contato.button.enviarMensagem")).shouldBe(enabled).submit();
    }

    public static String getConteudo(){
        return $(By.xpath("//body")).getText();
    }

    private static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
