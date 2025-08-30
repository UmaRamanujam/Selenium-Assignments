package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		driver.findElement(By.xpath("(//input[@class=' x-form-text x-form-field'])[30]")).sendKeys("55");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		
		String displaytext=driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(displaytext);	
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(displaytext);
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		String displaytext1 = driver.findElement(By.xpath("//div[text()='No records to display')]")).getText();
		System.out.println(displaytext1);
		String displaytext2 ="No records to display";
		
		if (displaytext1.equals(displaytext2))
		{
			System.out.println("Account deleted Successfully");
		}
		else
		{
			System.out.println("Account Not deleted Successfully");
		}
		

	}

}
