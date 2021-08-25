package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TelaRastreamento {
    WebDriver navegador;

    public TelaRastreamento(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void fazerRastreio() throws InterruptedException {
        // CLICAR EM "MEUS CORREIOS"
        navegador.findElement(By.xpath("//*[@class='bt-link-ic bt-login link-btn-meu-correios']")).click();

        // REALIZAR O LOGIN COM USUARIO E SENHA
        navegador.findElement(By.id("username")).click();
        navegador.findElement(By.id("username")).sendKeys("31403971862");
        navegador.findElement(By.id("password")).click();
        navegador.findElement(By.id("password")).sendKeys("haenois001");

        //CLICAR NO BOTÃO ENTRAR
        navegador.findElement(By.xpath("//button[@class='primario']")).click();

        // ABRIR MEUS OBJETOS
        navegador.findElement(By.id("meus-objetos")).click();
        Thread.sleep(1000);


    }
}
