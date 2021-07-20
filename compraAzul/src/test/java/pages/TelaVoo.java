package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaVoo {
    WebDriver navegador;
    public TelaVoo(WebDriver navegador){

        this.navegador = navegador;
    }
    public void voo() throws InterruptedException {
        Thread.sleep(3000);
        navegador.findElement(By.xpath("(//*[@id='AvailabilityInputAvailabilityView_LinkButtonSubmit'])[1]")).click();
    }
}
