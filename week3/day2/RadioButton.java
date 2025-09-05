package week3.day2;

public class RadioButton extends Button {
	public void selectRadioButton()
	{
		System.out.println("Radio Button Selected");
	}
    public static void main(String[] args) {
    	RadioButton RB=new RadioButton();
    	RB.selectRadioButton();
    	RB.submit();
    	RB.setText("WebElement called from RadioButton Class");
	
}
}
