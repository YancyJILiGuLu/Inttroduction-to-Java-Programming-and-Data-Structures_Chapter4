package chapter4;

import java.util.Scanner;

public class Q4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter t  a string s1:");
		String s1 =  input.nextLine();
		System.out.print("Enter t  a string s2:");
		String s2 =  input.nextLine();
		
		boolean isOrNot = s1.contains(s2);
		
		
		if (isOrNot == true ) {
			System.out.printf("%s is a substring of %s", s2,s1);
		}
		else {
			System.out.printf("%s is not a substring of %s", s2,s1);
		}
		
		

	}

}
