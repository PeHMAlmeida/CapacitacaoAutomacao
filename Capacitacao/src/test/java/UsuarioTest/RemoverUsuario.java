package UsuarioTest;

import static org.junit.Assert.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Support.Screenshot;
import Support.generator;

public class RemoverUsuario {
	private WebDriver navegador;
	
	@Rule
	public TestName test = new TestName();
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sempre IT\\drivers\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().window().maximize();
		navegador.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		navegador.get("http://www.juliodelima.com.br/taskit/");
		
		//login
		WebElement linkSignIn = navegador.findElement(By.linkText("Sign in"));
		linkSignIn.click();
		WebElement loginbox = navegador.findElement(By.id("signinbox"));
		loginbox.findElement(By.name("login")).sendKeys("julio0001");
		loginbox.findElement(By.name("password")).sendKeys("123456");
		navegador.findElement(By.linkText("SIGN IN")).click();
		navegador.findElement(By.className("me")).click();
		navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
	}
		
	@Test
	public void removerContato() {
		
		navegador.findElement(By.xpath("//span[text()='+5524999999999']/following-sibling::a")).click();
		navegador.switchTo().alert().accept();
		
		WebElement msgpop = navegador.findElement(By.id("toast-container"));
		String mensagem = msgpop.getText();
		assertEquals("Rest in peace, dear phone!",mensagem);
		
		String screeshotArquivo = "C:\\Users\\Sempre IT\\report\\" + generator.dataHora() + test.getMethodName() + ".png";
		Screenshot.tirar(navegador, screeshotArquivo);
		
		WebDriverWait aguardar = new WebDriverWait(navegador, Duration.ofSeconds(10));
		aguardar.until(ExpectedConditions.stalenessOf(msgpop));	
	}
	
	@After
	public void tearDown() {
		
		navegador.findElement(By.linkText("Logout")).click();
		navegador.quit();
		
	}
	
}
	