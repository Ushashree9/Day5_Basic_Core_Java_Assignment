package basiccoreprograms;

import java.util.Scanner;

public class QuotiendAndRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dividend number: ");
		int num1 = sc.nextInt(); 
		System.out.println("Enter the Divisor number: ");
		int num2 = sc.nextInt(); 
		findQuotientRemainder(num1, num2);
	}

	static void findQuotientRemainder(int num1, int num2) {
		int quotient = num1 / num2;
		int remainder = num1 % num2;

		System.out.println("quotient:" + num1 + " and divisor " + num2 + " is " + quotient);
		System.out.println("Remainder:"  + num1 + " and divisor " + num2 + " is" + remainder);
	}
}

