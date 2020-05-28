package sample2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class ajout {
	static WebDriver driver;
    static WebDriverWait wait;
	@Test
	public void Adding() {
		// System Property for Chrome Driver 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");  
		// Instantiate a ChromeDriver class.     
		WebDriver driver=new ChromeDriver();  
		// Launch Website  		        
	   //Maximize the browser  
	    driver.manage().window().maximize(); 
	    driver.get("https://www.amazon.fr");
	    WebDriverWait wait = new WebDriverWait(driver, 40);
	  //Get the Window Handle
	    String mainWindow = driver.getWindowHandle();
	    //To click on Element
	    driver.findElement(By.xpath("//div/h2[contains(.,'Apprendre à coder gratuitement')]/../following-sibling::div[1]/a")).click();
	    //TO Switch to Window
	    Set<String> windowHndls = driver.getWindowHandles();
	    for(String hndl : windowHndls){
	    String WindowURL = driver.switchTo().window(hndl).getCurrentUrl();
	    if(WindowURL.equalsIgnoreCase("https://www.code-decode.net/code-amazon")){
	    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a"))));//driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a")).click();
	    	String mainWindow1 = driver.getWindowHandle();
	    	 Set<String> windowHndls1 = driver.getWindowHandles();
	    	 for(String hndl1 : windowHndls1){
	    		    String WindowURL1 = driver.switchTo().window(hndl1).getCurrentUrl();
	    		    if(WindowURL1.equalsIgnoreCase("https://www.code-decode.net/programme")){
	    		    	
	    		    
	    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='appBlocHead']/div/div/nav/div[2]/ul/li[3]/a")))).click();
	    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='edit-name']")))).sendKeys("Jamila");
	    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='edit-mail']")))).sendKeys("khalloufijamila8@gmail.com");
	    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='edit-pass-pass1']")))).sendKeys("Jamila123");
	    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='edit-field-vous-etes-und']")))).click();
	    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"edit-pass-pass2\"]")))).sendKeys("Jamila123");
	    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"edit-field-nom-und-0-value\"]")))).sendKeys("KHALLOUFI");
	    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"edit-field-prenom-und-0-value\"]")))).sendKeys("Jamila");
	    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"edit-field-field-comment-avez-vous-de-und\"]")))).click();   
	    		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"edit-field-cgu-und\"]")))).click();  
	    		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")))).click();
	    		    }
	    		  

	    		    
	    
	    }
}
	}
	}
}