package br.pro.diegoquirino.calculadora.ux;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class REQ001_CalcularDescontoTests {

    private FirefoxDriver driver;

    @BeforeEach
    public void setup(){
        this.driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown(){
        this.driver.close();
        this.driver = null;
    }

    @Test
    @DisplayName("Calcular o fator de desconto para o Cliente A, menor que 100 unidades")
    @Tags({@Tag("Automaticos"),@Tag("RF001")})
    public void testCalcularFatorDescontoClienteAMenor100(){
        //1.
        this.driver.get("http://diegoquirino.pro.br/calculadora/");
        //2.
        this.driver.findElement(By.id("welcome.button.calculardesconto")).click();
        //3.
        Locale defaultLocale = new Locale("en", "US", "USD");
        NumberFormat nf = NumberFormat.getCurrencyInstance(defaultLocale);
        Double valor = new Double(0);
        try {
            valor = new Double(nf.parse("$"+this.driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText()).doubleValue());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.driver.findElement(By.xpath("//a[contains(@href,'pid')][1]")).click();
        //4.
        (new Select(this.driver.findElement(By.id("tipoCliente")))).selectByVisibleText("A");
        this.driver.findElement(By.id("quantidade")).clear();
        this.driver.findElement(By.id("quantidade")).sendKeys("99");
        this.driver.findElement(By.id("calculardesconto.button.calcular")).click();

        //5. Preparar os dados para as asserções
        String fatorDesconto = this.driver.findElement(By.xpath("//body")).getText();
        String valorComDesconto = nf.format(new Double(valor*0.9)).replace("$","");

        //6.
        assertAll("Fator de desconto calculado com sucesso!",
                ()-> assertNotNull(this.driver.getTitle()),
                ()-> assertEquals("Calcular Desconto", this.driver.getTitle()),
                ()-> assertNotNull(fatorDesconto),
                ()-> assertTrue(fatorDesconto.contains("0,9 (ou seja, 10% de desconto)")),
                ()-> assertTrue(fatorDesconto.contains(valorComDesconto))
        );

    }

}
