package looping;

import java.util.Scanner;

public class _13_SumOfTheFactorsForGivenNumber {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();//6
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		System.out.println("sum of the factor = " + sum);
	}

}
