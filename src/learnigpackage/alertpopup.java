package learnigpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Testing\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		String altertext=driver.switchTo().alert().getText();
		System.out.println(altertext);
		driver.switchTo().alert().accept();
		
			
	}

}
