package looping;

public class CurrencyCalculator {

	public static void main(String[] args) {

		int total=5300;
		int m2000=total/2000;
		System.out.println("2000="+m2000);
		total=total%2000;
		int m500=total/500;
		System.out.println("500="+m500);
		total=total%500;
		int m200=total/200;
		System.out.println("200="+m200);
		total=total%200;
		int m100=total/100;
		System.out.println("100="+m100);
		
		
	}

}
