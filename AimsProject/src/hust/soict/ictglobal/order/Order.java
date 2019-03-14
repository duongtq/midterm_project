package hust.soict.ictglobal.order;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import hust.soict.ictglobal.aims.media.*;

public class Order
{
	private String dateOrdered;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	// Number of orders processed successfully
	private static int nbOrders = 0;
	
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERS = 5;
	
	// Order Constructor for Order class
	// this method will set dateOrdered as the current date-time
	public Order()
	{
		if ( Order.nbOrders == MAX_LIMITED_ORDERS )
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
	
	public float totalCost()
	{
		float totalCost = 0;
		for ( int i = 0; i < this.getItemsOrdered().size(); i++ )
		{
			if ( this.getItemsOrdered().get(i) == null )
			{
				continue;
			}
			totalCost = totalCost + this.getItemsOrdered().get(i).getCost();
		}
		return totalCost;
	}
	
	public void printAllItem()
	{
		for ( int i = 0; i < this.getItemsOrdered().size(); i++ )
		{
			if ( this.getItemsOrdered().get(i) == null )
			{
				continue;
			}
			System.out.println(this.getItemsOrdered().get(i).getTitle());
		}
	}
	
	public void printInfo(Media media)
	{
		System.out.println(media.getTitle());
//		System.out.println( ( (DigitalVideoDisc) media ).getDirector() );
		System.out.println(media.getCategory());
//		System.out.println(( (DigitalVideoDisc) media ).getLength());
		System.out.println(media.getCost());
		System.out.println();
	}
	
	public void printWithFormat()
	{
		int number = this.getItemsOrdered().size();
		System.out.println("Date: " + this.getDateOrdered());
		System.out.println("Ordered Items: ");
		
		System.out.printf("%s %-40s %-20s %-20s\n",
				"No", "Title", "Category", "Price(USD)"); 
		for ( int i = 0; i < number; i++ )
		{
			if ( this.itemsOrdered.get(i) == null )
			{
				continue;
			}
			System.out.print((i + 1) + "  ");
			System.out.printf("%-40s %-20s %-20.2f\n",
					itemsOrdered.get(i).getTitle(), 
					itemsOrdered.get(i).getCategory(),
					itemsOrdered.get(i).getCost());
			
		}
		System.out.printf("\nTotal cost: %.2f\n\n", this.totalCost());
	}
	public void getALuckyItem()
	{
		int lucky_number = (int)(Math.random() * ( this.getItemsOrdered().size()) + 0);
		
		for ( int i = 0; i < getItemsOrdered().size(); i++ )
		{
			if ( i == lucky_number )
			{
				getItemsOrdered().get(i).setCost(0.0f);
				getItemsOrdered().get(i).setTitle(getItemsOrdered().get(i).getTitle() + " (lucky item)");
				
				System.out.println("Your lucky item: ");
				printInfo(getItemsOrdered().get(i));
			}	
		}
	}
	
	public void addMedia(Media media)
	{
		this.itemsOrdered.add(media);		
	}
	
	public void removeMedia(int id)
	{
		this.itemsOrdered.remove(id);
	}
	
}