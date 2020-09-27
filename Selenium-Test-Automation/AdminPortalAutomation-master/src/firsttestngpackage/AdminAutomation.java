package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;


public class AdminAutomation {
	public String baseUrl = "http://localhost:4201";
    //String driverPath = "C:\\Users\\Nagaraj\\Downloads\\firefoxDriver\\geckodriver.exe";
   String driverPath = "D:\\geckodriver\\geckodriver.exe";
    public WebDriver driver ; 
     
  @BeforeTest
  public void launchBrowser() {
       
      System.out.println("Launching Firefox Browser"); 
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }


@Test(priority=0) public void login_Pass() { 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.name("inputUserName")).sendKeys("madhuri");
		  driver.findElement(By.name("password")).sendKeys("mad12345");
		  //Login Button
		  driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/button")).click();
		  String actualUrl="http://localhost:4200/user-account";
		  String expectedUrl= driver.getCurrentUrl();
		  if(actualUrl.equalsIgnoreCase(expectedUrl)) {
		  System.out.println("Login Successful"); }
		  driver.manage().window().maximize();
}


@Test(priority=1) public void useraccount_login_enabling(){
  
  //User Account Hyperlink
  driver.findElement(By.xpath("/html/body/app-root/div/nav/div/ul/li[1]/a")).click();
  //Enable Button
  driver.findElement(By.xpath("/html/body/app-root/app-user-account/table/tbody/tr[1]/td[6]/button")).click();
  System.out.println("Enabled Login Feature");
  //Disable Button
  driver.findElement(By.xpath("/html/body/app-root/app-user-account/table/tbody/tr[2]/td[7]/button")).click();
  System.out.println("Disabled Login Feature"); 
  }
  
  @Test(priority=2) public void useraccount_features(){
  //Click on the dropdown
  driver.findElement(By.xpath("/html/body/app-root/app-user-account/table/tbody/tr/td[9]/select")).click();
  //Select the first option
  driver.findElement(By.xpath("/html/body/app-root/app-user-account/table/tbody/tr/td[9]/select/option[1]")).click(); 
  //Set button
  driver.findElement(By.xpath("/html/body/app-root/app-user-account/table/tbody/tr/td[9]/button")).click();
  System.out.println("User Roles Changed");
  }
 
  @Test(priority=4) public void checkbookRequests() {
  //Checkbook Request Hyperlink
  driver.findElement(By.xpath("/html/body/app-root/div/nav/div/ul/li[2]/a")).click(); 
  //Confirm Request Button
  driver.findElement(By.xpath("/html/body/app-root/app-checkbook-requests/table/tbody/tr[1]/td[7]/button")).click(); 
  System.out.println("Request Confirmed");
  
  }
  
  @Test(priority=3) public void authorization() {
  //Authorization link
  driver.findElement(By.xpath("/html/body/app-root/div/nav/div/ul/li[3]/a")).click(); 
  //Create Account Button
  driver.findElement(By.xpath("/html/body/app-root/app-authorize-registration/table/tbody/tr/td[9]/button")).click(); 
  System.out.println("Authorized");
  //Cancel Button
  driver.findElement(By.xpath("/html/body/app-root/app-authorize-registration/table/tbody/tr[2]/td[10]/button")).click(); 
  System.out.println(" Not Authorized");
  
  }
  
  @Test(priority=5) public void logout() {
	//LogOut Button
  driver.findElement(By.xpath("/html/body/app-root/div/nav/div/ul/li[4]/a")).
  click(); System.out.println("Logged Out");
  
  }
 
  @Test(priority=6) public void login_Fail() { 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.name("inputUserName")).sendKeys("madhuri");
		  driver.findElement(By.name("password")).sendKeys("mad");
		  //Login Button
		  driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/button")).click();
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		  String actualUrl="http://localhost:4200/user-account";
		  String expectedUrl= driver.getCurrentUrl();
		  if(!actualUrl.equalsIgnoreCase(expectedUrl)) {
		  System.out.println("Login UnSuccessful"); }
		  driver.manage().window().maximize();
}



}




