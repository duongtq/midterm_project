public class DateTest {

	public static void main(String[] args)
	{	
		MyDate date1 = new MyDate();
		System.out.print("Date1: ");
		date1.print();
		
		
		MyDate date2 = new MyDate(9, 3, 1998);
		System.out.print("Date2: ");
		date2.print();
		
		MyDate date3 = new MyDate("31 12 1998");
		System.out.print("Date3: ");
		date3.print();
		
		MyDate date4 = new MyDate();
		System.out.print("Date4: ");
		date4.print();
		
		date1.setDay(90);
		date1.setMonth(14);
		
		date2.setYear(1);
		date2.setDay(40);
		
		date4.accept();
		System.out.print("New Date4: ");
		date4.print();
	}
}