package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaValidaAcesso {
    WebDriver navegador;

    public TelaValidaAcesso(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void validarAcesso() throws InterruptedException {
        WebElement ativo = navegador.findElement(By.xpath("//*[text()='ELTON Fernandes Novais']"));
        String texto = ativo.getText();
        Assert.assertEquals("ELTON Fernandes Novais", texto);
        System.out.println("================  " + texto + "  ==================");
        Thread.sleep(1000);


    }
}
