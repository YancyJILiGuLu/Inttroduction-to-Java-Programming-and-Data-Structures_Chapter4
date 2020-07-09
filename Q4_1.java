package chapter4;

import java.util.Scanner;

public class Q4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the length from the center to a vertex:");
		double length=input.nextDouble();	
		double pi=3.1415926;
		double side = 2*length * Math.sin((pi/5));
		double area=(5*Math.pow(side, 2))/(4*Math.tan((pi/5)));
		
		System.out.printf("The area of the pentagon is %.2f", area);
		
	}

}
