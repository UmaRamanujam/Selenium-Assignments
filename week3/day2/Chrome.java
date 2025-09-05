package week3.day2;

public class Chrome extends Browser {
	public void openIncognito()
	{
		System.out.println("openIncognito mode is opened--->Chrome");
	}
	public void clearCache()
	{
		System.out.println("Cache is cleared ---> Chrome");
	}
public static void main(String[] args) {
	Chrome C=new Chrome();
    C.openIncognito();
	C.clearCache();
	C.openURL();
	C.closeBrowser();
	C.navigateBack();
	System.out.println(C.browserName);
}
}
