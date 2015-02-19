package com;

public class Calculate {
	public static void main(String args[]){
		int res1=(10*2+5)/2;
		float res2=(float) ((10*2+5)/(1.9));
		
		//BigDecimal res2 = new BigDecimal((10*2+5)/2);
		
		System.out.println("Integer:" +res1);
		System.out.println("Float:" +res2);
	}
}
