package com;

public class TriangleAnalyzer {
	
		public static void main(String args[])
			{
				int side1=3;
				int side2=3;
				int side3=3;
				
				if((side1+side2>side3) && (side2+side3>side1) && (side3+side1>side2))
					{
						System.out.println("Its a Triangle");
						
						if((side1==side2) && (side2==side3))
							{
								System.out.println("Equi Triangle");
							}
						else if((side1==side2)||(side2==side3)||(side3==side1))
							{
								System.out.println("Iosceles Triangle");
							}
						else
							{
								System.out.println("Iosceles Triangle");
							}
					}
				else
					{
						System.out.println("Its NOT a Triangle");
					}
	
			}
}
