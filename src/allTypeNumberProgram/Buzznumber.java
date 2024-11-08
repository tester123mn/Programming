package allTypeNumberProgram;

import java.util.Scanner;

public class Buzznumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();//7,14,17,28
		int b = num % 10;

		if (b == 7 || num % 7 == 0) {
			System.out.println("it is a buzz number");
		} else {
			System.out.println("it is not a buzz number");
		}
	}

}
