package frameworkpracticetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import frameworkpractice.basetest.BaseTest;

public class LoginTest extends BaseTest {
	
	WebDriver driver;
	LoginTest(WebDriver driver){
		this.driver = driver;
	}
	
	@Test
	public void login() {
		
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.cssSelector("input[name='email']").sendKeys("Port");
		driver.findElement(By.cssSelector("input[name='pass']").sendKeys("Port");
		driver.findElement(By.cssSelector("input[name='login']").click();
		
		
	}
}
