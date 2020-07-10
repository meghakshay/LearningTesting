package learnigpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attributevalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String Att = driver.findElement(By.xpath("//a[text()='Google']")).getAttribute("href");
		System.out.println(Att);

	}

}
