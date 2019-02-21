
public class Order
{
	// Private field
	private int qtyOrdered;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	public static final int MAX_NUMBER_ORDERED = 10;
	
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
	
	public void printAllMovie(Order order)
	{
		for ( DigitalVideoDisc x : order.itemsOrdered )
		{
			if ( x == null )
			{
				continue;
			}
			System.out.println(x.getTitle());
		}
		
	}
}