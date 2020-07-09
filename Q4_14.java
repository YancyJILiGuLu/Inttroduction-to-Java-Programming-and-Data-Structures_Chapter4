package chapter4;

import java.util.Scanner;

public class Q4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.print("	Enter a　letter grade:");
		
		String letter = input.nextLine();
		
		char le = Character.toUpperCase(letter.charAt(0));
		
		if (le =='A' ) {
			System.out.printf("The numeric value for grade %s "+"is 1", letter);
		}
		else  if (le =='B' ) {
			System.out.printf("The numeric value for grade %s "+"is 2", letter);
		}
		else if (le =='C' ) {
			System.out.printf("The numeric value for grade %s "+"is 3", letter);
		}
		else if(le =='D' ) {
			System.out.printf("The numeric value for grade %s "+"is 4", letter);
		}
		else 
			System.out.print("Invalid input");
	}

}
