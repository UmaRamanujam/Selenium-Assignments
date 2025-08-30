package week2.day1class;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownElements {

	public static void main(String[] args) {
		
			//Instantiate the browser driver
			ChromeDriver driver=new ChromeDriver();
			//Load the URL
			 driver.get("http://leaftaps.com/opentaps/");
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
			//Click on the Leads tab
			driver.findElement(By.partialLinkText("Leads")).click();
			//Click on the Create Lead link from shortcuts
			driver.findElement(By.partialLinkText("Create Lead")).click();
			//Enter the mandatory fields on the web page.
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Firstname");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Last Name");
			//Select Employee in the source dropdown (using index) 
			
			}

}
