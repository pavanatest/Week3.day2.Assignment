package week3.day2.homework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;




public class FirstMostDupliacte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="abbaba";
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		char[] charArray= text.toCharArray();
		for(char ch : charArray)
		{
			
			map.put(ch, map.getOrDefault(ch,0)+1) ;   
			}
		System.out.println(map);
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
		int maxOccurrence=0;
		char Key=0;
		for(Entry<Character,Integer>entry: entrySet) {
			
		
			if(entry.getValue()>maxOccurrence)
		{
			Key=entry.getKey();
			maxOccurrence=entry.getValue();
		}
			Key=entry.getKey();
			maxOccurrence=entry.getValue();
		
		}
		System.out.println("no of occurence"+  maxOccurrence);
		System.out.println("character"+ Key);
			
		}
		
	}



