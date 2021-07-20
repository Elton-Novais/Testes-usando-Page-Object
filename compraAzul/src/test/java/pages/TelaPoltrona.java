package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class TelaPoltrona {
    WebDriver navegador;
    public TelaPoltrona(WebDriver navegador){
        this.navegador = navegador;
    }
    public void escolhaAssento() throws InterruptedException {
        Random aleatorio = new Random();
        int poltrona = aleatorio.nextInt(60);
        navegador.findElement(By.xpath("(//a[contains(@class,'seat -available') and @unit_value_pax_0='R$ 0,00'])[" + poltrona + "]")).click();
        Thread.sleep(6000);
        navegador.findElement(By.id("btnProsseguir")).click();
    }
}
