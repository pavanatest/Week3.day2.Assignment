package week3.day2.homework;

import java.util.ArrayList;
import java.util.List;

/*
* Pseudo Code

* a) Declare An array for {3,2,11,4,6,7};	 
* b) Declare another array for {1,2,8,4,9,7};
* c) Declare for loop iterator from 0 to array length
* d) Declare a nested for another array from 0 to array length
* e) Compare Both the arrays using a condition statement

*  f) Print the first array (shoud match item in both arrays)
*/

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] FirstArray= {3,2,11,4,6,7};
		int[] SecondArray= {1,2,8,4,9,7};
		List<Integer> L1=new ArrayList<Integer>();
		for(Integer I1:FirstArray)
		{
			L1.add(I1);
		}
		List<Integer> L2=new ArrayList<Integer>();
		for (Integer I2:SecondArray)
		{
			L2.add(I2);
		}
		//System.out.println(L1);
		L1.retainAll(L2);
		System.out.println("the common values is "+L1);
		}
	}


