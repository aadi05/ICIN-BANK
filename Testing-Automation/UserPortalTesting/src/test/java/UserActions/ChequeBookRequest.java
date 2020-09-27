package UserActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ChequeBookRequest {

	@Test
	public void chequeBookRequest() throws InterruptedException {
	
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nagaraj\\Downloads\\firefoxDriver\\geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    
		    driver.get("http://localhost:4200/login");
		    Thread.sleep(5000);
	    
	    driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		
		  driver.findElement(By.xpath(
		  "/html/body/app-root/app-login/div/form/div[1]/input")).sendKeys("Novina");
		  driver.findElement(By.xpath(
		  "/html/body/app-root/app-login/div/form/div[2]/input")).sendKeys("Novina123")
		  ;
		  
		  driver.findElement(By.xpath(
		  "/html/body/app-root/app-login/div/form/div[3]/button")).click();
		 
		try 
		{
			
			  WebDriverWait wait=new WebDriverWait(driver, 14);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			  "/html/body/app-root/app-home/div[1]/h2")));
			  System.out.println("Login Successfull");
			 
			
			driver.findElement(By.xpath("/html/body/app-root/nav/ul/li[4]/a")).click();
		    driver.findElement(By.xpath("/html/body/app-root/app-cheque-book-request/div/div[2]/select")).click();
		    driver.findElement(By.xpath("/html/body/app-root/app-cheque-book-request/div/div[2]/select/option[1]")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-cheque-book-request/div/form/button")).click();
			System.out.println("Cheque Book Issued Successfully!!");

//			driver.findElement(By.xpath("/html/body/app-root/nav/ul/li[5]/div/a[2]")).click();
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/form/h3")));
//			System.out.println("Signed Out");
		}
		catch(Exception e) 
		{
			System.out.println("Error in browser!!\nPlease have a look");
		}
		
	    Thread.sleep(5000);  
	    driver.quit();
	    
	}
	
}
