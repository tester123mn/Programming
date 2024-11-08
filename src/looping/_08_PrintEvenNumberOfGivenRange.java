package looping;

import java.util.Scanner;

public class _08_PrintEvenNumberOfGivenRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your starting number");
		int st = sc.nextInt();//1
		System.out.println("Enter your ending number");
		int end = sc.nextInt();//10
		System.out.println("Even numbers are");
		for (int i = st; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
