package week3.day2;

public class Edge extends Chrome {
	public void takeSnap()
	{
		System.out.println("Snap Taken ---> Edge");
	}

	public void  clearCookies()
	{
		System.out.println("Cookies Cleared ---> Edge");
	}
	public static void main(String[] args) {
		Edge E=new Edge();
		E.takeSnap();
		E.clearCookies();
		E.openIncognito();
		E.clearCache();
		E.openURL();
		System.out.println(E.browserName);
	    System.out.println(E.browserVersion);
		
	}
	
}
