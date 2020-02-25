package SDETAutomtaion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Login001 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//Abhishek//Desktop//Selenium project//New Sel//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement  username =driver.findElement(By.name("userName"));
		username.sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		String Exptitle="Register: Mercury Tours";
		String acctitile=driver.getTitle();
		
		if (Exptitle.equals(acctitile))
{
		System.out.println("test is passed");
		
	}
		else
		{
			System.out.println("test is failed ");
		}
}
}
