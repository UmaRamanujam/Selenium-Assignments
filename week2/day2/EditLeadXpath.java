package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TL");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Xpath First Name");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Xpath Last Name");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Selenium Automation Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		
		WebElement StateDD=driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select state=new Select(StateDD);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.partialLinkText("Edit")).click();
		
		WebElement description = driver.findElement(By.name("description"));
	    description.clear();
	    
	    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Description cleared");
	    driver.findElement(By.xpath("//input[@value='Update']")).click();
	    
	    String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();

	}

}
