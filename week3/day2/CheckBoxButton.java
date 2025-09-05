package week3.day2;

public class CheckBoxButton extends Button{
	public void clickCheckButton()
	{
		System.out.println("Check Button Clicked");
	}
	public static void main(String[] args) {
		CheckBoxButton CB=new CheckBoxButton();
		CB.setText("Hello");
		CB.submit();
		CB.clickCheckButton();
		CB.Click();
	}

}
