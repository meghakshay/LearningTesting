package learnigpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String TitleToolTip= driver.findElement(By.xpath("//img[contains(@src,'samsung-galaxy-a41-.jpg')]")).getAttribute("title");
		System.out.println(TitleToolTip);
	}

}
