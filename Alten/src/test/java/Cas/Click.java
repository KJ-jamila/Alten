package Cas;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click {

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
		driver.get("https://www.nopcommerce.com/");

		// Maximize the browser
		driver.manage().window().maximize();
//click
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'en-page\']/body/div[6]/header/div/div[3]/div[1]/ul/li[2]/a/span[1]"))).click(); 
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'en-page\']/body/div[6]/header/div/div[3]/div[1]/ul/li[2]/ul/li[1]/a"))).click();
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Username\"]"))).sendKeys("jamila khalloufi");
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]"))).sendKeys("jamila123");
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-page\"]/body/div[6]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[4]/input"))).click(); 
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='en-page']/body/div[6]/section/div/div/div/div/div/div/div[1]/div/div[1]/div/a[2]"))).click();
	     // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[2]/div/div/a[2]/span\r\n" + 
	     //		"	    "))).click();
	      String mainWindow = driver.getWindowHandle();
		    //To click on Element
		    driver.findElement(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[2]/div/div/a[2]/span")).click();
		    //TO Switch to Window
		    Set<String> windowHndls = driver.getWindowHandles();
		    for(String hndl : windowHndls){
		    String WindowURL = driver.switchTo().window(hndl).getCurrentUrl();
		    if(WindowURL.equalsIgnoreCase("https://demo.nopcommerce.com/")){
		    	String mainWindow1 = driver.getWindowHandle();
		    	 Set<String> windowHndls1 = driver.getWindowHandles();
		    	 for(String hndl1 : windowHndls1){
		    		    String WindowURL1 = driver.switchTo().window(hndl1).getCurrentUrl();
		    		    if(WindowURL1.equalsIgnoreCase("https://demo.nopcommerce.com/")){
		    		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[2]/ul[2]/li[1]/a"))).click(); 
		    		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/a/img\r\n" + 
		    		    		"		    		    	"))).click();
		    		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[3]/div[2]/input[1]"))).click(); 
		    		   
		    		    	
	    
	    

}}}}}
}