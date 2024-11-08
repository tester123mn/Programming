package looping;

import java.util.Scanner;

public class _12_SumOfEvenNumberGivenRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your starting number");
		int st = sc.nextInt();//1
		System.out.println("Enter your ending number");
		int end = sc.nextInt();//10

		int sum = 0;
		for (int i = st; i <= end; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("sum of the even number = "+sum);
	}

}
