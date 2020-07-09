package chapter4;

import java.util.Scanner;

public class Q4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the side of  a hexagon :");
		double side=input.nextDouble();	
		double pi=3.1415926;
		
		double area=(6*Math.pow(side, 2))/(4*Math.tan((pi/6)));
		
		System.out.printf("The area of the pentagon is %.2f", area);

	}

}
