package week3.day2.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
List<Integer> l=new ArrayList<Integer>();
for(Integer L : arr)
{
	l.add(L);
	
}

Collections.sort(l);
System.out.println("original List"+ l);
int size= l.size();
System.out.println("duplicate num");
for ( int j=0;j<size-1;j++)
{
	if(l.get(j)==l.get(j+1))
	{
		System.out.println(l.get(j));
	}
}
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than 0
			

	}

}
