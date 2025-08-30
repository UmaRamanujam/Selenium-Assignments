package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		
	ChromeOptions options=new ChromeOptions();
	options.addArguments("guest");
	
	//Instantiate the browser driver
	ChromeDriver driver=new ChromeDriver();
	//Load the URL
	 driver.get("http://leaftaps.com/opentaps/");
	//maximize the screen
	driver.manage().window().maximize();
	
	//enter the username
	driver.findElement(By.id("username")).sendKeys("demosalesmanager"); 
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
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Company");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Firstname");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Last Name");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Automation Tester");
	
	WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select select=new Select(sourceDD);
	select.selectByIndex(4);
	
	WebElement MarketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select markc=new Select(MarketingDD);
	markc.selectByVisibleText("Automobile");
	
	WebElement OwnershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select owener=new Select(OwnershipDD);
	owener.selectByValue("OWN_SCORP");
	
	driver.findElement(By.name("submitButton")).click();
	String title=driver.getTitle();
	System.out.println(title);
	//driver.close();
	
	
	
	}
}
