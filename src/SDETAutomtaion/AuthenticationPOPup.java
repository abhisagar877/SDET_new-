package SDETAutomtaion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPOPup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C://Users//Abhishek//Desktop//Selenium project//New Sel//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://the-internet.herokuapp.com/basic_auth");
	//https;//username:passowrd@test.com
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	 String A=driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
	System.out.println(A);
	
}
	
}
