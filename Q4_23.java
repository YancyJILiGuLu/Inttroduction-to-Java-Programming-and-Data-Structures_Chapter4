package chapter4;

import java.util.Scanner;

public class Q4_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter employee's name: :");	
		String name = input.nextLine();
		
		System.out.print("Enter number of hours worked in a week:");	
		int hours = input.nextInt();
		System.out.print("Enter hours pay rate:");	
		int rate = input.nextInt();
		
		System.out.print("Enter federal tax withholding rate:");	
		int federalTax = input.nextInt();
		System.out.print("Enter state tax withholding rate:");	
		int stateTax = input.nextInt();
		
		System.out.printf(" Employee Name %s",name);
		System.out.printf(" Hours Worked %d",hours);
		System.out.printf(" Pay Rate %d",rate);
		System.out.printf(" Gross Pay %d",(hours*rate));
		System.out.printf("Deductions : ");
		System.out.printf( "Federal withholding (20%): %d" ,((hours*rate)*federalTax));
		System.out.printf( "State withholding (9.0%): %d" ,((hours*rate)*stateTax));
		System.out.printf( "Total Decuction: %d" ,((hours*rate)*federalTax)+((hours*rate)*stateTax));
		System.out.printf( "Net pay: %d" ,((hours*rate)-((hours*rate)*0.2)+((hours*rate)*stateTax)));
		
		
		
		
		

	}

}
