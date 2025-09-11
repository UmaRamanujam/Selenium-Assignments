package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingArray {

	public static void main(String[] args) {
		String array[]= {"HCL","Wipro","Aspire System", "CTS"};
		
		List<String> list=new ArrayList<String>();
		for (String iter : array)
		{
			list.add(iter);
		}
		
		System.out.println("Given Array as List: " +list);
		Collections.sort(list);
		System.out.println("List in Ascending Order: " +list);
		//Collections.sort(list, Collections.reverseOrder());
		//System.out.println("List in Descending Order: " +list);
		System.out.print("Expected Output: ");
		for (int i = list.size() - 1; i >= 0; i--) 
		{
            System.out.print(list.get(i) +" ");
		}
	}

}
