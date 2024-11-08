package allTypeNumberProgram;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your nember");
		int num = sc.nextInt();//2,3,5,7
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(num+" is a prime number");
		} else
			System.out.println(num+" is not a prime number");

	}
	

}
