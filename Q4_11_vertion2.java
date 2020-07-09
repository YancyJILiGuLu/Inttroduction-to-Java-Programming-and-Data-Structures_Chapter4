package chapter4;

import java.util.Scanner;

public class Q4_11_vertion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("	Enter a decimal value (0 to 15)");
		int answer = input.nextInt();

		//char answer= input.nextLine().charAt(0);

		if(answer<=9 && answer >=0) {
			char ch = (char) (answer -0 +'0');
			System.out.println(ch);		
		}
		else if (answer>9) {			
				 char ch = (char) (answer -10+'A') ;
				System.out.println(ch);	
			}
			else  {
				System.out.println(answer +" is a invalued input");

			}
		}

	}


