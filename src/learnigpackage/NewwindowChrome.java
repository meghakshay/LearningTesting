package learnigpackage;

import java.security.spec.KeySpec;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class NewwindowChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Thread.sleep(3000);
		Set<String> allWindoows=driver.getWindowHandles();

		Iterator<String> It = allWindoows.iterator();
		String firstTab = It.next();
		String SecondTab = It.next();
		driver.switchTo().window(SecondTab);
		driver.findElement(By.id("stationFrom")).sendKeys("Bengaluru (BLR)");
		driver.findElement(By.id("stationTo")).sendKeys("Jodhpur");
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(firstTab);
		driver.findElement(By.xpath("//input[@placeholder ='From*']")).sendKeys("Bengaluru");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
