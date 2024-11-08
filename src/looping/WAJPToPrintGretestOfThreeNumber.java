package looping;

import java.util.Scanner;

public class WAJPToPrintGretestOfThreeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = a > b && a > c ? a : b > c ? b : c;
		System.out.println(max);
	}

}
