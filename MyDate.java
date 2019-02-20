import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyDate
{
	SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
	LocalDate currentDate = LocalDate.now();
	
	Scanner keyboard = new Scanner(System.in);
	private int day;
	private int month;
	private int year;
	
	public MyDate()
	{
		super();
		this.day   = currentDate.getDayOfMonth();
		this.month = currentDate.getMonthValue();
		this.year  = currentDate.getYear();
	}
	
	public MyDate(int day, int month, int year)
	{
		super();
		this.day   = day;
		this.month = month;
		this.year  = year;
	}
	
	public MyDate(String date) // format MMM dd yyyy
	{
		super();
		Date myDate = null;
		try
		{
			myDate = formatter.parse(date);
		}
		catch (java.text.ParseException e)
		{
			System.err.println("Could not parse date: " + date);
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(myDate);
		
		this.day   = cal.get(Calendar.DAY_OF_MONTH);
		this.month = cal.get(Calendar.MONTH) + 1;
		this.year  = cal.get(Calendar.YEAR);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if ( day >= 1 && day <= 31)
		{
			this.day = day;
		}
		else
		{
			System.out.println("Invalid day: " + day);
			return;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if ( month >= 1 && month <= 12 )
		{
			this.month = month;
		}
		else
		{
			System.out.println("Invalid month: " + month);
			return;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if ( year > 0 )
		{
			this.year = year;
		}
		else
		{
			System.out.println("Invalid year: " + year);
			return;
		}
	}
	
	public void accept()
	{
		System.out.print("Enter the date with format dd MM YYYY: ");
		String inputDate = keyboard.nextLine();
		
		Date myDate = null;
		try
		{
			myDate = formatter.parse(inputDate);
		}
		catch (java.text.ParseException e)
		{
			System.err.println("Could not parse date: " + inputDate);
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(myDate);
		
		if ( cal.get(Calendar.DAY_OF_MONTH) < 1 || cal.get(Calendar.DAY_OF_MONTH) > 31)
		{
			System.out.println("The day you enter was invalid.");
			return;
		}
		else
		{
			this.day   = cal.get(Calendar.DAY_OF_MONTH);
		}
		
		if ( cal.get(Calendar.MONTH) < 0 || cal.get(Calendar.MONTH) > 12 )
		{
			System.out.println("The month you enter was invalid.");
			return;
		}
		else
		{
			this.month = cal.get(Calendar.MONTH) + 1;
		}
		
		if ( cal.get(Calendar.YEAR) < 0 )
		{
			System.out.println("The month you enter was invalid.");
			return;
		}
		else
		{
			this.year  = cal.get(Calendar.YEAR);
		}
	}
	
	public void print()
	{
		System.out.println(this.day + " " + this.month + " " + this.year);
	}
}
