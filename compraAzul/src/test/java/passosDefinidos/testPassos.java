package passosDefinidos;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class testPassos {
    public WebDriver navegador;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sempre IT\\IdeaProjects\\compraAzul\\Driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Dado("que estou no site https://www.voeazul.com.br")
    public void que_estou_no_site_https_www_voeazul_com_br() {
        navegador.get("https://www.voeazul.com.br");
    }

    @Quando("preencho os dados referentes a viagem")
    public void preencho_os_dados_referentes_a_viagem() throws InterruptedException {
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

    @Quando("seleciono o voo")
    public void seleciono_o_voo() throws InterruptedException {
        Thread.sleep(3000);
        navegador.findElement(By.xpath("(//*[@id='AvailabilityInputAvailabilityView_LinkButtonSubmit'])[1]")).click();
    }

    @Quando("preencho dados do passageiro")
    public void preencho_dados_do_passageiro() throws InterruptedException {
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

    @Quando("escolho o assento")
    public void escolho_o_assento() throws InterruptedException {
        Random aleatorio = new Random();
        int poltrona = aleatorio.nextInt(60);
        navegador.findElement(By.xpath("(//a[contains(@class,'seat -available') and @unit_value_pax_0='R$ 0,00'])[" + poltrona + "]")).click();
        Thread.sleep(6000);
        navegador.findElement(By.id("btnProsseguir")).click();
    }

    @Quando("clico em prosseguir na tela de bagagens")
    public void clico_em_prosseguir_na_tela_de_bagagens() throws InterruptedException {
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//button[@id='btnContinue']")).click();
    }

    @Quando("preencho os dados de contato")
    public void preencho_os_dados_de_contato() {
        navegador.findElement(By.xpath("//input[@id='PaymentInputControlCheckoutView_ContactInputControlCheckoutView_TextBoxPostalCode']")).sendKeys("04852005");
        navegador.findElement(By.xpath("//input[@id='PaymentInputControlCheckoutView_ContactInputControlCheckoutView_TextBoxAddressNumber']")).sendKeys("787");
        navegador.findElement(By.xpath("//input[@id='PaymentInputControlCheckoutView_ContactInputControlCheckoutView_TextBoxOtherPhone']")).sendKeys("11943704654");
    }

    @Quando("marco a checkbox dizendo que Li e Concordo com as regras")
    public void marco_a_checkbox_dizendo_que_li_e_concordo_com_as_regras() {
        navegador.findElement(By.xpath("//label[@for='PaymentInputControlCheckoutView_CheckboxTerms']")).click();
        ((RemoteWebDriver) navegador).executeScript("scrollBy(0,950)", "");
    }

    @Entao("valido se o botao Confirmar reserva esta habilitado")
    public void valido_se_o_botao_Confirmar_reserva_esta_habilitado() {
        WebElement ativo = navegador.findElement(By.xpath("//button[@class='btn btn-action btn-next']"));
        String texto = ativo.getText();
        Assert.assertEquals("Confirmar reserva", texto);
        System.out.println("================  "+texto+"  ==================");
         }
    }













