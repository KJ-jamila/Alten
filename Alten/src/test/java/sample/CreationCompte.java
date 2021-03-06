package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreationCompte {
	 static WebDriver driver;
	    static WebDriverWait wait;    
	      @Test
		public void Creer () {
		         // System Property for Chrome Driver   
		      //System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");  
		        WebDriverManager.chromedriver().setup();
		           // Instantiate a ChromeDriver class.     
		      WebDriver driver=new ChromeDriver(); 
		      WebDriverWait wait = new WebDriverWait(driver,10);
		        
		         // Launch Website  
		      driver.get("https://www.amazon.fr");  //*[@id="createAccountSubmit"]
		        
		       //Maximize the browser  
		        driver.manage().window().maximize(); 
		        
		        // Click on the Search button  
			      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='nav-link-accountList']")))).click();   
			      WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='createAccountSubmit']")));
			      Category_Body.click();
	//click
			      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_customer_name']"))).sendKeys("Jamila");
			      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_email']"))).sendKeys("khalloufijamila8@gmail.com");
			      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_password']"))).sendKeys("Jamila1234@");
			      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_password_check']"))).sendKeys("Jamila1234@");
			      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='continue']"))).click(); 

		       
                } 


	


}