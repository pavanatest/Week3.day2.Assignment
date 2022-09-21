package week3.day2.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
		
				int[] data = {3,2,11,4,6,7};
				List <Integer> dataList= new ArrayList<Integer>();
				for ( int g  :data)
				{
					dataList.add(g);
					
				}

				System.out.println("original list "+ dataList);
				Collections.sort(dataList);
				System.out.println("Ascending order");
				for(int d1 :dataList)
				{
					System.out.println(d1);
				}
				Integer bg=dataList.get(dataList.size()-2);
				System.out.println("the second largest element "+bg);
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				

	}

}
