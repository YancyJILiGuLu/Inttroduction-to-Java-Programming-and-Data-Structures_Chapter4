package chapter4;

import java.util.Scanner;

public class Q4_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter t  a string:");
		String s =  input.nextLine();
        int	lengthOfs=s.length();
        char ch =s.charAt(0);
        System.out.printf("The length of this sting is : %d\n",lengthOfs);
        System.out.printf("The first character of this sting is : %s\n",ch);
	}

}
