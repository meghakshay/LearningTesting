package learnigpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class OpenInNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\Testing\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement About = driver.findElement(By.xpath("//a[text()='About']"));
		try {
			Actions act = new Actions(driver);
			act.moveToElement(About);
			Thread.sleep(3000);
			act.contextClick(About).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	
//		System.setProperty("webdriver.gecko.driver","D:\\Testing\\eclipse-workspace\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		WebElement Amazon_pay = driver.findElement(By.xpath("//a[text()='Amazon Pay']"));
//		try {
//			Actions act = new Actions(driver);
//			act.moveToElement(Amazon_pay);
//			Thread.sleep(3000);
//			act.contextClick(Amazon_pay).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		
//		Thread.sleep(3000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ENTER).perform();
	}

}
