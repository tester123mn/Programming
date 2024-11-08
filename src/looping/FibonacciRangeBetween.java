package looping;

public class FibonacciRangeBetween {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int n = 20;
		System.out.print(a + "," + b);
		for (;; ) {
			int c = a + b;
			if (c > n)
				break;
			System.out.print("," + c);
			a = b;
			b = c;
		}
	}

}
