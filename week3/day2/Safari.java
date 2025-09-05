package week3.day2;

public class Safari extends Browser{
	public void readerMode()
	{
		System.out.println("Reader mode on ---> Safari");
	}
    public void fullScreenMode()
    {
    	System.out.println("Full Screen mode on ---> Safari");
    }
    public static void main(String[] args) {
		Safari S=new Safari();
		S.readerMode();
		S.fullScreenMode();
		S.openURL();
		S.navigateBack();
		System.out.println(S.browserVersion);
	
		
	}
}
