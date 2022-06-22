package PHPTravelsDemo;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Support.Travels;

public class ComprarVooBrasilia {
	private WebDriver navegador;
	
	@Before
	public void setUp() {
		navegador = Travels.createChrome();
		
		String Login = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input";
		String Password = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input";
		String Submit = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button/span[1]";
		
		navegador.findElement(By.xpath(Login)).sendKeys("user@phptravels.com");
		navegador.findElement(By.xpath(Password)).sendKeys("demouser");
		navegador.findElement(By.xpath(Submit)).click();
	}
		
	@Test
	public void ComprarPassagem() {
		
		//Selecionando passagem
		navegador.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a")).click();
		navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div/div[1]/div/div/div[3]/a/div/div/div[1]")).click();
		navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("/html/body/main/div/div[2]/section/ul/li[1]/div/form/div/div[2]/div/button/strong")).click();
		
		//Informando comprador
		
		String Nome = "/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/input";
		String Sobrenome = "/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/input";
		navegador.findElement(By.xpath(Nome)).sendKeys("Pedro");
		navegador.findElement(By.xpath(Sobrenome)).sendKeys("Almeida");
		
		String Country = "/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[1]/select/option[33]";
		navegador.findElement(By.xpath(Country)).click();
		
		//Data Nascimento
		//Mes
		navegador.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/select/option[10]")).click();
		
		//Dia
		navegador.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/select/option[20]")).click();
		
		//Ano
		navegador.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/select/option[25]")).click();
		
		//Passaporte
		String Passaporte = "/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[1]/input";
		navegador.findElement(By.xpath(Passaporte)).sendKeys("9999999999");
		
		//Passaporte Info
		String DataPassaporte = "/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/select/option[9]";
		navegador.findElement(By.xpath(DataPassaporte)).click();
		//Dia
		navegador.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/select/option[20]")).click();
		//Ano
		navegador.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/select/option[20]")).click();
		
		//Passaporte expiracao
		//Mes
		navegador.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[3]/div/div[1]/select/option[13]")).click();
		//Dia
		navegador.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[3]/div/div[2]/select/option[30]")).click();
		//Ano
		navegador.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[3]/div/div[3]/select/option[13]")).click();
		
		
		//aceitar termos e condicoes - Essa parte necessario tirar duvida com alguem. Nao foi possivel marcar a checkbox
		navegador.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[4]/div/div/div/label/text()")).click();
		//confirmando reserva
		navegador.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[5]/div/button")).click();
			
	}

}
