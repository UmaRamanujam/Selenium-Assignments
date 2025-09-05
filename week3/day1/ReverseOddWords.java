package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] words=test.split(" ");
		System.out.print("Given String: ");
		System.out.println(test);
		System.out.print("Result: ");
		for (int i=0; i<words.length; i++)
		{
			if (i%2!=0)
			{
				char[] words1=words[i].toCharArray();
				for(int j=words1.length-1; j>=0;j--)
				{
					System.out.print(words1[j]);
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(words[i]  +" ");
			}
		}
		
		
	}

}
