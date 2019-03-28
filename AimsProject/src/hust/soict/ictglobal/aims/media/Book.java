package hust.soict.ictglobal.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book extends Media implements Comparable<Object>
{

	private ArrayList<String> authors = new ArrayList<String>();
	private String content;
	private List<String> contentTokens;
	private Map<String, Integer> wordFrequency;
	
	public void processContent()
	{
		 String[] result = this.content.split("[\\p{Punct}\\s]+");
		 
		 Arrays.sort(result);
		 
		 this.contentTokens = Arrays.asList(result);
		 
		 this.wordFrequency = new HashMap<>();
		 for (String s : this.contentTokens )
		 {
			 Integer count = this.wordFrequency.get(s);
			 if (count == null)
			 {
				 count = 0;
			 }
			 
			 this.wordFrequency.put(s, count + 1);
		 }
	}
	
	@Override
	public String toString()
	{
		System.out.println("The number of words: " + this.contentTokens.size() );
		System.out.printf("%-15s %-10s\n", "Word list", "Frequency");
		for ( Map.Entry<String, Integer> entry : wordFrequency.entrySet() )
		{
			System.out.printf("%-15s %-10d\n", entry.getKey(), entry.getValue());
		}
		return "OK";
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	public String getContent()
	{
		return this.content;
	}
	
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

	@Override
	public int compareTo(Object o)
	{
		Book book = (Book) o;
		
		if ( this.getTitle().compareToIgnoreCase(book.getTitle()) > 0 )
		{
			return 1;
		}
		else if (  this.getTitle().compareToIgnoreCase(book.getTitle()) < 0)
		{
			return -1;
		}
		return 0;
	}
}
