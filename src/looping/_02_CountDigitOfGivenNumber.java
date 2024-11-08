package looping;

import java.util.Scanner;

public class _02_CountDigitOfGivenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();//1234
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		System.out.println("Total digit = "+count);
	}

}
