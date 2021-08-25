package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelaCep {
    WebDriver navegador;

    public TelaCep(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void acessarBuscaCep() throws InterruptedException {
        // CLICAR EM "MEUS CORREIOS"
        navegador.findElement(By.xpath("//*[@class='bt-link-ic bt-login link-btn-meu-correios']")).click();

        // REALIZAR O LOGIN COM USUARIO E SENHA
        navegador.findElement(By.id("username")).click();
        navegador.findElement(By.id("username")).sendKeys("31403971862");
        navegador.findElement(By.id("password")).click();
        navegador.findElement(By.id("password")).sendKeys("haenois001");

        //CLICAR NO BOTÃO ENTRAR
        navegador.findElement(By.xpath("//button[@class='primario']")).click();

        // ESPERAR OPÇÕES E CLICAR EM BUSCA CEP
        WebDriverWait wait = new WebDriverWait(navegador, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("opcoes")));
        navegador.findElement(By.id("busca-cep")).click();
        Thread.sleep(1000);

    }
}
