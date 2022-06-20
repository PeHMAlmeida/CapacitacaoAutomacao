package AutomationDemoSite2FullXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Support.SiteCadastro2;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


public class Cadastro {

	private WebDriver navegador2;
	
	@Before
	public void setUp() {
		navegador2 = SiteCadastro2.createChrome();
	}
	
	@Test
	public void RealizarCadastro() {
		
		//Primeiro Nome
		String Nome ="/html/body/section/div/div/div[2]/form/div[1]/div[1]/input";
		navegador2.findElement(By.xpath(Nome)).sendKeys("Pedro");
		
		//Sobrenome
		String Sobrenome = "/html/body/section/div/div/div[2]/form/div[1]/div[2]/input";
		navegador2.findElement(By.xpath(Sobrenome)).sendKeys("Almeida");
		
		//Adress
		String Adress = "/html/body/section/div/div/div[2]/form/div[2]/div/textarea";
		navegador2.findElement(By.xpath(Adress)).sendKeys("Rua 10, São Paulo");
		
		//Email
		String Email = "/html/body/section/div/div/div[2]/form/div[3]/div[1]/input";
		navegador2.findElement(By.xpath(Email)).sendKeys("SempreIT@SempreIT.com.br");
		
		//Fone
		String Fone = "/html/body/section/div/div/div[2]/form/div[4]/div/input";
		navegador2.findElement(By.xpath(Fone)).sendKeys("(24) 9 9999-1206");
		
		//Sexo
		String Sexo = "/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input";
		navegador2.findElement(By.xpath(Sexo)).click();
		
		//Hobbies
		String Hobbies1 = "/html/body/section/div/div/div[2]/form/div[6]/div/div[1]/input";
		String Hobbies2 = "/html/body/section/div/div/div[2]/form/div[6]/div/div[2]/input";	
		String Hobbies3 = "/html/body/section/div/div/div[2]/form/div[6]/div/div[3]/input";
		navegador2.findElement(By.xpath(Hobbies1)).click();
		navegador2.findElement(By.xpath(Hobbies2)).click();
		navegador2.findElement(By.xpath(Hobbies3)).click();
		
		//Abrindo lista
		String Lista = "/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]";
		navegador2.findElement(By.xpath(Lista)).click();
		//Selecionando Idiomas
		String IdiomaPT = "/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[29]/a";
		String IdiomaEN = "/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[8]/a";
		navegador2.findElement(By.xpath(IdiomaPT)).click();
		navegador2.findElement(By.xpath(IdiomaEN)).click();
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/label")).click();
		
		//Abrindo Skills
		String Skills = "/html/body/section/div/div/div[2]/form/div[8]/div/select";
		navegador2.findElement(By.xpath(Skills)).click();
		//Selecionando Skills
		String DataAnalyst = "/html/body/section/div/div/div[2]/form/div[8]/div/select/option[21]";
		navegador2.findElement(By.xpath(DataAnalyst)).click();
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/label")).click();
		
		//Country
		String Country = "/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span";
		navegador2.findElement(By.xpath(Country)).click();
		String Select = "/html/body/span/span/span[2]/ul/li[9]";
		navegador2.findElement(By.xpath(Select)).click();
		
		//Data Nascimento
		//Ano
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select")).click();
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select/option[84]")).click();
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/label")).click();
		
		//Mes
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")).click();
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select/option[10]")).click();
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/label")).click();
		
		//Dia
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select")).click();
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select/option[21]")).click();
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/label")).click();
		
		//Password
		
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[12]/div/input")).sendKeys("123456789");
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[13]/div/input")).sendKeys("123456789");
		
		//Submit
		navegador2.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[14]/div/button[1]")).click();
	}	
	
}
