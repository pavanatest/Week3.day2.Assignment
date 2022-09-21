package week3.day2.homework;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for (int h:arr)
		{
			map.put(h, map.getOrDefault(h, 0)+1);
		}
		System.out.println(map);
		

		
	}

}
