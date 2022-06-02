package AutomationDemoSite;

import Support.WebCadastroDemoSite;
import Support.WebRemoverCadastro;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RemoverUsuarioDemoSite {
	private WebDriver navegador2;
	
	@Before
	public void setUp() {
		navegador2 = WebCadastroDemoSite.createChrome();
	}
	
	@Test
	public void RemoverCadastro() {
		
		
	}
	

}
