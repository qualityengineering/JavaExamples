package com.nextgeonjava;

public class ascendingorderarray {
	 public static void main(String args[]){
		 int a[]={125,1,2,5,150,100};
		 int swap;
		 for(int i = 0; i < a.length; i++)
	        {
			int index=a[i];
			 
			 for(int j = 1; j<=a.length; j++)
				 if(index>a[i]){
					 swap=index;
					 index=a[i];
					 a[j-1]=a[j];
					
				 }
			 
				 
	            
	            
			 for(int k = 0;k <a.length; k++)
		 System.out.print(a[i]+" ");
		 
}
}}