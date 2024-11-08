package looping;

import java.util.Scanner;

public class _01_CheckGivenNumberIsEvenOrNOt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();//10
		if (num % 2 == 0) {
			System.out.println(num + " is a even number");
		} else
			System.out.println(num + " is not a even number");
	}

}
