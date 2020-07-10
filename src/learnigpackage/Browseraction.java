package learnigpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browseraction {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//To Click on About us link )
		driver.findElement(By.xpath("//a[@href='about-us.php' and text()='About us']")).click();
		
		//To click on Back Button
		driver.navigate().back();
		
		//To click on Forword Botton
		driver.navigate().forward();
		
		//To Refresh the page
		driver.navigate().refresh();
		
		//To Close the Browser 
		driver.close();
		
		//Alternative of close() is Quit 
	}

}
