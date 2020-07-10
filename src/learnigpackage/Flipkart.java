package learnigpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/home-kitchen/home-appliances/sewing-machines/pr?sid=j9e%2Cabm%2C0zg&p%5B%5D=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&p%5B%5D=facets.rating%255B%255D%3D3%25E2%2598%2585%2B%2526%2Babove&fm=neo%2Fmerchandising&iid=M_266196e1-16e9-445b-a5ad-36292af60752_20.GN9FQXFFKDEH&ppt=hp&ppn=homepage&ssid=jhrqlc96sw0000001585052904212&otracker=hp_omu_Top%2BRated%2BAppliances%2BFor%2BYou_6_11.dealCard.OMU_Top%2BRated%2BAppliances%2BFor%2BYou_GN9FQXFFKDEH_8&otracker1=hp_omu_WHITELISTED_neo%2Fmerchandising_Top%2BRated%2BAppliances%2BFor%2BYou_NA_dealCard_cc_6_NA_view-all_8&cid=GN9FQXFFKDEH");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[contains(text(), 'FM 1409')]/../../..//div[@class='_1p7h2j']")).click();
		driver.findElement(By.xpath("//div[text()='Usha']/../..//div[@class='_1p7h2j']")).click();
		//driver.findElement(By.xpath("//div[text()='Al hind']/../..//div[@class='_1p7h2j']")).click();
		
	}

}
