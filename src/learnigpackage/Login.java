package learnigpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","D:\\Testing\\eclipse-workspace\\geckodriver.exe");
	
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	DataFile dataobj = new DataFile();
	String UN = null;
	String PW = null;
	for (int i = 1; i <= 2; i++) {
		 UN = dataobj.Exceldata("sheet1",i, 0);
		 PW = dataobj.Exceldata("sheet1", i, 1);
		System.out.println(UN);
		System.out.println(PW);

		
		driver.findElement(By.id("username")).sendKeys(UN);
		driver.findElement(By.name("pwd")).sendKeys(PW);
		
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("logoutLink")).click();
	}
	
	

	
	}
}