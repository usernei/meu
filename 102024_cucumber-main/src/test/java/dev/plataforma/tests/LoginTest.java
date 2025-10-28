package dev.plataforma.tests;

import org.openqa.selenium.WebDriver;

import dev.plataforma.drivers.DriverManager;
import dev.plataforma.pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginTest {

	private WebDriver driver;
	private LoginPage login;

	@Before
	public void setup() {
		driver = DriverManager.getDriver();
	}

	@Dado("que o usuário esteja no formulário de login")
	public void que_o_usuário_esteja_no_formulário_de_login() {
		login = new LoginPage(driver);
		login.acessarFormularioDeLogin();
	}

	@Quando("enviar o email e senha")
	public void enviar_o_email_e_senha() {
		login.preencherCredenciaisDeLogin("anderson1@e2etreinamentos.com.br", "A210!dfhg254126");
		login.clicarBotaoEntrar();
	}

	@Entao("acesso a tela de usuário logado")
	public void acesso_a_tela_de_usuário_logado() {
		login.validarPaginaLogado();
	}

	
	@Entao("recebo mensagem de {string}")
	public void recebo_mensagem_de(String string) {

	}


	@Quando("enviar o {string} e {string}")
	public void enviar_o_e(String string, String string2) {
		login.preencherCredenciaisDeLogin(string, string2);
	}

}
