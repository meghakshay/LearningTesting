package learnigpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Singleselectdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("meghaug27@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Positive@247");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("akshay purohit");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//a[@href='/profile.php?id=672637189&ref=br_rs'])[2]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//img[contains(@src,'12697169_10153294448302190_5706698513631878039_o')]")).click();
		driver.findElement(By.xpath("//a[@title='Cover Photo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class=' _6a-y _3l2t  _18vj' and @tabindex='-1']/../../..//i[@class='_6rk2 img sp_HaMHyjpGtt8 sx_bbcf2c']")).click();
		//driver.findElement(By.xpath("(//div[@class=\"_666k\"]/../../..//a[@class=' _6a-y _3l2t  _18vj' and text()='Like'])[1]")).click();			
		
		//driver.findElement(By.xpath("//i[@class='img sp_ZbJPsGEpd2V sx_613b8a'][1]")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[contains(text(), 'About')]")).click();
	
	
	}

}
