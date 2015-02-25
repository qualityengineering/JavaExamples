package com.stringexample;

public class substring {
	public static void main(String args[]){
		 try {
		String Str = new String("APPLE");


	      System.out.print("Return Value :" );
	      System.out.println(Str.substring(3, 5) );
		 }
		 catch (StringIndexOutOfBoundsException e) {
	         System.out.println("String is out of Bounds"+e);
	      }
	}

}
