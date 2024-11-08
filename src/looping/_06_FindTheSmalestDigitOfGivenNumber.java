package looping;

import java.util.Scanner;

public class _06_FindTheSmalestDigitOfGivenNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();//12345
		int min=n%10;
		while(n>0) {
			int d = n%10;
			if(d<min) {
				min=d;
			}
			n=n/10;
		}
		System.out.println("smalest digit is:"+min);
		

	}

}
