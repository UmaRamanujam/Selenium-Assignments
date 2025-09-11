package week4.day1;

import java.util.ArrayList;

import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		
		int arrnum1[] = {3,2,11,4,6,7};
		int[] arrnum2= {1,2,8,4,9,7};
		
		//List<Integer> numberlist1 = new ArrayList<>(List.of(3,2,11,4,6,7));
	    // List<Integer> numberlist2=new ArrayList<Integer>(List.of(1,2,8,4,9,7));
		
		List<Integer> numberlist1 = new ArrayList<>();
		List<Integer> numberlist2 = new ArrayList<>();
		for (int element : arrnum1)
	    {
            numberlist1.add(element);
        }
	    
	    for (int element : arrnum2)
	    {
	    	numberlist2.add(element);
	    }
	    
		System.out.println("Number List 1: " +numberlist1);
		System.out.println("Number List 2: " +numberlist2);
		numberlist1.retainAll(numberlist2);
		System.out.println("Intersection: " +numberlist1);
	
	}

}
