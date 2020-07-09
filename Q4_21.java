package chapter4;

import java.util.Scanner;

public class Q4_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter t  a string:");
		String s =  input.nextLine();
		
		if (s.charAt(3)!='-' && s.charAt(6)!='-') {
			System.out.printf("%s is an invalid security number", s);
		}
			else {
				System.out.printf("%s is a valid security number", s);
				
		}
	}

}
