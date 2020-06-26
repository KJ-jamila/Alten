package testalten;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Launch Website
		driver.get("http://localhost:4200/login");

		// Maximize the browser
		driver.manage().window().maximize();
}
}