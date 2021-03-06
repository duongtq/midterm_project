package hust.soict.ictglobal;
import hust.soict.ictglobal.aims.media.Book;
import hust.soict.ictglobal.aims.media.CompactDisc;
import hust.soict.ictglobal.aims.media.DigitalVideoDisc;
import hust.soict.ictglobal.aims.media.Media;
import hust.soict.ictglobal.aims.media.Track;
import hust.soict.ictglobal.order.Order;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Aims {

	public static void main(String[] args)
	{
		String title        ;
		String category     ;
		float cost       = 0; 
		String director     ;
		int length       = 0;
		String artist       ;
		int numberOfCDs  = 0;
		String trackName    ;
		int trackLength  = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		int choice = -1;
		int bookOrDVDOrCD = -1;
		int id = -1;
		
		Order newOrder = new Order();
		
		CompactDisc newCD = new CompactDisc();
		
		char toPlay = 'y';
		
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
					newOrder = new Order();
					break;
				case 2:
					System.out.println("Enter: 1> to enter a Book.");
					System.out.println("       2> to enter a DVD");
					System.out.println("       3> to enter a CD");
					bookOrDVDOrCD = keyboard.nextInt();
					while ( bookOrDVDOrCD != 1 && bookOrDVDOrCD != 2 && bookOrDVDOrCD != 3)
					{
						System.out.println("Invalid operation.");
						System.out.print("Please choose the valid operation: ");
						bookOrDVDOrCD = keyboard.nextInt();
					}
					switch ( bookOrDVDOrCD )
					{
						case 1:
							System.out.print("Enter cost: ");
							cost = keyboard.nextFloat();
							keyboard.nextLine();
							
							System.out.print("Enter category: ");
							category = keyboard.nextLine();
							
							System.out.print("Enter title: ");
							title = keyboard.nextLine();
							
							Media newBook = new Book(title, category, cost);
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
							System.out.print("Do you want to play " + newDisc.getTitle() + "?: ");
							toPlay = keyboard.next().charAt(0);
							
							if ( toPlay == 'y' )
							{
								newDisc.play();
							}
							newOrder.addMedia(newDisc);
							break;
						case 3:
							System.out.print("Enter the artist's name: ");
							artist = keyboard.nextLine();
							newCD.setArtist(artist);
							keyboard.nextLine();
							
							System.out.print("Enter name of CD: ");
							
							title = keyboard.nextLine();
							
							newCD.setTitle(title);
							
							System.out.print("Enter the number of tracks in " + newCD.getTitle() + ": ");
							
							numberOfCDs = keyboard.nextInt();
							
							for ( int i = 0; i < numberOfCDs; i++ )
							{
								Track track = new Track();
								
								System.out.println("Track " + (i + 1) + ":");
								
								System.out.print("Enter track length: ");
								
								trackLength = keyboard.nextInt();
								keyboard.nextLine();
								
								System.out.print("Enter track name: ");
								
								trackName = keyboard.nextLine();
								track.setTitle(trackName);
							
								track.setLength(trackLength);
								
								System.out.print("Do you want to play " + track.getTitle() + "?:(y/n) ");
								
								toPlay = keyboard.next().charAt(0);
								
								if ( toPlay == 'y')
								{
									track.play();
								}
								
								newCD.addTrack(track);
							}
							newOrder.addMedia(newCD);
							break;
					}
					// End of case 2
					break;
				case 3:
					System.out.print("Enter the id of item (start from 0): ");
					id = keyboard.nextInt();
					
					newOrder.removeMedia(id);
					break;
				case 4:			
					newOrder.printWithFormat();
					break;
			}
		}
		keyboard.close();
		
		MemoryDaemon memoryDaemon = new MemoryDaemon();
		
		Thread newThread = new Thread(memoryDaemon);
		
		newThread.setDaemon(true);
		
		newThread.start();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);		

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);		
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);

		Collection<DigitalVideoDisc> collection = new java.util.ArrayList<DigitalVideoDisc>();		
		collection.add(dvd2);
		collection.add(dvd1);
		collection.add(dvd3);
		
		Iterator<DigitalVideoDisc> iterator = collection.iterator();
		System.out.println("--------------------------------------");
		System.out.println("The DVDs currently in the order are: ");
			
		while ( iterator.hasNext() )
		{
			System.out.println( iterator.next().getTitle() );
		}
		
		// Sort the collection of DVDs - based on compareTo() method
		
		java.util.Collections.sort((java.util.List<DigitalVideoDisc>)collection);
		
		iterator = collection.iterator();
		
		System.out.println("--------------------------------------");
		System.out.println("The DVDs in sorted order are: ");
		while ( iterator.hasNext() )
		{
			System.out.println( iterator.next().getTitle() );
		}
		System.out.println("--------------------------------------");

		CompactDisc cd1 = new CompactDisc();
		CompactDisc cd2 = new CompactDisc();
		CompactDisc cd3 = new CompactDisc();
		
		cd1.setTitle("SK da realest");
		cd2.setTitle("The best of GVR");
		cd3.setTitle("Ngay Tan");
		
		Track track1 = new Track();
		track1.setTitle("Chua bao gio");
		track1.setLength(240);
		
		Track track2 = new Track();
		track2.setTitle("The Good Die Young");
		track2.setLength(312);
		
		Track track3 = new Track();
		track3.setTitle("Rewind");
		track3.setLength(280);
		
		Track track4 = new Track();
		track4.setTitle("Fan cua tao");
		track4.setLength(220);
		
		cd1.addTrack(track1);
		cd1.addTrack(track4);
		
		cd2.addTrack(track4);
		cd2.addTrack(track3);
		cd2.addTrack(track2);
		
		cd3.addTrack(track3);
		cd3.addTrack(track2);
		
		List<CompactDisc> discs = new ArrayList<CompactDisc>();
		
		discs.add(cd1);
		discs.add(cd2);
		discs.add(cd3);
		
		Iterator<CompactDisc> listIterator = discs.iterator();
		System.out.println("--------------------------------------");
		System.out.println("The DVDs currently in the order are: ");
			
		while ( listIterator.hasNext() )
		{
			System.out.println( listIterator.next().getTitle() );
		}
		
		// Sort the collection of CompactDisc - based on compareTo() method
		java.util.Collections.sort((java.util.List<CompactDisc>)discs);
		
		listIterator = discs.iterator();
		
		System.out.println("--------------------------------------");
		System.out.println("The DVDs in sorted order are: ");
		while ( listIterator.hasNext() )
		{
			System.out.println( listIterator.next().getTitle() );
		}
		System.out.println("--------------------------------------");
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