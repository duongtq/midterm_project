import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order
{
	// Private field
	private int qtyOrdered;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private String dateOrdered;
	
	// Number of orders processed successfully
	private static int nbOrders = 0;
	
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERS = 5;
	
	// Order Constructor for Order class
	// this method will set dateOrdered as the current date-time
	Order()
	{
		if ( Order.nbOrders == MAX_LIMITED_ORDERS)
		{
			System.out.println("Maximum orders reached. Can not add more orders.");
			return;
		}
		
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss dd-MM-yyyy");
		String strDate = dateFormat.format(date);
		this.dateOrdered = strDate;
		Order.nbOrders = Order.nbOrders + 1;
		
		System.out.println("The order has been created.");
	}
	
	// Setters and Getters
	public String getDateOrdered()
	{
		return this.dateOrdered;
	}
	
	public void setDateOrdered(String dateOrdered)
	{
		this.dateOrdered = dateOrdered;
	}
	
	public int getQtyOrdered()
	{
		return qtyOrdered;
	}
	
	public void setQtyOrdered(int qtyOrdered)
	{
		this.qtyOrdered = qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc)
	{
		if ( this.qtyOrdered == MAX_NUMBER_ORDERED )
		{
			System.out.println("The order is full.");
			return;
		}
		
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered = qtyOrdered + 1;
		System.out.println("The disc has been added.");
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc)
	{
		if ( this.qtyOrdered == 0)
		{
			System.out.println("The list is empty.");
			return;
		}
		else
		{
			for ( int i = 0; i < this.qtyOrdered; i++)
			{
				if ( itemsOrdered[i] == disc )
				{
					itemsOrdered[i] = null;
					System.out.println("The item has been removed.");
				}
			}
		}
	}
	
	public float totalCost()
	{
		float totalCost = 0;
		for ( int i = 0; i < this.qtyOrdered; i++ )
		{
			if ( itemsOrdered[i] == null )
			{
				continue;
			}
			totalCost = totalCost + itemsOrdered[i].getCost();
		}
		return totalCost;
	}
	
	public void printAllMovie()
	{
		for ( DigitalVideoDisc x : this.itemsOrdered )
		{
			if ( x == null )
			{
				continue;
			}
			System.out.println(x.getTitle());
		}
	}
	
	// Overload addDigitalVideoDisc
	public void addDigitalVideoDisc(DigitalVideoDisc [] disc)
	{
		if ( disc.length > MAX_NUMBER_ORDERED)
		{
			System.out.println("Maximum orders reached. Can not add more items.\n");
			this.itemsOrdered = disc;
			return;
		}
		else
		{
			System.out.println("Disc array added.");
		}
	}
	
	public void printInfo(DigitalVideoDisc disc)
	{
		System.out.println(disc.getTitle());
		System.out.println(disc.getDirector());
		System.out.println(disc.getCategory());
		System.out.println(disc.getLength());
		System.out.println(disc.getCost());
		System.out.println();
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2)
	{
		if ( this.qtyOrdered == MAX_NUMBER_ORDERED )
		{
			System.out.println("\nThe list is full. Can not add more items.");
			System.out.println("Items out of order: ");
			printInfo(disc1);
			printInfo(disc2);
		}
		else if ( this.qtyOrdered > MAX_NUMBER_ORDERED )
		{
			System.out.println("The order is already full.");
			return;
		}
		else
		{
			itemsOrdered[qtyOrdered] = disc1;
			qtyOrdered = qtyOrdered + 1;
			itemsOrdered[qtyOrdered] = disc2;
			qtyOrdered = qtyOrdered + 1;
			System.out.println("The discs have been added.");
			
			if ( qtyOrdered == MAX_NUMBER_ORDERED )
			{
				System.out.println("The list is full. Can not add more items.");
			}
		}
	}
	
	public void addDigitalVideoDisc(int numberOfDiscs)
	{
		if ( numberOfDiscs > MAX_NUMBER_ORDERED )
		{
			System.out.println("The list is full.");
		}
	}
	
	public void printWithFormat()
	{
		int number = this.itemsOrdered.length;
		System.out.println("Date: " + this.getDateOrdered());
		System.out.println("Ordered Items: ");
		
		for ( int i = 0; i < number; i++ )
		{
			if ( itemsOrdered[i] == null )
			{
				continue;
			}
			System.out.print((i + 1) + ".DVD  ");
			System.out.printf("%-20s  %-20s  %-20s  %-20d  %-20.2f\n", itemsOrdered[i].getTitle(), itemsOrdered[i].getCategory(),
					itemsOrdered[i].getDirector(), itemsOrdered[i].getLength(), itemsOrdered[i].getCost());
		}
	}
}