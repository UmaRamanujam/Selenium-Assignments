package week1.day2;

public class Browser 

  {
   public void  launchBrowser(String browserName)
   {
	   System.out.println("The Browser Name is " +browserName);
   }
   public void  loadUrl()
   {
	   System.out.println( "Url loaded successfully");
   }


public static void main(String[] args)
{
Browser b=new Browser();
b.launchBrowser("firefox");
b.loadUrl();
}
}