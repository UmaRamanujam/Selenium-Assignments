package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Bags",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Laptop Bag')]")).click();
		
		Thread.sleep(3000);
		String count = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("Count of the items: " +count);
		
        //create an empty list
		List<String> list=new ArrayList<String>();
		List<WebElement> brand = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		System.out.println("List of brand of the products: ");
		
		for (WebElement iter : brand)
		{
			String brandlist=iter.getText();
			String brandlist1=brandlist.replaceAll(",", "");
			list.add(brandlist1);
		}
		System.out.println(list);
		
		//create an empty list for Bag names
		List<String> list1=new ArrayList<String>();
		List<WebElement> bag = driver.findElements(By.xpath("//h4[@class='product-product']"));
		System.out.println("List of the names of the Bags: ");
		
		for (WebElement iter1 : bag)
		{
			String baglist=iter1.getText();
			String baglist1=baglist.replaceAll(",", "");
			list.add(baglist1);
		}
		System.out.println(list1);
			
		
			}

}
