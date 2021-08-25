package stepsCorreios;

import evidencia.CriarPasta;
import evidencia.Generator;
import evidencia.Screenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PassosDefinidos {
    private WebDriver navegador;
    private final CriarPasta criarPasta = new CriarPasta();
    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sempre IT\\OneDrive\\Área de Trabalho\\Estudo-Automação\\Testes-usando-Page-Object\\Correios\\driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }


    @Dado("que estou no site https://www.correios.com.br")
    public void queEstouNoSiteHttpsWwwCorreiosComBr() {
        navegador.get("https://www.correios.com.br");
        String winHandleBefore = navegador.getWindowHandle();
    }

    @Quando("forneco usuario e senha")
    public void fornecoUsuarioESenha() throws IOException, InterruptedException {
        criarPasta.criarPasta("c1");
        TelaLogin telaLogin = new TelaLogin(navegador);
        telaLogin.clicarMeusCorreios();
        String screenshotArquivo = criarPasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);
        TelaLogin telaLogin1 = new TelaLogin(navegador);
        telaLogin1.preencherUsuarioSenha();
        String screenshotArquivo1 = criarPasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo1);
    }

    @Entao("acesso Meus correios e valido o acesso")
    public void acesso_meus_correios_e_valido_o_acesso() throws InterruptedException {
        TelaValidaAcesso telaValidaAcesso = new TelaValidaAcesso(navegador);
        telaValidaAcesso.validarAcesso();
        String screenshotArquivo = criarPasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);
    }

    @Quando("clico em meus objetos")
    public void clicoEmMeusObjetos() throws IOException, InterruptedException {
        TelaRastreamento telaRastreamento = new TelaRastreamento(navegador);
        telaRastreamento.fazerRastreio();
        criarPasta.criarPasta("c2");
        String screenshotArquivo = criarPasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);
    }

    @E("preencho numero de ratreio")
    public void preenchoNumeroDeRatreio() throws InterruptedException {
        TelaStatus telaStatus = new TelaStatus(navegador);
        telaStatus.verificarStatus();
        String screenshotArquivo = criarPasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);

    }

    @Entao("verifico e valido onde a encomenda esta")
    public void verificoEValidoOndeAEncomendaEsta() throws InterruptedException {
        TelaValidaStatus telaValidaStatus = new TelaValidaStatus(navegador);
        telaValidaStatus.validarStatus();
        String screenshotArquivo = criarPasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);
    }

    @Quando("clico em buscar CEP")
    public void clicoEmBuscarCEP() throws IOException, InterruptedException {
        TelaCep telaCep = new TelaCep(navegador);
        telaCep.acessarBuscaCep();
        criarPasta.criarPasta("c3");
        String screenshotArquivo = criarPasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);
    }

    @E("digito o CEP")
    public void digitoOCEP() throws InterruptedException {
        TelaBuscaCep telaBuscaCep = new TelaBuscaCep(navegador);
        telaBuscaCep.buscarCep();
        String screenshotArquivo = criarPasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);
    }

    @Entao("valido o endereco fornecido")
    public void validoOEnderecoFornecido() throws InterruptedException {
        TelaValidaCep telaValidaCep = new TelaValidaCep(navegador);
        telaValidaCep.validarCep();
        String screenshotArquivo = criarPasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);
    }
    @After
    public void fechar(){
        navegador.quit();
    }

}
