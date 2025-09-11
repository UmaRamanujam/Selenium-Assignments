package week4.day2;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameAndAlert {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
        alert.dismiss();
        
        String Msge = driver.findElement(By.id("demo")).getText();
        System.out.println(Msge);
	}
}
