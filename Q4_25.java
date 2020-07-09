package chapter4;

import java.util.Scanner;

public class Q4_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		char characters1= (char) (65+ Math.random()*(90-65+1));
		char characters2= (char) (65+ Math.random()*(90-65+1));
		char characters3= (char) (65+ Math.random()*(90-65+1));
		int characters4= (int) ((Math.random()*(10000))+(Math.random()*(1000))+(Math.random()*(100)+Math.random()*(10)));

		System.out.printf("%s %s %s %d", characters1,characters2,characters3,characters4);
	}

}
