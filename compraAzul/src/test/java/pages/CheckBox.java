package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CheckBox {
    WebDriver navegador;
    public CheckBox(WebDriver nevagador){
       this.navegador = nevagador;
    }
    public void cliqueCheck(){
        navegador.findElement(By.xpath("//label[@for='PaymentInputControlCheckoutView_CheckboxTerms']")).click();
        ((RemoteWebDriver) navegador).executeScript("scrollBy(0,950)", "");
    }
}
