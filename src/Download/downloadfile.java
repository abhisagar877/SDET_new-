package Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadfile {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","C://Users//Abhishek//Desktop//Selenium project//New Sel//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/FileDownload.html");
	driver.findElement(By.id("textbox")).sendKeys("Abhi Testing");
	driver.findElement(By.id("createTxt")).click();
	driver.findElement(By.id("link-to-download")).click();
	System.out.println("done");
	//driver.quit();
	
	driver.findElement(By.id("pdfbox")).sendKeys("text123456");
	//driver.findElement(By.id("pdfbox")).click();//display link 
	driver.findElement(By.id("createPdf")).click();
	//download file pdf
	driver.findElement(By.xpath("//*[@id=\"pdf-link-to-download\"]")).click();
}
}
