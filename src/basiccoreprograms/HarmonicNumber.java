package basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {
	static double res = 0.0;
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		sc.close();
		
		if(user>0) 
		{
			System.out.println("The Harmonic Series is" );
			HarmonicNumber hm = new HarmonicNumber();
			hm.Har(user);
			
			
		}else 
		{
			System.out.println("Please Enter the valid Input");
		}
	}
	
	public void Har(int har) 
	{
		for(int i = 1;i<=har;i++) 
		{
			res = res+(double)1/i;
			System.out.println(res );
		}
		
	}
}

