package Datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepiker {
	public static void main(String[] args) {
		
	}
	static WebDriver driver;
    private String today;
    
    	public static void setupTest() {
    		System.setProperty("webdriver.chrome.driver","C://Users//Abhishek//Desktop//Selenium project//New Sel//chromedriver.exe");
    		WebDriver driver=new ChromeDriver();
            driver.navigate().to("http://www.turkishairlines.com");
            driver.manage().window().maximize();
    	}
    	 public void datePickerTest() {
		
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 today = getCurrentDay();
         System.out.println("Today's number: " + today + "\n");
         driver.findElement(By.xpath("//*[@id=\"calendarPlaceholder\"]/span[2]/i[1]")).click();
	}
    	 private String getCurrentDay (){
    	        //Create a Calendar Object
    	        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
    	 
    	        //Get Current Day as a number
    	        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
    	        System.out.println("Today Int: " + todayInt +"\n");
    	 
    	        //Integer to String Conversion
    	        String todayStr = Integer.toString(todayInt);
    	        System.out.println("Today Str: " + todayStr + "\n");
    	 
    	        return todayStr;
    	    }
    	}
    	
