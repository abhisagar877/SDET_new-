package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//1)create connection
//2)create Statment
//3)excute Statment
//4)close connection

public class database {

	public static void main(String[] args) throws SQLException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Abhishek//Desktop//Selenium project//New Sel//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Connection con=DriverManager.getConnection("\"jdbc:mysql://ipaddress:portnumber/db_name\"		");
		
		//create new Statment
		Statement stmt=con.createStatement();
		
		//Exeute Sql Statment
		String S="insert into users value(101)";
		stmt.executeQuery("S");
		
		//Statment Close
		con.close();
		System.out.println(" program is excuted");
	}
}
