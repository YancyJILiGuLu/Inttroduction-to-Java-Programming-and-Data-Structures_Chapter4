package chapter4;

import java.util.Scanner;

public class Q4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("	Enter a　letter :");
		
		String letter = input.nextLine();
		
		char le = Character.toUpperCase(letter.charAt(0));
		
		if (le =='A' ||le =='B' ||le =='C') {
			System.out.printf("The numeric value for grade %s "+"is 2", letter);
		}
		else  if (le =='D' ||le =='E' ||le =='F') {
			System.out.printf("The numeric value for grade %s "+"is 3", letter);
		}
		else if (le =='G' ||le =='H' ||le =='I' ) {
			System.out.printf("The numeric value for grade %s "+"is 4", letter);
		}
		else if(le =='J' ||le =='K' ||le =='L' ) {
			System.out.printf("The numeric value for grade %s "+"is 4", letter);
		}
		else if(le =='M' ||le =='N' ||le =='O' ) {
			System.out.printf("The numeric value for grade %s "+"is 6", letter);
		}
		else  if (le =='P' ||le =='Q' ||le =='R'|| le=='S') {
			System.out.printf("The numeric value for grade %s "+"is 7", letter);
		}
		else if (le =='T' ||le =='U' ||le =='V' ) {
			System.out.printf("The numeric value for grade %s "+"is 8", letter);
		}
		else if(le =='W' ||le =='X' ||le =='Y' ||le=='Z') {
			System.out.printf("The numeric value for grade %s "+"is 9", letter);
		}
		else 
			System.out.print("Invalid input");
	}

	}


