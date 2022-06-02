package AutomationDemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Support.WebCadastroDemoSite;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


public class Cadastro {
	private WebDriver navegador2;
	
	@Before
	public void setUp() {
		navegador2 = WebCadastroDemoSite.createChrome();
	}
	
	@Test
	public void RealizarCadastro() {
		
		//preenchimento do cadastro
		navegador2.findElement(By.name("user[name]")).sendKeys("AAAAAAAPedro");
		navegador2.findElement(By.name("user[lastname]")).sendKeys("Moreira");
		navegador2.findElement(By.name("user[email]")).sendKeys("pedro@pedro.com");
		navegador2.findElement(By.name("user[address]")).sendKeys("Rua 10");
		navegador2.findElement(By.name("user[university]")).sendKeys("UGB FERP");
		navegador2.findElement(By.name("user[profile]")).sendKeys("Analista de Dados");
		navegador2.findElement(By.name("user[gender]")).sendKeys("Masculino");
		navegador2.findElement(By.name("user[age]")).sendKeys("20");
		
		//click
		navegador2.findElement(By.name("commit")).click();		
	}	
	
	@After
	public void tearDown() {
		navegador2.quit();
	}

}
