package learnigpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Elementcheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		driver.get("https://krninformatix.com/sample.html");
		boolean checkboxstatus = driver.findElement(By.id("rem")).isSelected();
		System.out.println(checkboxstatus);
		
		//unckeck to ckeck 
		Thread.sleep(2000);
		driver.findElement(By.id("rem")).click();
		boolean checkboxstatus_1 = driver.findElement(By.id("rem")).isSelected();
		System.out.println(checkboxstatus_1);
		
		//chekced to uncheck 
		Thread.sleep(2000);
		driver.findElement(By.id("rem")).click();
		boolean checkboxstatus_2 = driver.findElement(By.id("rem")).isSelected();
		System.out.println(checkboxstatus_2);
		
		Thread.sleep(2000);
		if(!checkboxstatus_2){
			driver.findElement(By.id("rem")).click();
		}
		
	}

}
