package functionalprograms;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the point X");
		int x = sc.nextInt();
		System.out.println("Enter the point Y");
		int y = sc.nextInt();

		double d = Math.sqrt((x * x) + (y * y));

		System.out.println("Euclidean Distance= " + d);
	}
}


