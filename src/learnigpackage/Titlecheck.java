package learnigpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Titlecheck {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		String Expectedtitle = "actiTIME - Login";
		String Actualttle = driver.getTitle();
		
		if(Expectedtitle.equals(Actualttle)) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}
		
	}

}
