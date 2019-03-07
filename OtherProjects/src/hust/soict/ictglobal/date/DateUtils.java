package hust.soict.ictglobal.date;

public class DateUtils {

	public static int DateCompare(MyDate date1, MyDate date2)
	{
		// if years are identical
		if ( date1.getYear() == date2.getYear() )
		{
			// if months are identical
			if ( date1.getMonth() == date2.getMonth() )
			{
				// if days are identical
				if ( date1.getDay() == date2.getDay() )
				{
					return 0; // two dates are identical
				}
				else if ( date1.getDay() < date2.getDay() )
				{
					return -1; // date1 is before date2
				}
				else
				{
					return 1; // date1 is after date2
				}
			}
			else if ( date1.getMonth() < date2.getMonth() )
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
		else if ( date1.getYear() < date2.getYear() )
		{
			return -1;
		}
		return 1;
	}
	
	public static void SwapDate(MyDate date1, MyDate date2)
	{
		MyDate temp = new MyDate();
		
		// set date2 attributes to temp
		temp.setDay(date2.getDay());
		temp.setMonth(date2.getMonth());
		temp.setYear(date2.getYear());
		
		date2.setDay(date1.getDay());
		date2.setMonth(date1.getMonth());
		date2.setYear(date1.getYear());
		
		date1.setDay(temp.getDay());
		date1.setMonth(temp.getMonth());
		date1.setYear(temp.getYear());
	}
	
	public static void SortDate(MyDate[] dateArray)
	{
		int i;
		int j;
		
		for ( i = 0; i < dateArray.length - 1; i++ )
		{
			int min = i;
			
			for ( j = i + 1; j < dateArray.length; j++ )
			{
				// date1 after date2
				if ( DateCompare(dateArray[min], dateArray[j]) == 1  )
				{
					min = j;
				}
			}
			
			SwapDate(dateArray[i], dateArray[min]);
		}
	}
	
	public static void printDateArray(MyDate[] date)
	{
		int i;
		for ( i = 0; i < date.length; i++ )
		{
			System.out.print("Date " + i + ": ");
			date[i].print();
		}
	}
}
