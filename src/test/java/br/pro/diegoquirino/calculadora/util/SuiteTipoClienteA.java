package br.pro.diegoquirino.calculadora.util;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Suíte de testes para os clientes do tipo A")
@SelectPackages({"br.pro.diegoquirino.calculadora"})
@IncludeTags("ClienteA")
@ExcludeTags({"ClienteB","ClienteC"})
public class SuiteTipoClienteA {

}
