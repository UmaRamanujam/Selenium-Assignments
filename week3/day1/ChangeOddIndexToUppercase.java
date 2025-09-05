package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test="changeme";
		char[] charArray=test.toCharArray();
		System.out.print("Given String:");
		System.out.println(test);
		for (int i=0; i<charArray.length; i++)
		{
			if(i%2!=0)
			{
			charArray[i] = Character.toUpperCase(charArray[i]);
			}		
		}
		System.out.print("Changed String:");
		System.out.println(charArray);
	}

}
