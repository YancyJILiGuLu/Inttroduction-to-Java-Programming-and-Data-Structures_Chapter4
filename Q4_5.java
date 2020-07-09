package chapter4;

import java.util.Scanner;

public class Q4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of sides:");
		double number= input.nextDouble();
		
	
		System.out.println("Enter the side:");
		
		double side=input.nextDouble();	
		double pi=3.1415926;
		
		double area=(number*Math.pow(side, 2))/(4*Math.tan((pi/number)));
		
		System.out.printf("The area of the pentagon is %f", area);

	}

}
