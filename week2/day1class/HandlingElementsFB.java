package week2.day1class;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElementsFB {
	public static void main(String[] args) {
		//Instantiate the browser driver
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("https://www.facebook.com/");
		//maximize the screen
		driver.manage().window().maximize();
		
		
		//enter the username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		
		//enter the password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Tuna@321");
		//click to log in
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
	}

}
