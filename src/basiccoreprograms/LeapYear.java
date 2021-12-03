package basiccoreprograms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner scyear = new Scanner(System.in);
		
		int year = scyear.nextInt();
		scyear.close();
		
		if (year>=1000 && year<=9999) {
			LeapYear ly = new LeapYear();
			ly.leapyear(year);
			
			
		} else {
			System.out.println("Invalid Input");
		}
	}
	public void leapyear(int year) {
		if (( year % 4 == 0 && year %100 != 0 ) || year % 400 ==0 ) {
			System.out.println("Year" + year + "is leapyear");
		}else {
			System.out.println("It's not the leap year");
		}
	}
}

