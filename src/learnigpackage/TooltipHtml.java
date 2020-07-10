package learnigpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TooltipHtml {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/earton-hiking-trekking-shoes-men/p/itmf4hynmfrpsawk?pid=SHOF4HFMVMPRDWVZ&lid=LSTSHOF4HFMVMPRDWVZPX8SCW&marketplace=FLIPKART&srno=b_1_4&otracker=hp_omu_Deals%2Bof%2Bthe%2BDay_4_2.dealCard.OMU_Deals%2Bof%2Bthe%2BDay_CT6INGL4YE5D_2&otracker1=hp_omu_SECTIONED_neo%2Fmerchandising_Deals%2Bof%2Bthe%2BDay_NA_dealCard_cc_4_NA_view-all_2&fm=neo%2Fmerchandising&iid=ba29d8b0-c640-4336-ac35-f7fa94bc86f4.SHOF4HFMVMPRDWVZ.SEARCH&ppt=browse&ppn=browse&ssid=hmqbbebp9cqu0o3k1585027027420");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[(text( )= '?')  and @class= 'question'])[1]")).click();
		String TitleToolTip = driver.findElement(By.xpath("//div[@class='_3SOooe']")).getText();
		System.out.println(TitleToolTip);

	}

}
