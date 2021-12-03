package basiccoreprograms;

import java.util.Scanner;

public class VowelOrConsonant {
public static void main(String[] args) {
		
		System.out.println("Enter the charcter");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.close();
		
		if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') 
		{
			System.out.println(ch+ "Is vowel");
		}else 
		{
			System.out.println(ch+"Is consonant");
		}
	}
}

