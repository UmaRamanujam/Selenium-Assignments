package week4.day1;

public class LoginPage extends BasePage {
	public void  performCommonTasks()
	{
		System.out.println("Perform Common Tasks from LoginPage");
	super.performCommonTasks(1, "Login", true);
	}
	
	public static void main(String[] args) {
		LoginPage LP = new LoginPage();
		LP.performCommonTasks();
		//LP.performCommonTasks(2, "Login", false);
	}

}
