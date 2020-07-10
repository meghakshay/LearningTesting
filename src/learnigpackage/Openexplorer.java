package learnigpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Openexplorer {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","D:\\testing\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

	}

}
