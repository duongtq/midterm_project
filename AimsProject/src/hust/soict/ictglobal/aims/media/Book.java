package hust.soict.ictglobal.aims.media;

import java.util.ArrayList;

public class Book extends Media
{

	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book()
	{
		
	}
	
	// Constructor 1 with a call to Media constructor
	public Book(String title)
	{
		super(title);
	}
	
	public Book(String title, String category)
	{
		super(title, category);
	}
	
	public Book(String title, String category, float cost)
	{
		super(title, category);
		this.cost = cost;
	}
	
	public Book(String title, String category, ArrayList<String> authors)
	{
		super(title, category);
		this.authors = authors;
	}
	
	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName)
	{
		for ( int i = 0; i < this.getAuthors().size(); i++ )
		{
			if ( authorName == this.getAuthors().get(i) )
			{
				System.out.println("Author is already in the list.");
				return;
			}
		}
		
		this.getAuthors().add(authorName);
	}
	
	public void removeAuthor(String authorName)
	{
		int remove_index = 0;
		boolean isPresent = false;
		for ( int i = 0; i < this.getAuthors().size(); i++ )
		{
			if ( authorName == this.getAuthors().get(i) )
			{
				isPresent = true;
	
				remove_index = i;
				
				break;
			}
		}
		
		if ( isPresent == true )
		{
			this.getAuthors().remove(remove_index);
		}
	}
}
