package month_and_day;

import java.util.Scanner;

public class MonthDay
{
	static Scanner keyboard = new Scanner(System.in);

	public static int isLeapYear(int year)
	{
		if ( ( (year % 4 == 0) && (year % 100!= 0) ) || (year%400 == 0) )
		{
			return 1;
		}
		return 0;
	}
	
	public static void displayDay(int month, int year)
	{
		int day = 0;
		if ( month == 4 || month == 6 || month == 9 || month == 11)
		{
			day = 30;
			System.out.println("Month: " + month + " " + day + " days.");
		}
		else
		{
			if ( month == 2 )
			{
				if ( isLeapYear(year) == 1)
				{
					day = 29;
					System.out.println("Month: " + month + " " + day + " days.");
					return;
				}
				else
				{
					day = 28;
					System.out.println("Month: " + month + " " + day + " days.");
					return;
				}
			}
			day = 31;
			System.out.println("Month: " + month + " " + day + " days.");
		}
	}
	
	public static void main(String args[])
	{	
		System.out.print("Enter month: ");
		int month = keyboard.nextInt();
		
		while ( month < 1 || month > 12 )
		{
			System.out.print("Invalid month. Please re-enter: ");
			month = keyboard.nextInt();
		}
		
		System.out.print("Enter year: ");
		int year = keyboard.nextInt();
		
		while ( year < 0 )
		{
			System.out.print("Invalid year. Please re-enter: ");
			year = keyboard.nextInt();
			keyboard.nextLine();
		}
		
		displayDay(month, year);
	
	}
}