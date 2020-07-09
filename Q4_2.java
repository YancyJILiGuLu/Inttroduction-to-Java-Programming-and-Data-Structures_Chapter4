package chapter4;

import java.util.Scanner;

public class Q4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees:");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		System.out.println("Enter point 2 (latitude and longitude) in degrees:");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		
		double x1Inradiens = Math.toRadians(x1);
		double y1Inradiens = Math.toRadians(y1);
		double x2Inradiens = Math.toRadians(x2);
		double y2Inradiens = Math.toRadians(y2);
		
		double d = 6371.01 * (Math.acos
				((Math.sin(x1Inradiens)*Math.sin(x2Inradiens)+
						Math.cos(x1Inradiens)*Math.cos(x2Inradiens)*Math.cos(y1Inradiens-y2Inradiens))));
		
		System.out.printf("The distance between the two points is %f"+  "km",d);
	}

}
