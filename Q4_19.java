package chapter4;

import java.util.Scanner;

public class Q4_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the first 9 digits of an ISBN as  a string:");
		String number =  input.nextLine();
        int	digit1=number.charAt(0)-'0';
        int	digit2=number.charAt(1)-'0';
        
        int	digit3=number.charAt(2)-'0';
        
        int	digit4=number.charAt(3)-'0';
        
        int	digit5=number.charAt(4)-'0';
        
        int	digit6=number.charAt(5)-'0';
        
        int	digit7=number.charAt(6)-'0';
        
        int	digit8=number.charAt(7)-'0';
        
        int	digit9=number.charAt(8)-'0';
        
		int dogit10 =(digit1*1+digit2*2+digit3*3+digit4*4+digit5*5+digit6*6+digit7*7+digit8*8+digit9*9)%11;
		if (dogit10==10)
		System.out.printf("The ISBN-10 number is:%d%d%d%d%d%d%d%d%d%s",
				digit1,digit2,digit3,digit4,digit5,digit6,digit7,digit8,digit9,"x");
		else 
			System.out.printf("The ISBN-10 number is:%d%d%d%d%d%d%d%d%d%d",
					digit1,digit2,digit3,digit4,digit5,digit6,digit7,digit8,digit9,dogit10);
			

	}

}
