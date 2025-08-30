package week1.day2;

public class IsPrimeNumber
{
	public static void main(String[] args) 
	{
	 int n=97; //number to check it is prime or not
	 int factor=0;
	 
	 if (n<=1) //condition for 0 and 1 which are not prime numbers
     {
	  System.out.println(n +" is not a prime number");	
	 }
     else
	 {
	 
			for (int i = 1; i < n; i++)
			{
				if (n%i==0)
				factor++;
			}	
			if (factor>=2) //checking if it has more than 2 factors
			{
				System.out.println(n +" is not a prime number");
			}
			else
			{
			System.out.println(n +" is a prime number");
			}				
	}
	}
}
