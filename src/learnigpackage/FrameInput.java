package learnigpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInput {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/frames/frames.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriver input_box= driver.switchTo().frame(driver.findElement(By.name("name1")));
		input_box.sendKeys("Megha");
		
//		WebElement input_box = driver.findElement(By.xpath("//input[@name='name1']"));
//		input_box.click();
//		input_box.sendKeys("Megha");
	}

}
