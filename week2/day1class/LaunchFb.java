package week2.day1class;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFb {

	public static void main(String[] args) {
		//Instantiate the browser driver
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("https://www.facebook.com/");
		//maximize the screen
		driver.manage().window().maximize();
		
		//title
		String title=driver.getTitle();
		System.out.println(title);
		//driver.close();

	}

}
