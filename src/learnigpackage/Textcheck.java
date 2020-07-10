package learnigpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textcheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		String Expectedtext = "Enter Time-Track";
		String Actualtext = driver.findElement(By.xpath("(//td[@class=\"pagetitle\"])[1]")).getText();
		
		if (Expectedtext.equals(Actualtext)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}

	}

}
