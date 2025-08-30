package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbHomeAssignmentsWithHints {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("UR Firstname");
		driver.findElement(By.name("lastname")).sendKeys("UR Lastname");
		driver.findElement(By.name("reg_email__")).sendKeys("ur@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password@123");
		
		WebElement DayDOBDD=driver.findElement(By.id("day"));
		Select day=new Select(DayDOBDD);
		day.selectByValue("24");
		
		WebElement MonDOBDD=driver.findElement(By.id("month"));
		Select month=new Select(MonDOBDD);
		month.selectByValue("1");
		
		WebElement YearDOBDD=driver.findElement(By.id("year"));
		Select year=new Select(YearDOBDD);
		year.selectByIndex(13);
		
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		
	}

}
