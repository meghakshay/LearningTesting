package learnigpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement cities= driver.findElement(By.id("cities"));
		
		//Object of select class to use method of that class
		Select multiselect = new Select(cities);
		
		//select by index
		multiselect.selectByIndex(0);
		
		//select by value
		multiselect.selectByValue("4");
		
		//select by visible text
		multiselect.selectByVisibleText("Mumbai");
		
		//deselect all the selected options

		//multiselect.deselectAll();
		/*
		//deselect by index()
		multiselect.deselectByIndex(0);
		*/
		/*
		//deselect by value
		multiselect.deselectByValue("4");
		*/
		/*deselect by visible text
		multiselect.deselectByVisibleText("Mumbai");*/
		
		List<WebElement>all_options= multiselect.getAllSelectedOptions();
		int size_of_alloptions= all_options.size();
		for (int i = 0; i <size_of_alloptions; i++) {
			WebElement options=all_options.get(i);
			String text= options.getText();
			//System.out.println(all_options.get(i));
			System.out.println(text);
		}

	}
//Select class is use for select tag only for other click will be use
}
