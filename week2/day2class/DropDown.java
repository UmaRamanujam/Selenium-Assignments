package week2.day2class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");//to disable notifications

		//Instantiate the browser driver
		ChromeDriver driver=new ChromeDriver(options);
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
		driver.findElement(By.linkText("Leads")).click();
		//Click on the Create Lead link from shortcuts
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter the mandatory fields on the web page.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Firstname");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Last Name");
		//Select Employee in the source dropdown (using index) 
		//steps to use index - identify the dropdown, select tag,locate the element & store it in variable
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select=new Select(sourceDD);
		select.selectByIndex(4);
		//Select Automobile in the Marketing Campaign (using visibleText)
		WebElement MarketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select markc=new Select(MarketingDD);
		markc.selectByVisibleText("Automobile");
		//Select Corporation in Ownership (using value)
		WebElement OwnershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select owener=new Select(OwnershipDD);
		owener.selectByValue("OWN_SCORP");
		//Click on the Create Lead button.
		driver.findElement(By.name("submitButton")).click();
		//Print the title of the current web page
		String title=driver.getTitle();
		System.out.println(title);
		//driver.close();
		
	}

}
