package passosDefinidos;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.PageObject;


public class MyStepdefs {
    ChromeDriver driver = new ChromeDriver();
    PageObject navegador = new PageObject(driver);
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sempre IT\\IdeaProjects\\compraAzul\\Driver\\chromedriver.exe");
    }

    @Dado("que estou no site https://www.voeazul.com.br")
    public void que_estou_no_site_https_www_voeazul_com_br() {
        navegador.entrandoNoSite("https://www.voeazul.com.br");
    }
    @Quando("preencho os dados referentes a viagem")
    public void preencho_os_dados_referentes_a_viagem() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Quando("seleciono o voo")
    public void seleciono_o_voo() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Quando("preencho dados do passageiro")
    public void preencho_dados_do_passageiro() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Quando("clico em prosseguir na tela de bagagens")
    public void clico_em_prosseguir_na_tela_de_bagagens() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Quando("preencho os dados de contato")
    public void preencho_os_dados_de_contato() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Quando("marco a checkbox dizendo que Li e Concordo com as regras")
    public void marco_a_checkbox_dizendo_que_li_e_concordo_com_as_regras() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("valido se o botao Confirmar reserva esta habilitado")
    public void valido_se_o_botao_confirmar_reserva_esta_habilitado() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
