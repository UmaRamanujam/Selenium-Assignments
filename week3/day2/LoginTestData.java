package week3.day2;

public class LoginTestData extends TestData {
	public void enterUsername(String Uname)
	{
		System.out.println("Enter the User Name: "+Uname);
	}
	public void enterPassword(String Pword)
	{
		System.out.println("Enter the Password: "+Pword);
	}
    public static void main(String[] args) {
    	LoginTestData LTD=new LoginTestData();
    	LTD.enterCredentials();
    	LTD.enterUsername("TestLeaf");
    	LTD.enterPassword("*******");
    	LTD.navigateToHomePage();
	}
}
