package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Test Leaf Assignment Account");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//option[contains(text(),'Computer Software')]")).click();
		
		WebElement ownerDD=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select owner=new Select(ownerDD);
		owner.selectByVisibleText("S-Corporation");
		
		WebElement sourceDD=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select source=new Select(sourceDD);
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement MarketingCampDD=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select MC=new Select(MarketingCampDD);
		MC.selectByIndex(6);
		
		WebElement StateDD=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select state=new Select(StateDD);
		state.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement accountName = driver.findElement(By.xpath("//*[@id=\"accountName\"]"));
		String accountNameValue = accountName.getDomAttribute("value");
		System.out.println("Value stored in Account Name field :" +accountNameValue);
		
		//driver.close();
		
		

	}

}
