package SDETAutomtaion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFMap;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.CORBA.Current;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Abhishek//Desktop//Selenium project//New Sel//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		FileInputStream file=new FileInputStream("C://Users//Abhishek//Desktop//IMP Doc//DataDriven_testdata.xlsx");
		//getting workbook file 
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//Getting first Sheet
		XSSFSheet Sheet =workbook.getSheet("Sheet1");
		//Getting First Row 
		int noofRows=Sheet.getLastRowNum();
		System.out.println("No of record in Excel sheet:"  + noofRows);
		
		for ( int row=1; row<= noofRows; row++);
		{
			
			int row=1;
			XSSFRow Current_row= Sheet.getRow(row);
			String First_Name =Current_row.getCell(0).getStringCellValue();
			String Last_Name=Current_row.getCell(1).getStringCellValue();
			String Phone=Current_row.getCell(2).getStringCellValue();
			String Email=Current_row.getCell(3).getStringCellValue();
			String Address=Current_row.getCell(4).getStringCellValue();
			String City=Current_row.getCell(5).getStringCellValue();
			String State=Current_row.getCell(6).getStringCellValue();
			String Postal_code=Current_row.getCell(7).getStringCellValue();
			String Country=Current_row.getCell(8).getStringCellValue();
			String User_name=Current_row.getCell(9).getStringCellValue();
			String Password=Current_row.getCell(10).getStringCellValue();
			//Registration Process
			
			//Enter Contact Information
			driver.findElement(By.name("firstName")).sendKeys(First_Name);
			driver.findElement(By.name("lastName")).sendKeys(Last_Name);
			driver.findElement(By.name("phone")).sendKeys(Phone);
			driver.findElement(By.id("userName")).sendKeys(Email);
			//Mailing information
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(Postal_code);
			//Country Seletion
			Select DropCountry=new Select(driver.findElement(By.name("Country")));
			DropCountry.deselectByVisibleText(Country);
			//Enter USer Information
			driver.findElement(By.name("email")).sendKeys(User_name);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Password);
			driver.findElement(By.name("register")).click();
			if (driver.getPageSource().contains("Thank you for regsitrig"))
			{
		    System.out.println("Regsiteration complet for" + row +"record" );  
		}
		
			else
			{
				System.out.println("Registration failed For" + row + "record");
				
			}
	}
	}
}
