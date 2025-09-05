package week3.day2;

public class TextField extends WebElement{
	public void getText(String Text)
	{
		System.out.println("Text for Text Field: " +Text);
	}
	public static void main(String[] args) {
		TextField T=new TextField();
		T.getText("Get the Text for TextField");
		T.Click();
		T.setText("setText from WebElement is called");
				
	}

}
