package dev.plataforma.metodos;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	private WebDriver driver;

	public Metodos(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Método para clicar em um elemento web
	 * 
	 * @param locator
	 */
	public void clicar(By locator) {
		try { // tratamento de exceção
			driver.findElement(locator).click();
		} catch (Exception e) {
			throw new NoSuchElementException("Elemento não encontrado " + locator);
		}
	}

	/**
	 * Método responsável por escrever um texto em um elemento web
	 * 
	 * @param locator
	 * @param texto
	 */
	public void preencher(By locator, String texto) {
		try {
			driver.findElement(locator).sendKeys(texto);
		} catch (Exception e) {
			throw new NoSuchElementException("Elemento não encontrado " + locator);
		}
	}

	/**
	 * Método valida a url 
	 * @param urlDesejada
	 */
	public void validarUrl(String urlDesejada) {
		try {
			String urlAtual = driver.getCurrentUrl();
			assertThat(urlAtual.equals(urlDesejada));
		} catch (Exception e) {
			throw new NotFoundException("Url não encontrada.");
		}
	}
	
	/**
	 * Método de espera o elemento 
	 * @param locator
	 * @param segundos
	 */
	public void esperarElementoClicavel(By locator, int segundos) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(segundos));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Exception e) {
			throw new NoSuchElementException("Elemento não encontrado.");
		}
	}
	

}
