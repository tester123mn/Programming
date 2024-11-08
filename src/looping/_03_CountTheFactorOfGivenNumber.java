
package looping;

import java.util.Scanner;

public class _03_CountTheFactorOfGivenNumber {

	public static void main(String[] args) {

		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();//6
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		System.out.println("Factors = " + count);
	}

}
