package learnigpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class singledropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://krninformatix.com/sample.html");
		
		//Identify Select drop down
		WebElement Selectlist= driver.findElement(By.id("City"));
		
		//Object for Select Class, Select Class's Constructor takes WebElement. This Select Class has 3 methods  
		Select SL = new Select(Selectlist);
		
		//Select by Index
		SL.selectByIndex(0);
		Thread.sleep(3000);
		//Select by value
		SL.selectByValue("3");
		Thread.sleep(3000);
		//Select by Visible Text
		SL.selectByVisibleText("Chennai");
		
		

	}

}
