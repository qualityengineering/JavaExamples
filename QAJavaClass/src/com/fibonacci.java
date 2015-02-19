package com;

public class fibonacci {
	public static void main(String args[])
	{
		int n=10;
		int a=0;
		int b=1;

		for(int i=1;i<n;i++)
			{
				int temp = a;
				a = b;
				b= temp + b;					
				System.out.println(temp);
			}
	}
}
