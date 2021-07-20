package pageObject;

import org.openqa.selenium.WebDriver;


public class PageObject {
    private WebDriver navegador;
    public PageObject (WebDriver driver){

        this.navegador = driver;
    }
    public void entrandoNoSite(String url){

        navegador.get("https://www.voeazul.com.br");
    }

}
