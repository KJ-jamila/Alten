package sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FailedLogin {
	static WebDriver driver;
	static WebDriverWait wait;

	@Test

	public void logining() {

		// System Property for Chrome Driver
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Launch Website
		driver.get("https://www.amazon.fr");

		// Maximize the browser
		driver.manage().window().maximize();
		// Click on the Search button
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_email']")))
				.sendKeys("testeur.alten@gmail.com");
		System.out.println("ce compte n'existe pas ");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='continue']"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_password'] ")))
		//		.sendKeys("Jamila1234@");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='signInSubmit']"))).click();

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='continue']"))).click();
		//System.out.println("veuillez Entrer le code de verivication envoyé par message ");

		// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"continue\"]")))).click();

	}



}
