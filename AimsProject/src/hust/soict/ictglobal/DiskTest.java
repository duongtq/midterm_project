package hust.soict.ictglobal;

import hust.soict.ictglobal.aims.media.DigitalVideoDisc;
import hust.soict.ictglobal.order.*;
import java.util.Scanner;;

public class DiskTest {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		// TODO Auto-generated method stub
		Order newOrder = new Order();
		
		DigitalVideoDisc dvd1 = 
		new DigitalVideoDisc("Star Wars", "Sci-fi", "George Lucas", 170, 21.98f );
		
		DigitalVideoDisc dvd2 = 
		new DigitalVideoDisc("Transformers", "Sci-fi", "Micheal Bay", 180, 18.48f );
		
		DigitalVideoDisc dvd3 = 
		new DigitalVideoDisc("The Protector", "Action", "Tran Duong", 160, 20.24f);
		
		DigitalVideoDisc dvd4 = 
		new DigitalVideoDisc("Two days in New York", "Comedy", "Tran Duong", 140, 16.22f);
		
		newOrder.addMedia(dvd1);
		newOrder.addMedia(dvd2);
		newOrder.addMedia(dvd3);
		newOrder.addMedia(dvd4);
		
		System.out.println("Congratulations! You are a lucky customer today.");
		System.out.println("We will give you a free DVD as a present.");
		System.out.println("Thank you for your trust.");
		
		newOrder.getALuckyItem();
		
//		System.out.printf("Your total cost: %.2f", newOrder.totalCost() );
		
		System.out.println("Your receipt: ");
		
		newOrder.printWithFormat();
		
		System.out.print("Enter a title to check: ");
		
		String title = keyboard.nextLine();
		
		for ( int i = 0; i < newOrder.getItemsOrdered().size(); i++ )
		{
			if ( ((DigitalVideoDisc) newOrder.getItemsOrdered().get(i)).search(title) == true )
			{
				System.out.println("Search result: "
						+ newOrder.getItemsOrdered().get(i).getTitle() );
				keyboard.close();
				return;
			}
		}
		System.out.println("No result with your search: " + title);
		
		keyboard.close();
	}
}
