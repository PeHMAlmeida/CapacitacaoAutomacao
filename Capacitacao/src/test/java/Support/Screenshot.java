package Support;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;


public class Screenshot {
	
	public static void tirar(WebDriver navegador, String arquivo) {
		File screenshot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot,new File(arquivo));
		} catch (Exception e) {
			System.out.println("erro ao copiar" + e.getMessage());
		}
		
	}
}
