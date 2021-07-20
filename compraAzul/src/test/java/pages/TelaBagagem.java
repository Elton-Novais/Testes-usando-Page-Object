package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaBagagem {
    WebDriver navegador;
    public TelaBagagem(WebDriver navegador){
        this.navegador = navegador;
    }
    public void bagagem() throws InterruptedException {
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//button[@id='btnContinue']")).click();
    }
}
