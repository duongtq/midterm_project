package hust.soict.ictglobal;
import hust.soict.ictglobal.aims.media.DigitalVideoDisc;
import hust.soict.ictglobal.aims.media.Media;
import hust.soict.ictglobal.order.Order;

import java.util.Scanner;

public class Aims {

	public static void main(String[] args)
	{
		String title        ;
		String category     ;
		float cost       = 0; 
		String director     ;
		int length       = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		int choice = -1;
		int bookOrDVD = -1;
		int id = -1;
		
		Order newOrder = new Order();
		
		while ( choice != 0 )
		{
			showMenu();
			System.out.print("Enter your choice: ");
			choice = keyboard.nextInt();
		
			switch( choice )
			{
				case 0:
					System.out.println("Goodbye. See you again!");
					break;
				case 1:
					
					System.out.println("Order created.");
					
					break;
				case 2:
					
					System.out.println("Enter: 1> to enter a book.");
					System.out.println("       2> to enter a DVD");
					
					bookOrDVD = keyboard.nextInt();
					
					switch ( bookOrDVD )
					{
						case 1:
											
							System.out.print("Enter cost: ");
							cost = keyboard.nextFloat();
							keyboard.nextLine();
							
							System.out.print("Enter category: ");
							category = keyboard.nextLine();
							
							System.out.print("Enter title: ");
							title = keyboard.nextLine();
							
							Media newBook = new Media(title, category, cost);
							newOrder.addMedia(newBook);
							
							break;
						case 2:
							
							System.out.print("Enter cost: ");
							cost = keyboard.nextFloat();
							keyboard.nextLine();
							
							System.out.print("Enter category: ");
							category = keyboard.nextLine();
							
							System.out.print("Enter length: ");
							length = keyboard.nextInt();
							keyboard.nextLine();
							
							System.out.print("Enter director: ");
							director = keyboard.nextLine();
							
							System.out.print("Enter title: ");
							title = keyboard.nextLine();
							
							DigitalVideoDisc newDisc = new DigitalVideoDisc(title, category, director, length, cost);
							
							newOrder.addMedia(newDisc);
							
							break;
					}
					// End of case 2
					break;
				case 3:
					
					System.out.print("Enter the id of item: ");
					
					id = keyboard.nextInt();
					
					newOrder.removeMedia(id);
					
					break;
				case 4:
					
					newOrder.printWithFormat();
					break;
			}
		}
		
		keyboard.close();
		
	}
	
	public static void showMenu()
	{
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
}
