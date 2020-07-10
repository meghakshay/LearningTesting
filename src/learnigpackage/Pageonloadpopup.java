package learnigpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pageonloadpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\\\testing\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://admin:manager@www.engprod-charter.net");

	}

}
