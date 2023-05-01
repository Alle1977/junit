package Junitautomacao;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bancointer {
	// começando meu comando webdriver

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		// comando para apontar meu driver
		System.getProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");
		//
		driver = new ChromeDriver();
		// comando para abrir meu site
		driver.get("https://www.4devs.com.br/gerador_de_pessoas");
		Thread.sleep(5000);
		// comando para maximizar a tela
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// comando
		driver.findElement(By.id("bt_gerar_pessoa")).click();
		Thread.sleep(2000);
		String nome;
		nome = driver.findElement(By.id("nome")).getText();
		System.out.println(nome);
		String celular;
		celular = driver.findElement(By.id("celular")).getText();
		System.out.println(celular);
		String cpf;
		cpf = driver.findElement(By.id("cpf")).getText();
		System.out.println(cpf);
		String email;
		email = driver.findElement(By.id("email")).getText();
		System.out.println(email);
		String data_nasc;
		data_nasc = driver.findElement(By.id("data_nasc")).getText();
		System.out.println(data_nasc);

		driver.quit();

		System.getProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");
		//
		driver = new ChromeDriver();
		// comando para abrir meu site
		driver.get("https://www.bancointer.com.br/");
		Thread.sleep(5000);
		// comando para maximizar a tela
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.name("nome")).sendKeys(nome);
		Thread.sleep(1000);
		driver.findElement(By.name("celular")).sendKeys(celular);
		Thread.sleep(1000);

		driver.findElement(By.name("cpf")).sendKeys(cpf);
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys(email);
		Thread.sleep(1000);

		driver.findElement(By.name("data_nasc")).sendKeys(data_nasc);
		Thread.sleep(1000);
		driver.close();

	}

	@After
	public void tearDown() throws Exception {
	//driver.quit();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
