package chapter4;

import java.util.Scanner;

public class Q4_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount:");
		String amount = input.nextLine();
		int x=amount.indexOf('.');


		String numberOfDollors=amount.substring(0,x);
		String remainingAmount = amount.substring(x+1);

		int remainingAmountInInt=Integer.valueOf(remainingAmount);


		int numberOfQuarters=remainingAmountInInt/25;
		int remainingAmountIndouble = remainingAmountInInt%25;
		
		int numberOfDimes=remainingAmountIndouble/10;
		remainingAmountIndouble  = remainingAmountInInt%10;

		
		int numberOfNickles=remainingAmountIndouble/5;
		remainingAmountIndouble = remainingAmountIndouble%5;
		
		

		int numberOfPennies=remainingAmountIndouble;

		System.out.println("Your amount :"+ amount +" consists of ");
		System.out.println("" +  numberOfDollors +" dollars");
		System.out.println("" + numberOfQuarters +" quarters");
		System.out.println("" + numberOfDimes+" dimes");
		System.out.println("" + numberOfNickles+" nickles");
		System.out.println("" + numberOfPennies+" pennies");

	}

}
