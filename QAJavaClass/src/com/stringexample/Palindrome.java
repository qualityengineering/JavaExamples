package com.stringexample;

public class Palindrome {
	public static void main(String args[]){
		String str=""; 
		String reverse="";
		 if(str!=null && str!= ""){
	      for ( int i = str.length() - 1; i >= 0; i-- )
	         reverse = reverse + str.charAt(i);
	 
	      if (str.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
		 }
		 else{
			 System.out.println("Please enter valid string");
		 }
	}
}
