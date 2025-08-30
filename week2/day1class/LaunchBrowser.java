package week2.day1class;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {
		//Instantiate the browser driver
ChromeDriver driver=new ChromeDriver();
//EdgeDriver edge=new EdgeDriver();
//load the url
 driver.get("http://leaftaps.com/opentaps/control/main");
	
//maximize the screen
	driver.manage().window().maximize();
	//title
	String title=driver.getTitle();
	System.out.println(title);
	}	
}
