package basiccoreprograms;

import java.util.Scanner;

public class FlipCoin {
	static int headCounter;
	static int tailCounter;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many times you want to flip coin?");

		int counter = sc.nextInt();
		sc.close();
		if (counter <= 0) {
			System.out.println("Invalid input number ");
		} else {
			FlipCoin fc = new FlipCoin();
			fc.flipCoin(counter);

			double headPercentage = ((double) headCounter / counter) * 100;
			double tailPercentage = ((double) tailCounter / counter) * 100;

			System.out.println("Head Count Percentage : " + headPercentage + "\nTail Count Percentage : " + tailPercentage);
		}
	}

	public void flipCoin(int cnt) {
		headCounter = 0;
		tailCounter = 0;
		for (int i = 0; i < cnt; i++) {
			double result = Math.random();

			if (result < 0.5) {
				tailCounter++;
			} else {
				headCounter++;
			}
		}
	}

}

