package com.stringexample;

public class CompareString {
	public static void main(String args[]){
		String s1 ="kushal";
		String s2 = "Kushal";
		
		s1.equalsIgnoreCase(s2);
		
		if(s1==s2){
			
			System.out.print("Is equal");
			
		}
		else{
			System.out.print("Is not equal");
			
		}
	}
}
