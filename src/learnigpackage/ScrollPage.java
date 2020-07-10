package learnigpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.demoguru99.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		System.out.println("one down");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-300)", "");
		System.out.println("2nd up");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)", "");
		System.out.println("3rd down");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-300)", "");
		System.out.println("4th up");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)", "");
		System.out.println("5th down");
		Thread.sleep(1000);
		driver.close();
	}

}
