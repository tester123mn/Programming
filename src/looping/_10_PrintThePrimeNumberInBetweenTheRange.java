package looping;

import java.util.Scanner;

public class _10_PrintThePrimeNumberInBetweenTheRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start nember");
		int sta = sc.nextInt();//1
		System.out.println("Enter end nember");
		int end = sc.nextInt();//10
		System.out.println("Prime numbers are");
		
		for (int i = sta; i < end; i++) {
			int count = 0;
			// int num = i;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println(i);
			}
		}
	}
}
