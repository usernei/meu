package dev.plataforma.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {
	
	public static WebDriver createDriver() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://plataforma.dev.e2etreinamentos.com.br/");
		return driver;
	}
	
}
