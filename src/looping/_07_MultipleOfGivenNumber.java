package looping;

import java.util.Scanner;

public class _07_MultipleOfGivenNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();//123
		int mul = 1;
		while (n > 1) {
			int a = n % 10;
			mul = mul * a;
			n = n / 10;
		}
		System.out.println("Multiple = "+mul);
	}

}
