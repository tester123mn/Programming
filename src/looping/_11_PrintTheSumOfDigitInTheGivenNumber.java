
package looping;

import java.util.Scanner;

public class _11_PrintTheSumOfDigitInTheGivenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();//123
		int sum = 0;
		while (num > 0) {
			int a = num % 10;
			sum += a;
			num /= 10;
		}
		System.out.println("Sum of digit is: " + sum);
	}

}
