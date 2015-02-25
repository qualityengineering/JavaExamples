package com.stringexample;

public class SentanceReverse {
	public static void main(String args[]){
		String sentence="My Name is kushal";
		String[] words = sentence.split (" ");
		System.out.println ( " The reversed words are : ");
		 
		for(int x = words.length - 1; x > -1; x--){
		    System.out.print(words[x] + " ");
		    }
		}
		
	}

