package learnigpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Alloption {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement all_web_elements=driver.findElement(By.id("City"));
		
		Select ss= new Select(all_web_elements);
		
		
		//getOption() method of select class gives list of webElement
		List<WebElement>all_options= ss.getOptions();
			//System.out.println(ss.getOptions());		
		//From list of webElement get() gives one webElement 
		WebElement option_1=all_options.get(0);
		
		//from one given option get the text by getText()
		String text_1=option_1.getText();
		System.out.println(text_1);
		
		
		//To get all the options we need to write loop 
		int size_of_alloptions=all_options.size();
		System.out.println(size_of_alloptions);
		for (int i = 0; i <size_of_alloptions; i++) {
			WebElement options=all_options.get(i);
			String text= options.getText();
			//System.out.println(all_options.get(i));
			System.out.println(text);
		}
	}

}
//what is the difference between list of WebElement and list of String
//From list of String direct fetch the text