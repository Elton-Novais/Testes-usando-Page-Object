package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaStatus {
    WebDriver navegador;

    public TelaStatus(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void verificarStatus() throws InterruptedException {
        // MUDAR PARA A NOVA ABA
        for (String winHandle : navegador.getWindowHandles()) {
            navegador.switchTo().window(winHandle);
        }
        // CONSULTAR CODIGO DE RASTREIO LB115271943HK
        navegador.findElement(By.id("objetos")).click();
        navegador.findElement(By.id("objetos")).sendKeys("LB115271943HK");
        navegador.findElement(By.id("btnPesq")).click();
        Thread.sleep(1000);
    }
}
