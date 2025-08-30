package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int firstnumber=0;
		int secondnumber=1;
		int inputrange=8;
		int nextnumber;
		System.out.print("Fibonacci Series range of " +inputrange + " is ");
		for (int i = 0; i < inputrange; i++) 
		{	
		System.out.print(firstnumber+", ");
		nextnumber=firstnumber+secondnumber;
		firstnumber=secondnumber;
		secondnumber=nextnumber;
		}	
		
	}
}
