package basiccoreprograms;

import java.util.Scanner;

public class Poweroftwo {
	public static void main(String[] args) {
		System.out.println("Enter the power of 2");
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N < 0 || N > 32) {
			System.out.println("Please enter in between 1 to 31");
		}else {
			System.out.println(Math.pow(2, N));
	}
		sc.close();
	}
		
	}

