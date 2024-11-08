package looping;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 35;
		int count = 0;

		 if(n<=1)count++;
		// for (int i = 2; i < n; i++) {
		for (int i = 2; i <= n /2; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0)
			System.out.println(n + " is prime number");
		else
			System.out.println(n + " is not prime number");

	}

}
