package allTypeNumberProgram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your nember");
		int num = sc.nextInt();// 6,28
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		if (sum == num) {
			System.out.println(num + " is a perfect number");
		} else
			System.out.println(num + " is not a perfect number");

	}

}
