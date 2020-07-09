package chapter4;

import java.util.Scanner;

public class Q4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.print("	Enter a　letter :");
		
		String letter = input.nextLine();
		
		char le = Character.toUpperCase(letter.charAt(0));
		if (le =='A'||le =='E'||le =='I'||le =='O'||le =='U' ) {
			System.out.printf("%s "+"is a vowel", letter);
		}
		else {
			System.out.printf("%s "+"is a consonant", letter);
		}
	
		
		

	}

}
