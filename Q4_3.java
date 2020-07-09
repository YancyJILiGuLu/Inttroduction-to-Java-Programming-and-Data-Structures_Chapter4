package chapter4;

public class Q4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set location of Atlanta as (x1,y1)
		// set location of Charlotte as (x2,y2)
		// set location of Savannah as (x3,y3)
		// set location of Orlando as (x4,y4)
		
		double x1=33.7489954;
		double y1=-84.3879824;
		double x2=35.2270869;
		double y2=-80.8431267;
		double x3=32.0835407;
		double y3=-81.0998342;
		double x4=28.5383355;
		double y4=-81.3792365;
		
		double x1Inradiens = Math.toRadians(x1);
		double y1Inradiens = Math.toRadians(y1);
		double x2Inradiens = Math.toRadians(x2);
		double y2Inradiens = Math.toRadians(y2);
		double x3Inradiens = Math.toRadians(x3);
		double y3Inradiens = Math.toRadians(y3);
		double x4Inradiens = Math.toRadians(x4);
		double y4Inradiens = Math.toRadians(y4);
		
		//distance between Atlanta and Charlotte
		double d1 = 6371.01 * (Math.acos
				((Math.sin(x1Inradiens)*Math.sin(x2Inradiens)+
						Math.cos(x1Inradiens)*Math.cos(x2Inradiens)*
						Math.cos(y1Inradiens-y2Inradiens))));
		//distance between Charlotte and Savannah
		double d2 = 6371.01 * (Math.acos
				((Math.sin(x2Inradiens)*Math.sin(x3Inradiens)+
						Math.cos(x2Inradiens)*
						Math.cos(x3Inradiens)*Math.cos(y2Inradiens-y3Inradiens))));
		//distance between Savannah and Orlando
				double d3 = 6371.01 * (Math.acos
						((Math.sin(x3Inradiens)*Math.sin(x4Inradiens)+
								Math.cos(x3Inradiens)*
								Math.cos(x4Inradiens)*Math.cos(y3Inradiens-y4Inradiens))));
				//distance between Orlando and Atlanta
				double d4 = 6371.01 * (Math.acos
						((Math.sin(x4Inradiens)*Math.sin(x1Inradiens)+
								Math.cos(x4Inradiens)*
								Math.cos(x1Inradiens)*Math.cos(y4Inradiens-y1Inradiens))));
				//connect Atlanta and Savannah to get two trtiangle 
				//so need to get the diatance between Atlanta and Savannah
				//distance between Savannah and Atlanta
				double d5 = 6371.01 * (Math.acos
						((Math.sin(x3Inradiens)*Math.sin(x1Inradiens)+
								Math.cos(x3Inradiens)*
								Math.cos(x1Inradiens)*Math.cos(y3Inradiens-y1Inradiens))));
				
				
		// in the triangle of Atlanta-Orlando-Savanah:
				// formula from exercise 2-19
			double 	s1=(d3+d4+d5)/2;
			 double area1= Math.pow(((s1-d3)*(s1-d4)*(s1-d5)), 0.5);
			 
			// in the triangle of Atlanta-charlotte-Savannah:
				
			double 	s2=(d1+d2+d5)/2;
			 double area2= Math.pow(((s2-d1)*(s2-d2)*(s2-d5)), 0.5);
			 
			 // total area is the area of two triangle
			 double totalArea=area1+area2;
			 
			 System.out.printf("The area surround by those four city is:%f"+" km^2", totalArea);
			 // actually I am not sure about the unit  is the km^2 or not
			 
			 
		

	}

}
