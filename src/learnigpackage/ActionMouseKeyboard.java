package learnigpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseKeyboard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\\\testing\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		
		WebElement Branches = driver.findElement(By.xpath("//span[text()='Branches']"));
		act.moveToElement(Branches).perform();
		
		//Thread.sleep(3000);
		WebElement Marathahalli = driver.findElement(By.xpath("//span[text()='Marathahalli']"));
		act.moveToElement(Marathahalli).perform();
		
		//Thread.sleep(3000);
		WebElement Selenium_training = driver.findElement(By.xpath("//a[text()='Selenium-Training-in-Marathahalli']"));
		act.contextClick(Selenium_training).perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		
		
		

	}

}
