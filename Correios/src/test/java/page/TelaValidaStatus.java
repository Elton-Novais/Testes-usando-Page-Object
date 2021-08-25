package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaValidaStatus {
    WebDriver navegador;

    public TelaValidaStatus(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void validarStatus() throws InterruptedException {
        WebElement ativo = navegador.findElement(By.xpath("//*[text()='Objeto entregue ao destinatário']"));
        String texto = ativo.getText();
        Assert.assertEquals("Objeto entregue ao destinatário", texto);
        System.out.println("================  " + texto + "  ==================");
        Thread.sleep(1000);

    }
}
