package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaPreencherDados {
    WebDriver navegador;
    public TelaPreencherDados(WebDriver navegador){
        this.navegador = navegador;
    }
    public void dados(){
        navegador.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Elton");
        navegador.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Novais");
        navegador.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("04852005");
        navegador.findElement(By.xpath("//input[@id='continue']")).click();

    }
}
