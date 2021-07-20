package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidarBtn {
    WebDriver navegador;
    public ValidarBtn(WebDriver navegador){
        this.navegador = navegador;
    }
    public void btn(){
        WebElement ativo = navegador.findElement(By.xpath("//button[@class='btn btn-action btn-next']"));
        String texto = ativo.getText();
        Assert.assertEquals("Confirmar reserva", texto);
        System.out.println("================  "+texto+"  ==================");
    }
}
