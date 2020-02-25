package SDETAutomtaion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C://Users//Abhishek//Desktop//Selenium project//New Sel//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	    WebElement Element= driver.findElement(By.id("animals"));
		 
		
		
	}
}
