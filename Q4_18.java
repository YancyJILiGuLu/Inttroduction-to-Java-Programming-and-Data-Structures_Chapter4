package chapter4;

import java.util.Scanner;

public class Q4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.print("	Enter two characters:");

		String letter = input.nextLine();

		char le1 = Character.toUpperCase(letter.charAt(0));
		String answer1="";
		String answer2="";

		if (le1 =='M' ) {
			answer1="Mathematics";

		}
		else  if (le1 =='C' ) {
			answer1="Computer Science";
		}
		else if (le1 =='I' ) {
			answer1="Information Technology";
		}
		else 
			System.out.print("Invalid input");

		char le2 = Character.toUpperCase(letter.charAt(1));
		if (le2 =='1' ) {
			answer2="Freshman";

		}
		else  if (le2 =='2' ) {
			answer2="Sofomore";
		}
		else if (le2 =='3' ) {
			answer2="Junior";
		}
		else  if (le2 =='4' ) {
			answer2="SEnior";
		}
		else 
			System.out.print("Invalid input");
		System.out.println(answer1+" " +answer2);

	}

}


