package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class HomePage {
    WebDriver navegador;

    //Constructor
    public HomePage(WebDriver navegador){
        this.navegador = navegador;
    }
    public void dadosPassagem() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(navegador, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("TCSS__tabbox-shopping")));
        navegador.findElement(By.xpath("//*[@value='OneWay']")).click();
        navegador.findElement(By.xpath("//input[@id='field-5-origin1']")).sendKeys("GRU");
        navegador.findElement(By.xpath("//input[@id='field-5-origin1']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//input[@id='field-6-destination1']")).sendKeys("POA");
        navegador.findElement(By.xpath("//input[@id='field-6-destination1']")).sendKeys(Keys.ENTER);
        Random aleatorio = new Random();
        int dia = aleatorio.nextInt(120);
        LocalDate dataDePartida = LocalDate.now().plusDays(dia);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        navegador.findElement(By.xpath("//input[@id='field-7-departure1']")).sendKeys((dataDePartida.format(formato)));
        Thread.sleep(1000);
        navegador.findElement(By.xpath("//button[@id='searchTicketsButton']")).click();
    }

}
