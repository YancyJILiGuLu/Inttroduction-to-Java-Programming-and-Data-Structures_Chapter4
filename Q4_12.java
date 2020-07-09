package chapter4;

import java.util.Scanner;

public class Q4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("	Enter a　hex digit :");
		String number = input.nextLine();
		
		if (number.length()!=1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}
		int value =0;
		
		char ch = Character.toUpperCase(number.charAt(0));
		if('A'<= ch && ch <= 'F') {
			 value = ch -'A'+10;
		}
		else if (Character.isDigit(ch)){
			 value = ch;
		}
		
		else {
			System.out.print("Invalid input");
			System.exit(0);
		}
		int resultDidit4 =value%2;
		int remainding =value/2;
		int resultDigit3=remainding%2;
		remainding=remainding/2;
		int resultDigit2=remainding%2;
		int resultDigit1=remainding/2;
		
		System.out.printf("%d"+"%d"+"%d"+"%d",resultDigit1,resultDigit2,resultDigit3,resultDidit4);
		

	}

}
