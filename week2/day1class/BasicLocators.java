package week2.day1class;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		//Instantiate the browser driver
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		 driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the screen
		driver.manage().window().maximize();
		
		//enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager"); //locate the element in dom
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click to log in
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmfsa
		driver.findElement(By.partialLinkText("CRM")).click();
		
	}
		

}
