package br.pro.diegoquirino.calculadora.ux.REQ002_AjudaDoSistema;

import br.pro.diegoquirino.calculadora.ux.pages.AjudaDoSistemaPageObject;
import br.pro.diegoquirino.calculadora.ux.pages.PaginaInicialPageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.*;

public class REQ002_AjudaDoSistemaSteps extends ScenarioSteps {

    AjudaDoSistemaPageObject page;

    @Step
    public void verifico_estou_ajuda_do_sistema(String titulo, String secao) {
        assertTrue(this.page.getAjudaPageTitle().equalsIgnoreCase(titulo));
        assertTrue(this.page.existeSecao(secao));
    }

}
