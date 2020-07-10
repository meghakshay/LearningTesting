package learnigpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//get text of all the link tags of the page \
		List <WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int listsize = allLinks.size();
		for(int i=0; i <listsize; i++) {
				WebElement link = allLinks.get(i);
				String text = link.getText();
				System.out.println(text);
		}
	}

}
