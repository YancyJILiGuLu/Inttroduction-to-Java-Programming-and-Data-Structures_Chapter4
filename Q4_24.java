package chapter4;

import java.util.Scanner;

public class Q4_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the first city:");	
		String firstCity = input.nextLine();
		System.out.print("Enter the second city:");	
		String secondCity = input.nextLine();
		System.out.print("Enter the third city:");	
		String thirdCity = input.nextLine();
		
		if(firstCity.compareTo(secondCity)<0 && secondCity.compareTo(thirdCity)<0) {		
				System.out.println("The cities in alphabetic order are:"+
				firstCity+" "+secondCity + " "+ thirdCity);	
			}
			else if(firstCity.compareTo(thirdCity)<0 ||thirdCity.compareTo(secondCity)<0){
				System.out.println("The cities in alphabetic order are:"+
						firstCity+" "+thirdCity + " "+ secondCity);
		}
			else if(secondCity.compareTo(thirdCity)<0 || thirdCity.compareTo(firstCity)<0){
			
				System.out.println("The cities in alphabetic order are:"+
						secondCity+" "+thirdCity + " "+ firstCity);
			}
			else  if(secondCity.compareTo(firstCity)<0 || firstCity.compareTo(thirdCity)<0){
				System.out.println("The cities in alphabetic order are:"+
						secondCity+" "+firstCity + " "+ thirdCity);
		}
			
			else if(thirdCity.compareTo(firstCity)<0 ||firstCity.compareTo(secondCity)<0 ) {
		
				System.out.println("The cities in alphabetic order are:"+
						thirdCity+" "+firstCity + " "+ secondCity);
			}
			else if(thirdCity.compareTo(secondCity)<0 ||secondCity.compareTo(firstCity)<0 ) {
				System.out.println("The cities in alphabetic order are:"+
						thirdCity+" "+secondCity + " "+ firstCity);
		}
			else 
				System.out.print("Invalid inout");
		

	}

}
