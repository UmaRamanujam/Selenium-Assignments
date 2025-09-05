package week3.day1;

public class RemoveDupWordsInaString {
	
	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		int count=0;
		String[] splittext=text.split(" ");
		System.out.print("Given String: ");
		System.out.println(text);
		System.out.print("Result: ");
		
		for (int i=0; i<splittext.length; i++)
		{
			for (int j=i+1; j<splittext.length; j++)
			{
				if (splittext[i].equalsIgnoreCase(splittext[j]))
				{
					splittext[j]=" ";
					count++;
				}
			}
	    }
       if (count>1)
       {
    	   for(int i=0; i<splittext.length; i++)
    	   {
    	     String newtext=splittext[i];
    	   
    	     if (!newtext.isEmpty())
    	     {
    		   System.out.print(newtext+" ");
    	     }
    	     else
    	     {
    		   System.out.print(" ");
    	     }
    	    }
    	   
       }
	   
	}
}
