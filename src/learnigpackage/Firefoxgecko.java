package learnigpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxgecko {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		

	}

}
