package Robetclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class robetclass {
public static void main(String[] args) throws AWTException {
	
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("");
	Robot robet=new Robot();
	robet.keyPress(KeyEvent.VK_DOWN);
	robet.keyPress(KeyEvent.VK_TAB);
	robet.keyPress(KeyEvent.VK_ENTER);
}

}
