package chapter4;

public class Q4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generate three points
		double radius=40;
		double a1=0+(Math.random()*((2*Math.PI)-0+1)); //get a random number 0-2pi
		double x1=Math.cos(a1)*radius;
		double y1=Math.sin(a1)*radius;
		
		double a2=0+(Math.random()*((2*Math.PI)-0+1)); 
		double x2=Math.cos(a2)*radius;
		double y2=Math.sin(a2)*radius;
		
		double a3=0+(Math.random()*((2*Math.PI)-0+1)); 
		double x3=Math.cos(a3)*radius;
		double y3=Math.sin(a3)*radius;
		
		
		
		//computer three sides
		double side1=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		double side2=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		double side3=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		double shit=(side1*side1-side2*side2-side3*side3)/(-2*side2*side3);
		
		//computer three angle
		double A =Math.toDegrees((Math.acos((side1*side1-side2*side2-side3*side3)/(-2*side2*side3))));
		double B =Math.toDegrees
				((Math.acos((side2*side2-side1*side1-side3*side3)/(-2*side1*side3))));
		double C =Math.toDegrees
				((Math.acos((side3*side3-side2*side2-side1*side1)/(-2*side2*side1))));
		
		
		
		
		System.out.println("The three angle are "+ Math.round(A*100)/100.0+" "
				+ Math.round(B*100)/100.0+" "+Math.round(C*100)/100.0);
		
		

	}

}
