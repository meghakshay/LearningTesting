package learnigpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendarpopup {
//This type is calendar allow only click to select the date 
	public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","D:\\\\testing\\\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[contains(@class,'onward')]")).click();
			driver.findElement(By.xpath("(//td[text()='31'])[2]")).click();
			
			
	}
}
