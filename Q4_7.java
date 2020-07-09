package chapter4;

import java.util.Scanner;

public class Q4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the radius of the bounding circle:");
		double radius=input.nextDouble();	
		// once got radius , we can figure out p2, and divide the whole degree(360)by5=72
		
		
		double xOfP2=0;
		double yOfP2=radius;
		
		double randiansOfP1 =Math.toRadians(72);
		double xOfP1=radius*(Math.sin(randiansOfP1));
		double yOfP1= radius*(Math.cos(randiansOfP1));
		
		double randiansOfP5 =Math.toRadians((72+72-90));
		double xOfP5=radius*(Math.cos(randiansOfP5));
		double yOfP5= radius*(Math.sin(randiansOfP5));
		
		double randiansOfP4 =Math.toRadians((72+72+72-180));
		double xOfP4=radius*(Math.sin(randiansOfP4));
		double yOfP4= radius*(Math.cos(randiansOfP4));
		
		double randiansOfP3 =Math.toRadians((72+72+72+72-180-90));
		double xOfP3=radius*(Math.cos(randiansOfP3));
		double yOfP3= radius*(Math.sin(randiansOfP3));
		
		
		System.out.println("The coordinates if five points on the pentagon are:");
		System.out.println("("+Math.round(xOfP1*100)/100.0+", "+Math.round(yOfP1*100)/100.0+")");
		System.out.println("("+Math.round(xOfP2*100)/100.0+", "+Math.round(yOfP2*100)/100.0+")");
		System.out.println("("+Math.round(xOfP3*100)/100.0+", "+Math.round(yOfP3*100)/100.0+")");
		System.out.println("("+Math.round(xOfP4*100)/100.0+", "+Math.round(yOfP4*100)/100.0+")");
		System.out.println("("+Math.round(xOfP5*100)/100.0+", "+Math.round(yOfP5*100)/100.0+")");


	}

}
