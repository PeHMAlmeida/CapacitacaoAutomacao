package Support;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteCadastro2 {
	public static WebDriver createChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sempre IT\\drivers\\chromedriver.exe");
		WebDriver navegador2 = new ChromeDriver();
		navegador2.manage().window().maximize();
		navegador2.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		navegador2.get("http://demo.automationtesting.in/Register.html");
		return navegador2;

	}
}
