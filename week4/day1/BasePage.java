package week4.day1;

public class BasePage {
	public void findElement(String Element)
	{
		System.out.println("Find Element: " +Element);
	}

	public void clickElement(String ClickElement)
	{
		System.out.println("CLick Element: " +ClickElement);
	}
	
	public void enterText(String Text)
	{
		System.out.println("Enter Text: " +Text);
	}
	
	public void performCommonTasks(int Number,String Description, Boolean Status)
	{
		System.out.println("Task performed from BasePage: " +Number +"," +Description +"," +Status);
	}
	

}
