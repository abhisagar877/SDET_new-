package Brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink {
public static void main(String[] args) throws InterruptedException, URISyntaxException, IOException {
	System.setProperty("webdriver.chrome.driver","C://Users//Abhishek//Desktop//Selenium project//New Sel//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	Thread.sleep(2000);
	//capture the link 
	List <WebElement>links= driver.findElements(By.tagName("a"));
	//number of links
	System.out.println(links.size());
	for (int i=0;i<links.size();i++)
	{
		//by using href attribute we can get URL of rewuired link
		
		WebElement element =links.get(i);
		String Url=element.getAttribute("href");
		
		URL link=new URL(Url);
		
		//Create connection using url object "link"
		HttpURLConnection httpconn= (HttpURLConnection) link.openConnection();
		//Wait2 Sec
		Thread.sleep(2000);
		//Estableste connection
		
		httpconn.connect();
		
		//capture respose code 
		int rescode=httpconn.getResponseCode();//resturn respoce code ,if res code is above 400
		
		if (rescode>=400)
		{
			System.out.println(Url +" -"+ "is boken link");
		}
		else
		{
			System.out.println(Url +" -"+"is valid link");
		}
	}
}
}
