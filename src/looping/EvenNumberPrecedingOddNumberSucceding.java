package looping;

import java.util.Scanner;

public class EvenNumberPrecedingOddNumberSucceding {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		if(num>0 && num%2==0) {
			System.out.println((num+2)+" "+(num+4)+" "+(num+6));
		}else if(num<0 && num%2!=0) {
			System.out.println((num-2)+" "+(num-4)+" "+(num-6));
		}else
			System.out.println("No outpur");
	}

}
