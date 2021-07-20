package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DadosPassageiro {
    WebDriver navegador;
    public DadosPassageiro(WebDriver navegador){
        this.navegador = navegador;
    }
    public void dadosPassageiro() throws InterruptedException {
        navegador.findElement(By.xpath("//input[@id='PassengerControlPassengerView_TextBoxFirstName_0']")).sendKeys("Erson");
        navegador.findElement(By.xpath("//input[@id='PassengerControlPassengerView_TextBoxLastName_0']")).sendKeys("Teste");
        navegador.findElement(By.xpath("//*[@id='countryDiv']/div/button")).click();
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//*[@id='countryDiv']/div/div/ul/li[2]/a")).click();
        navegador.findElement(By.xpath("//*[@id='informationGenderDiv_0']/div/button")).click();
        navegador.findElement(By.xpath("//*[@id='informationGenderDiv_0']/div/div/ul/li[3]/a/span[1]")).click();
        navegador.findElement(By.xpath("//*[@id='PassengerControlPassengerView_TextBoxBirthDate_0']")).sendKeys("12/12/1994");
        navegador.findElement(By.xpath("//*[@id='PassengerControlPassengerView_TextBoxEmail_0']")).sendKeys("test@teste.com");
        navegador.findElement(By.xpath("//*[@id='PassengerControlPassengerView_LinkButtonSubmit']")).click();
    }
}
