package com.stringexample;

public class FirstNonRepeat {
	public static void main(String args[]){
			
		String str="aabbccadef";
		char array[]=new char[str.length()];
    
			for(int i=0;i<str.length();i++){
					array[i]=str.charAt(i);
			}
    
			for(int i=0;i<str.length();i++){
				int flag=0;
				
				for(int j=0;j<str.length();j++){
					if(array[i]==array[j]){
								flag++;
					}
				}

        if(flag==1){
         System.out.println(array[i]+" is not repeated");
         break;
        }
    }
	}
}
