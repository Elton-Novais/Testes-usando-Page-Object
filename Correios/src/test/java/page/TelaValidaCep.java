package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TelaValidaCep {
    WebDriver navegador;

    public TelaValidaCep(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void validarCep() throws InterruptedException {
        String texto = navegador.findElement(By.xpath("(//table//tr)[2]//td[4]")).getText();
        Assert.assertEquals("04551-000", texto);
        String rua = navegador.findElement(By.xpath("(//table//tr)[2]//td[1]")).getText();
        Assert.assertEquals("Rua Olimpíadas", rua);
        System.out.println("================   CEP: "+ texto + ", rua: "+ rua + "  ==================");
        Thread.sleep(1000);

    }
}
