package steps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;


public class TestPassos {
    private WebDriver navegador;
    private HomePage homepage;
    private TelaVoo telavoo;
    private DadosPassageiro dadospassageiro;
    private TelaPoltrona telapoltrona;
    private TelaBagagem telabagagem;
    private DadosContato dadoscontato;
    private CheckBox checkbox;
    private ValidarBtn validarbtn;
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
        homepage = new HomePage(navegador);
        homepage.dadosPassagem();
    }

    @Quando("seleciono o voo")
    public void seleciono_o_voo() throws InterruptedException {
        telavoo = new TelaVoo(navegador);
        telavoo.voo();
    }

    @Quando("preencho dados do passageiro")
    public void preencho_dados_do_passageiro() throws InterruptedException {
        dadospassageiro = new DadosPassageiro(navegador);
        dadospassageiro.dadosPassageiro();
    }

    @Quando("escolho o assento")
    public void escolho_o_assento() throws InterruptedException {
        telapoltrona = new TelaPoltrona(navegador);
        telapoltrona.escolhaAssento();
    }

    @Quando("clico em prosseguir na tela de bagagens")
    public void clico_em_prosseguir_na_tela_de_bagagens() throws InterruptedException {
        telabagagem = new TelaBagagem(navegador);
        telabagagem.bagagem();
    }

    @Quando("preencho os dados de contato")
    public void preencho_os_dados_de_contato() {
        dadoscontato = new DadosContato(navegador);
        dadoscontato.contato();
    }

    @Quando("marco a checkbox dizendo que Li e Concordo com as regras")
    public void marco_a_checkbox_dizendo_que_li_e_concordo_com_as_regras() {
        checkbox = new CheckBox(navegador);
        checkbox.cliqueCheck();
    }

    @Entao("valido se o botao Confirmar reserva esta habilitado")
    public void valido_se_o_botao_Confirmar_reserva_esta_habilitado() {
        validarbtn = new ValidarBtn(navegador);
        validarbtn.btn();
         }
    }













