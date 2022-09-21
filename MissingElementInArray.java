package week3.day2.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> mele=new ArrayList<Integer> ();
		for(int e: arr)
		{
			mele.add(e);
			
		}
		
		System.out.println("original number"+ mele);

		Collections.sort(mele);
		System.out.println("sorted number=");
		for( int t :mele)
		{
			System.out.println(t + " ");
		}
		
		int size=mele.size();
		System.out.println("size is "+size);
		System.out.println("missing element =");
		
		int j=0;
		for (int i=1; i<=size;i++)
		{
			
			if(j<size && i== mele.get(j))
			{
				j++;
			}
			else
			{
				System.out.println(i + "");
				
			}
		}
	
	}

}


//Here is the input
		

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				
				
		

