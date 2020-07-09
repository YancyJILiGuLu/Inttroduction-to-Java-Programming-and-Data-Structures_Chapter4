package chapter4;

import java.util.Scanner;

public class Q4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("	Enter a decimal value (0 to 15)");
		String answer = input.nextLine();

		//char answer= input.nextLine().charAt(0);

		if(answer.length()==1) {
			System.out.println(answer);		
		}
		else if (answer.length()==2) {
			char ch = answer.charAt(1);
			if (ch >= '0' && ch <= '5' ) {
				char value = (char) (ch -'0'+'A') ;
				System.out.println(value);	

			}
			else  {
				System.out.println(answer +" is a invalued input");

			}
		}

	}
}