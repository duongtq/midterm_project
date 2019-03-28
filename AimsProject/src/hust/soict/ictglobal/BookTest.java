package hust.soict.ictglobal;

import hust.soict.ictglobal.aims.media.Book;

public class BookTest {

	public static void main(String[] args)
	{
		String thePoemOfTheRings = 
				"Three Rings for the Elven-kings under the sky,\n" +
				"Seven for the Dwarf-lords in their halls of stone,\n" +
				"Nine for Mortal Men doomed to die,\n" +
				"One for the Dark Lord on his dark throne\n" +
				"In the Land of Mordor where the Shadows lie.\n" +
				"One Ring to rule them all, One Ring to find them,\n" +
				"One Ring to bring them all and in the darkness bind them\n" +
				"In the Land of Mordor where the Shadows lie.\n";
		Book book1 = new Book();
		
		book1.setTitle("The Lord of the Rings");
		book1.addAuthor("J.R.R Tolkien");
		
		book1.setContent(thePoemOfTheRings);
		
		book1.processContent();
		
		System.out.println("Title: " + book1.getTitle());
		System.out.println("Author: " + book1.getAuthors());
		System.out.println("\nBook content:");
		System.out.println(book1.getContent());
		
		book1.toString();
	}

}
