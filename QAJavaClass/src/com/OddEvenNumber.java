package com;

public class OddEvenNumber {
	public static void main(String[] args) {
		System.out.println("Even Numbers");
		for(int i=1; i <= 10; i++){
            
            // if the number is divisible by 2 then it is even
            if( i % 2 == 0){
                    System.out.println(i + " ");
            }
            
    }
		System.out.println("Odd Numbers");
		for(int i=1; i <= 10; i++){
            
            //if the number is not divisible by 2 then it is odd
            if( i % 2 != 0){
                    System.out.println(i + " ");
            }
    }
	}
}
