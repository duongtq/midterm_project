package hust.soict.ictglobal;

import hust.soict.ictglobal.aims.media.Book;
import hust.soict.ictglobal.aims.media.Media;

public class TestGetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Media book1 = new Book("Two days", "Comedy", 4.5f);
		
		System.out.println(book1.getId());
		
		Media book2 = new Book("Two days", "Comedy", 4.5f);
		
		System.out.println(book2.getId());
		
		Media book3 = new Book("Two days", "Comedy", 4.5f);
		
		System.out.println(book3.getId());
	}

}
