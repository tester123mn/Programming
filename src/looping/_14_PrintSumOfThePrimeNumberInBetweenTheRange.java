package looping;

import java.util.Scanner;

public class _14_PrintSumOfThePrimeNumberInBetweenTheRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start nember");
		int st = sc.nextInt();//1
		System.out.println("Enter end nember");
		int end = sc.nextInt();//10
		System.out.print("Sum of prime numbers is : ");
		int sum = 0;

		for (int i = st; i < end; i++) {
			int count = 0;
			// int num = i;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				sum += i;
			}
		}
		System.out.print(sum);

	}

}
