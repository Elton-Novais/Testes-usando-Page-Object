package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DadosContato {
    WebDriver navegador;
    public DadosContato(WebDriver navegador){
        this.navegador = navegador;
    }
    public void contato(){
        navegador.findElement(By.xpath("//input[@id='PaymentInputControlCheckoutView_ContactInputControlCheckoutView_TextBoxPostalCode']")).sendKeys("04852005");
        navegador.findElement(By.xpath("//input[@id='PaymentInputControlCheckoutView_ContactInputControlCheckoutView_TextBoxAddressNumber']")).sendKeys("787");
        navegador.findElement(By.xpath("//input[@id='PaymentInputControlCheckoutView_ContactInputControlCheckoutView_TextBoxOtherPhone']")).sendKeys("11943704654");
    }
}
