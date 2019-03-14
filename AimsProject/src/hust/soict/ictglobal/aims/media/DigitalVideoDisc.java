package hust.soict.ictglobal.aims.media;

public class DigitalVideoDisc extends Media
{
	private String director;
	private int length;
	// Constructors
	// By title
	public DigitalVideoDisc(String title)
	{
		super(title);
	}
	
	// By category and title
	public DigitalVideoDisc(String title, String category)
	{
		super(title, category);
	}
	
	// By title, category and director's name
	public DigitalVideoDisc(String title, String category, String director)
	{
		super(title, category);
		this.director = director;
	}
	
	// By all attributes
	public DigitalVideoDisc(String title, String category, String director, int length, float cost)
	{
		super(title, category, cost);
		this.director = director;
		this.length   = length;
	}
	
	public String getDirector() {
		return this.director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return this.length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean search(String title)
	{
		if ( this.getTitle().toLowerCase().contains(title.toLowerCase()) )
		{
			return true;
		}
		return false;
	}
	
}