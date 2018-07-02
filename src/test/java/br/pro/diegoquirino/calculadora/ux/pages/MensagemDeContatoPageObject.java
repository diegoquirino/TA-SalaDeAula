package br.pro.diegoquirino.calculadora.ux.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.text.Normalizer;
import java.util.List;

public class MensagemDeContatoPageObject extends PageObject {

    @FindBy(id="nome")
    private WebElement campoNome;

    @FindBy(id="email")
    private WebElement campoEmail;

    @FindBy(name="tipoMsg")
    private List<WebElement> radioTipoMensagem;

    @FindBy(id="idade")
    private WebElement selectIdade;

    @FindBy(id="mensagem")
    private WebElement campoMensagem;

    @FindBy(id="contato.button.enviarMensagem")
    private WebElement botaoEnviar;

    @FindBy(xpath = "//body")
    private WebElement conteudo;

    public void preencherNome(String nome){
        campoNome.clear();
        campoNome.sendKeys(nome);
    }
    public void preencherEmail(String email){
        campoEmail.clear();
        campoEmail.sendKeys(email);
    }
    public void preencherMensagem(String msg){
        campoMensagem.clear();
        campoMensagem.sendKeys(msg);
    }

    public void escolherTipoDeMensagem(String tipo){
        for(WebElement e: radioTipoMensagem){
            String value = e.getAttribute("value");
            if(value.contains(removerAcentos(tipo.toLowerCase()))){
                e.click();
            }
        }
    }

    public void escolherIdade(String idade) {
        Select s = new Select(selectIdade);
        s.selectByVisibleText(idade);
    }

    public void enviar(){
        botaoEnviar.click();
    }

    public String getConteudo(){
        return conteudo.getText();
    }

    private static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
