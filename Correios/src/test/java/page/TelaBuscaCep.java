package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaBuscaCep {
    WebDriver navegador;

    public TelaBuscaCep(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void buscarCep() throws InterruptedException {
        // MUDAR PARA A NOVA ABA
        for (String winHandle : navegador.getWindowHandles()) {
            navegador.switchTo().window(winHandle);
        }
        // BUSCAR O CEP
        navegador.findElement(By.id("endereco")).sendKeys("04551-000");
        navegador.findElement(By.id("btn_pesquisar")).click();
        Thread.sleep(1000);
    }
}
