package allTypeNumberProgram;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();//123,
		int b=num;
		int sum = 0;
		int mul = 1;
		while (num > 0) {
			int a = num % 10;
			sum += a;
			mul *= a;
			num /= 10;
		}
		System.out.println(sum);
		System.out.println(mul);
		if (sum == mul) {
			System.out.println(b + " is a spy number.");
		} else
			System.out.println(b + " is not a spy number");
	}

}
