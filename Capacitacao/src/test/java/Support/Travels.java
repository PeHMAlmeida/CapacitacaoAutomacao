package Support;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travels {
	public static WebDriver createChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sempre IT\\drivers\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().window().maximize();
		navegador.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		navegador.get("https://www.phptravels.net/login");
		return navegador;

	}
}
