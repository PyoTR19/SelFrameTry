package frameworkpractice.basetest;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

		

	public static void main(String[] args) throws IOException {
	//public void setupDriver(){
		// TODO Auto-generated method stub
		
		Properties prop;
		FileInputStream fis = new FileInputStream("C:\\Users\\RYAN\\new_workspace\\FrameworkDesignPractice\\src\\main\\resources\\GlobalData.properties");

		prop = new Properties();
		prop.load(fis);
		String initBrowser = prop.getProperty("browser");
		
		
		if( initBrowser == "chrome") {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		}else if ( initBrowser == "edge") {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		}else if(initBrowser == "firefox") {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		}
		
		
		
	}
	
}
