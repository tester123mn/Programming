package looping;

import java.util.Scanner;

public class CheckCharacterisUperOrlowerCaseOrSpecialCharecter {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one charater");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println("LowerCase");
		}else if(ch>='A' && ch<='Z') {
			System.out.println("UpperCase");
		}else if(ch>='0' && ch<='9') {
			System.out.println("Number");
		}else
			System.out.println("Spacial Cahracter");
	}

}
