public class DateTest {

	public static void main(String[] args)
	{	
		MyDate date1 = new MyDate();
		System.out.print("Date1: ");
		date1.print();
		
		MyDate date2 = new MyDate(9, 3, 1998);
		System.out.print("Date2: ");
		date2.print();
		
		MyDate date3 = new MyDate("31/12/2008");
		System.out.print("Date3: ");
		date3.print();
		
		MyDate date4 = new MyDate();
		System.out.print("Date4: ");
		date4.print();
		
		date1.setDay(90);
		date1.setMonth(14);
		
		date2.setYear(1);
		date2.setDay(40);
		
//		date4.accept();
		System.out.print("New Date4: ");
		date4.print();
		
		
		MyDate date5 = new MyDate();
		
		date5.setDay("9");
		date5.setMonth("December");
		date5.setYear("2001");
		date5.print();
		
		// Test DateUtils class
		// Firstly, test method DateCompare()
		MyDate dateTest1 = new MyDate(11, 1, 1998);
		MyDate dateTest2 = new MyDate(12, 1, 1998);
		
		if ( DateUtils.DateCompare(dateTest1, dateTest2) == 1 )
		{
			dateTest1.print();
			System.out.print("is after ");
			dateTest2.print();
			System.out.println();
		}
		else if ( DateUtils.DateCompare(dateTest1, dateTest2) == -1 )
		{
			dateTest1.print();
			System.out.print("is before ");
			dateTest2.print();
			System.out.println();
		}
		else
		{
			dateTest1.print();
			System.out.print(" is equal to ");
			dateTest2.print();
			System.out.println();
		}
		
		// Second, test method SortDate()
		// Test case 1
		MyDate Date1 = new MyDate(1, 2, 1975);
		MyDate Date2 = new MyDate(27, 1, 1975);
		MyDate Date3 = new MyDate(30, 4, 1975);
		MyDate Date4 = new MyDate(5, 9, 1975);
		MyDate Date5 = new MyDate(9, 3, 1975);
		
		
		MyDate[] dateArray1 = {Date1, Date2, Date3, Date4, Date5};
		
		System.out.println("\nBefore sorting: ");
		DateUtils.printDateArray(dateArray1);
		DateUtils.SortDate(dateArray1);
		System.out.println("After sorting: ");
		DateUtils.printDateArray(dateArray1);
		
		// Test case 2
		MyDate Date6 = new MyDate(2, 2, 1995);
		MyDate Date7 = new MyDate(27, 6, 1981);
		MyDate Date8 = new MyDate(30, 5, 2100);
		MyDate Date9 = new MyDate(5, 7, 2015);
		MyDate Date10 = new MyDate(10, 4, 2000);
		
		MyDate[] dateArray2 = {Date6, Date7, Date8, Date9, Date10};
		
		System.out.println("\nBefore sorting: ");
		DateUtils.printDateArray(dateArray2);
		DateUtils.SortDate(dateArray2);
		System.out.println("After sorting: ");
		DateUtils.printDateArray(dateArray2);
		
	}
}