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

public class AddUsuario {
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
	public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
		
		navegador.findElement(By.xpath("//button[@data-target='addmoredata']")).click();
		
		WebElement popupaddmoredata = navegador.findElement(By.id("addmoredata"));
		WebElement campoType = popupaddmoredata.findElement(By.name("type"));
		new Select(campoType).selectByVisibleText("Phone");	
		
		popupaddmoredata.findElement(By.name("contact")).sendKeys("+5524999999999");
		popupaddmoredata.findElement(By.linkText("SAVE")).click();
		
		WebElement msgpop = navegador.findElement(By.id("toast-container"));
		String mensagem = msgpop.getText();
		assertEquals("Your contact has been added!",mensagem);
		
		WebDriverWait aguardar = new WebDriverWait(navegador, Duration.ofSeconds(10));
		aguardar.until(ExpectedConditions.stalenessOf(msgpop));
		
	}
	
	
	@After
	public void tearDown() {
		
		navegador.findElement(By.linkText("Logout")).click();
		navegador.quit();
		
	}
	
}
	