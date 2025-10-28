package dev.plataforma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dev.plataforma.metodos.Metodos;

public class LoginPage {
	
	private WebDriver driver;
	private Metodos metodos;
	
	
	By btnEntrar = By.xpath("//button[@class='btn-entrar']");
	By campoEmail = By.xpath("//input[@placeholder='Digite seu e-mail']");
	By campoSenha = By.xpath("//input[@placeholder='Senha']");
	By btnEntrarLogin = By.xpath("//button[@class='btn-login']");
	By msgSessaoAtivaSim = By.xpath("//*[@class='btn-sim']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.metodos = new Metodos(driver);
	}
	
	public void acessarFormularioDeLogin() {
		metodos.clicar(this.btnEntrar);
	}
	
	public void preencherCredenciaisDeLogin(String email, String senha) {
		metodos.preencher(campoEmail, email);
		metodos.preencher(campoSenha, senha);
	}
	
	public void clicarBotaoEntrar() {
		metodos.clicar(btnEntrarLogin);
		try {
			metodos.esperarElementoClicavel(msgSessaoAtivaSim, 5);
			metodos.clicar(msgSessaoAtivaSim);
		} catch (Exception e) {
			System.out.println("Não apareceu a mensagem de sessão ativa.");
		}
	}
	
	public void validarPaginaLogado() {
		metodos.validarUrl("https://plataforma.dev.e2etreinamentos.com.br/dashboard");
	}
	

}
