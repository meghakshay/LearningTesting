package learnigpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFile {

	public static void main(String[] args) {
		FileDownload file_download= new FileDownload();
		file_download.DownloadToDownloadFolder();
		file_download.DownloadToDesktop();
		
	}

}

class FileDownload{
	public void DownloadToDownloadFolder() {
		System.setProperty("webdriver.gecko.driver","D:\\Testing\\eclipse-workspace\\geckodriver.exe");
		
		FirefoxProfile prof = new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");	
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(prof);
		
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/download.php");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://goo.gl/uJJ5Sc']")).click();
	}
	
	public void DownloadToDesktop() {
		System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver.exe");
		
		FirefoxProfile prof = new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		prof.setPreference("browser.download.folderList", 0);
		FirefoxOptions Options = new FirefoxOptions();
		Options.setProfile(prof);
		
		WebDriver driver = new FirefoxDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/download.php");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://goo.gl/uJJ5Sc']")).click();
		
	}
	public void DownloadToCustomFolder() {
		
	}
}