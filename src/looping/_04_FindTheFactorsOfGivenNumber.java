package looping;

import java.util.Scanner;

public class _04_FindTheFactorsOfGivenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();//5
		System.out.println("Factors are");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}

		}
	}

}
