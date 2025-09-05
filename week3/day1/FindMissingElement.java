package week3.day1;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		int arr[]={1, 4,3,2,8, 6, 7};
		
		System.out.print("Given String: ");
		for(int i = 0;i < arr.length; i++)
	     {
			System.out.print(arr[i]);
		 }
		
		Arrays.sort(arr);
		System.out.println(" ");
		
		for(int i = 1; i <= arr.length; i++)
		{
			if (i!=arr[i-1])
			{
				System.out.println("Missing Element is "+i);
				break;
			}
		}
		
	}

}
