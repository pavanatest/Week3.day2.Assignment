package week3.day2.homework;

import java.util.LinkedHashSet;
import java.util.Set;

/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="We learn java basics as part of java sessions in java week1";
		System.out.println("original text="+ text);
		
		String i[]=text.split("\\s");
		
		Set<String> value = new LinkedHashSet<String>();
		for(String s:i)
		{
			if(s!=null)
			{
				value.add(s);
				
			}
		}

		String ot="";
		for(String p:value )
		{
			ot=ot+" "+ p;
		}
		System.out.println(" after removing duplicate" +ot);
		}
	}


