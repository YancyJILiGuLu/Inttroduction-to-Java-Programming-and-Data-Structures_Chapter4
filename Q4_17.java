package chapter4;

import java.util.Scanner;

public class Q4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		Scanner input2= new Scanner(System.in);
		System.out.print("Enter a　year :");	
		int year = input.nextInt();
		
		System.out.print("Enter a　month:");	
		String month = input2.nextLine();

		boolean isLeapYear= (year %4 ==0 && year %100 ==0)|| (year %400==0);

		if(isLeapYear=true && month.equals("Feb") ) {
			System.out.printf("%s has "+" 28 days",month);		
		}
		else if((isLeapYear==false && month.equals("Jan"))|| (isLeapYear==false && month.equals("Mar"))||
				( isLeapYear==false &&month.equals("May"))||(isLeapYear==false && month.equals("Jul"))||
				(isLeapYear==false && month.equals("Aug"))||(isLeapYear==false && month.equals("Oct"))
				||(isLeapYear==false && month.equals("Dec"))){
			System.out.printf("%s has "+" 31 days",month);
		}
		else if ((isLeapYear==false && month.equals("Feb"))||(isLeapYear==false &&month.equals("Apr"))
				||(isLeapYear==false && month.equals("Jun"))||(isLeapYear==false && month.equals("Sep"))||
				( isLeapYear==false && month.equals("Nov"))){
			System.out.printf("%s has "+" 30 days",month);
		}
		else {
			System.out.printf("%s is not a corrct month name",month);
		}







	}

}
