package testalten;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ticket {
	@Test
	public void Clicking() {

		// System Property for Chrome Driver
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 500);

		// Launch Website
		driver.get("http://localhost:4200/login");
		// Maximize the browser
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Username']"))).sendKeys("fati");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Password']"))).sendKeys("123");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='login100-form-btn']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link text-white p-3 mb-2 current']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Tickets prioritaire')]\r\n" + 
				""))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-outline-success my-2 my-sm-0']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'×')]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-4']//tr[1]//td[1]//i[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[2]//td[1]//i[1]"))).click();
	}
}