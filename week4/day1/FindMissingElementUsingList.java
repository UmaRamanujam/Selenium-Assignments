package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementUsingList {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,10,6,8};
		
		List<Integer> numberlist = new ArrayList<Integer>();
		for (int element : array)
	    {
            numberlist.add(element);
        }
		System.out.println("Given Array as List: " +numberlist);
		Collections.sort(numberlist);
		System.out.println("Ascending Order: " +numberlist);
		System.out.print("The Missing Numbers in the Sequence are: ");
		for (int i=0; i<numberlist.size(); i++)
		{
			if(numberlist.get(i)+1 != numberlist.get(i+1))
			{
				System.out.print(numberlist.get(i)+1 +" ");
				
			}
			
		}

	}

}
