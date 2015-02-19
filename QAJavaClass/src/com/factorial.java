package com;

public class factorial {
	public static void main(String args[]){
		int result=1;
		int result2=1;
		int n=6;
		for (int i = 1; i <= n; i++) {
			   result = result * i;
			}
		for (int i = n; i >= 1; i--) {
			   result2 = result2 * i;
			}
		System.out.println(result);
		System.out.println(result2);
	}
}
