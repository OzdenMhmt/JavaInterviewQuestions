package JavaInterviewQuestions;

import java.time.LocalDate;
import java.util.Scanner;

public class Java_11_LeapYear {

	public static void main(String[] args) {
		
		//Find Leap Year
		
		
		int year = 1900;
		boolean leap = false;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leap = true;
				}else {
					leap = false;
				}
			}else {
				leap = true;
			}
		} else {
			leap = false;
		}
		
		if(leap) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
		
		// now su an ki tarihi verir.
		// new keyword u kullanilmaz..
 
		//2.way
		Scanner sc = new Scanner(System.in);
		System.out.print("Tarih giriniz : ");
		int a=sc.nextInt();
		LocalDate date = LocalDate.of(a, 11, 15);
		System.out.println(date.isLeapYear());
		
		sc.close();

	}

}
