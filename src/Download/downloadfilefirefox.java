package Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class downloadfilefirefox {
public static void main(String[] args) {
	

	
	System.setProperty("webdriver.gecko.driver","C://Users//Abhishek//Desktop//Selenium project//New Sel//geckodriver.exe");

	//creating browser profile
	FirefoxProfile profile=new FirefoxProfile();
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plan ");
	//set mine type
	profile.setPreference("browser.download.manager.showWhenStarting", false);
	FirefoxOptions option =new FirefoxOptions();
	option.setProfile(profile);
	WebDriver driver=new FirefoxDriver(option);
	driver.get("http://demo.automationtesting.in/FileDownload.html");
	driver.findElement(By.id("textbox")).sendKeys("ABhitext");
	driver.findElement(By.id("createTxt")).click();
	driver.findElement(By.id("link-to-download")).click();
	

}
}
